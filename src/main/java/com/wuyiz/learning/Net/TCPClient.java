package com.wuyiz.learning.Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP通信的客户端：向服务器发送连接请求，读取服务器返回的数据
 *
 * 表示客户端的类：
 *      java.net.Scoket：此类实现客户端套接字（套接字是指两台机器间通信的端点）
 *      套接字：包含了Ip地址和端口号的网络单位
 *
 *  构造方法：
 *      Socket​(InetAddress address, int port)  创建流套接字并将其连接到指定主机上的指定端口号
 *      参数
 *          host - 主机名，或 null的环回地址
 *          port - 端口号
 *
 *   成员方法：
 *      OutputStream getOutputStream()     返回此套接字的输出流
 *      InputStream getInputStream()       返回此套接字的输入流
 *      void close()                       关闭此套接字
 *
 *   实现步骤：
 *      1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
 *      2.使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream对象
 *      3.使用网络字节输出流OutputStream()对象中的write()，给服务器发送数据
 *      4.使用Socket对象中的getInputStream()获取网络字节输入流对象InputStream对象
 *      5.使用网络字节输出流InputStream()对象中的read()，读取服务器回写的数据
 *      6.释放资源(Socket)
 *
 *   注意：
 *      1.客户端和服务器端进行交互，必须使用Socket中提供的网络流，不能使用自己创建的流对象
 *      2.当我们创建客户端对象Socket的时候，就回去请求服务器和服务器经过3次握手建立链接通路
 *          如果服务器没有启动，就会抛异常
 *          反之，交互继续
 **/
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //2.使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //3.使用网络字节输出流OutputStream()对象中的write()，给服务器发送数据
        outputStream.write("我是客户端：你好服务器！".getBytes());
        //4.使用Socket对象中的getInputStream()获取网络字节输入流对象InputStream对象
        InputStream inputStream = socket.getInputStream();
        //5.使用网络字节输出流InputStream()对象中的read()，读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
        //6.释放资源(Socket)
        socket.close();
    }
}
