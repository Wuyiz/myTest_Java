package com.wuyiz.learning.Net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * 文件上传案例的服务器端：读取客户端上传的文件，保存在服务器硬盘中，给客户端回写“上传成功”
 *
 * 明确：
 *      数据源：客户端上传的文件
 *      目的地：服务器硬盘   E:\Files\Development\Java\myTest\src\main\resources
 *
 * 实现步骤：
 *      1.创建一个服务器ServerSocket对象，和系统指定的端口号相同
 *      2.使用ServerSocket对象中的accept()，获取到发送请求的客户端的Socket对象
 *      3.使用Socket对象中的getInputStream()获取网络字节输出流InputStream对象
 *      4.判断服务器硬盘文件夹是否存在，不存在则创建
 *      5.创建本地字节输出流FileOutputStream对象，绑定输出的文件地址
 *      6.使用网络字节输入流InputStream对象中的read()读取客户端上传的文件
 *      7.使用本地字节输入流FileOutputStream对象中的write()，将读取到的文件写入到服务器硬盘中
 *      8.使用Socket对象中的getOutputStream()，获取到网络字节输出流OutputStream对象
 *      9.使用网络字节输出流OutputStream对象中的write()，给客户端回写“上传成功”
 *      10.释放资源(FileOutputStream, Socket, ServerSocket)
 **/
public class FileUpLoadServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务器ServerSocket对象，和系统指定的端口号相同
        ServerSocket serverSocket = new ServerSocket(8888);

        //把服务器监听放进死循环中实现不间断监听(accept)
        while(true){
            //2.使用ServerSocket对象中的accept()，获取到发送请求的客户端的Socket对象
            Socket socket = serverSocket.accept();

            /**
             * 使用多线程技术，提高服务器效率
             * 只要有一个客户端上传文件，就开启一个线程，完成文件的上传
             */
            new Thread(()->{
                try {
                    //3.使用Socket对象中的getInputStream()获取网络字节输出流InputStream对象
                    InputStream inputStream = socket.getInputStream();
                    //4.判断服务器硬盘文件夹是否存在，不存在则创建
                    File file = new File(
                            "E:\\Files\\Development\\Java\\myTest\\src\\main\\resources\\FileUpLoadServerDisk");
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
            }).start();

        }
//        serverSocket.close();     //循环监听程序，可以不关闭服务器Socket
    }
}
