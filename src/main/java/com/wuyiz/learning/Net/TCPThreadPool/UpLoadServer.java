package com.wuyiz.learning.Net.TCPThreadPool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName UpLoadServer
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/15 
 * @Version V1.0
 **/
public class UpLoadServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务器ServerSocket对象，和系统指定的端口号相同
        ServerSocket serverSocket = new ServerSocket(8888);

        //把服务器监听放进死循环中实现不间断监听(accept)
        while(true){
            Socket socket = serverSocket.accept();
//            new Thread(new UpLoadServerRunnable(socket)).start();
            ThreadPoolUtils.execute(new UpLoadServerRunnable(socket));
        }
    }
}
