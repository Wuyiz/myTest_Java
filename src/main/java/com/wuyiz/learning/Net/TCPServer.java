package com.wuyiz.learning.Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信的服务器端：接收客户端的请求，读取客户端发送的数据，返回数据给客户端
 * 表示服务器的类：
 *      java.net.ServerSocket   这个类实现了服务器套接字
 *
 *  构造方法：
 *      ServerSocket​(int port) 创建绑定到指定端口的服务器套接字
 *
 *  服务器端必须要知道发送请求服务器的的客户端是哪个
 *  成员方法：
 *      Socket accept​() 侦听要连接到此套接字并接受它
 *
 *  服务器的实现步骤：
 *      1.创建服务器ServerSocket对象和系统指定的端口号
 *      2.使用ServerSocket对象中的accept()获取发送请求的客户端对象Socket
 *      3.使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
 *      4.使用网络字节输出流InputStream()对象中的read()，读取客户端发送的数据
 *      5.使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream对象
 *      6.使用网络字节输出流OutputStream()对象中的write()，给客户端回写数据
 *      7.释放资源(Socket，ServerSocket)
 **/
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器ServerSocket对象和系统指定的端口号
        ServerSocket serve = new ServerSocket(8888);
        //2.使用ServerSocket对象中的accept()获取发送请求的客户端对象Socket
        Socket socket = serve.accept();
        //3.使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
        InputStream inputStream = socket.getInputStream();
        //4.使用网络字节输出流InputStream()对象中的read()，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //5.使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //6.使用网络字节输出流OutputStream()对象中的write()，给客户端回写数据
        outputStream.write("我是服务器：收到，蟹蟹".getBytes());
        //7.释放资源(Socket，ServerSocket)
        socket.close();
        serve.close();
    }
}
