package com.wuyiz.learning.Net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP通信的文件上传案例
 * 原理：客户端读取本地文件，上传文件到服务器端，服务器把上传的文件再保存到服务器硬盘上
 *
 * 明确：
 *      数据源：E:\Files\图片\赞.png
 *      目的地：服务器
 *
 * 实现步骤：
 *      1.客户端使用本地字节输入流，读取需要上传的文件
 *      2.客户端使用网络字节输出流，上传读取到的文件到服务器端
 *      3.服务器使用网络字节输入流，读取客户端上传的文件
 *      4.服务器使用本地字节输出流，把读取到的文件保存在服务器的硬盘中
 *      5.服务器使用网络字节输出流。返回“上传成功”给客户端
 *      6.客户端使用网络字节输入流，读取服务器端回写的数据
 **/
public class FileUpLoadClient {
    public static void main(String[] args) throws IOException {
        //1.创建本地字节输入流FileInputStream对象，绑定数据源
        FileInputStream fileInputStream = new FileInputStream("E:\\Files\\图片\\赞.png");
        //2.创建客户端Socket对象，绑定IP地址和端口
        Socket socket = new Socket("127.0.0.1",8888);

        //3.使用Socket中的getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //4.创建本地字节输入流FileInputStream对象中的read()，读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes))!=-1){
            //5.使用网络字节输出流OutputStream对象中的write()，把读取到的文件上传到服务器
            outputStream.write(bytes,0,len);
        }

        /**
         * 由于服务器端不能读到-1，程序会进入阻塞状态，需要给服务器添加结束标记
         * void shutdownOutput​() 禁用此套接字的输出流
         *      对于TCP套接字，任何先前写入的数据将被发送，随后是TCP的正常连接终止序列
         */
        socket.shutdownOutput();

        //6.使用Socket中的getInputStream()获取网络字节输出流InputStream对象
        InputStream inputStream = socket.getInputStream();
        //7.使用网络字节输入流InputStream对象中的read()读取服务回写的数据
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        //8.释放资源(FileInputStream, Socket)
        fileInputStream.close();
        socket.close();
    }
}
