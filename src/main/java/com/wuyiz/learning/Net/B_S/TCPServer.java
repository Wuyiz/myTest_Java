package com.wuyiz.learning.Net.B_S;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建BS版本的TCP服务器
 **/
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器ServerSocket对象和系统指定的端口号
        ServerSocket serve = new ServerSocket(8080);
        //2.使用ServerSocket对象中的accept()获取发送请求的客户端对象Socket
        Socket socket = serve.accept();
        //3.使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
        InputStream inputStream = socket.getInputStream();

        /*//4.使用网络字节输出流InputStream()对象中的read()，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));*/

        //把InputStream网络字节输入流对象，转换为字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        //把客户端请求信息的第一行读取出来  GET /myTest/web/index.html HTTP/1.1
        String line = br.readLine();
        //切割字符串，只要中间的地址部分   /myTest/web/index.html
        String[] str = line.split(" ");
        //把路径前边的 “ / ” 去掉，进行截取
        String htmlPath = str[1].replace("/myTest", ".");


//        File file = new File(htmlPath);
//        if (!file.exists()) {
//            System.out.println(htmlPath+"不存在");
//        }


        //创建一个本地字节输入流，绑定html路径
        FileInputStream fileInputStream = new FileInputStream(htmlPath);
        //使用Socket中的getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();

        //写入HTTP协议响应头内容，固定写法
        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
        outputStream.write("Content-Type:text/html\r\n".getBytes());
        //必须要写入空行，否则浏览器不解析
        outputStream.write("\r\n".getBytes());

        //一读一写复制文件，把服务器读取的html文件回写到客户端
        //4.使用网络字节输出流InputStream()对象中的read()，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = fileInputStream.read(bytes);
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
//        System.out.println(new String(bytes, 0, len));
        fileInputStream.close();
        socket.close();
        serve.close();
    }
}
