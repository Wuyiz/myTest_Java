package com.wuyiz.learning.Net.TCPThreadPool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @ClassName UpLoadServerRunnable
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/15 
 * @Version V1.0
 **/
public class UpLoadServerRunnable implements Runnable {
    private Socket socket;

    public UpLoadServerRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //3.使用Socket对象中的getInputStream()获取网络字节输出流InputStream对象
            InputStream inputStream = socket.getInputStream();
            //4.判断服务器硬盘文件夹是否存在，不存在则创建
            File file = new File(
                    "src\\main\\resources\\FileUpLoadServerDisk");
            if (!file.exists()) {
                file.mkdirs();
            }

            /**
             * 自定义一个文件的命名规则：防止被同名文件覆盖
             * 规则：域名+时间+随机数
             */
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            String fileName = "FileUpLoad_" + time + new Random().nextInt(999999) + ".png";

            //5.创建本地字节输出流FileOutputStream对象，绑定输出的文件地址
            FileOutputStream fileOutputStream = new FileOutputStream(file + file.separator + fileName);
            //6.使用网络字节输入流InputStream对象中的read()读取客户端上传的文件
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = inputStream.read(bytes)) != -1) {
                //7.使用本地字节输入流FileOutputStream对象中的write()，将读取到的文件写入到服务器硬盘中
                fileOutputStream.write(bytes, 0, len);
            }
            //8.使用Socket对象中的getOutputStream()，获取到网络字节输出流OutputStream对象
            //9.使用网络字节输出流OutputStream对象中的write()，给客户端回写“上传成功”
            socket.getOutputStream().write("我是服务器：上传成功".getBytes());

            System.out.println("服务器硬盘地址 => " + file);

            //10.释放资源(FileOutputStream, Socket, ServerSocket)
            fileOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
