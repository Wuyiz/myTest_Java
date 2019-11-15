package com.wuyiz.learning.Net.TCPThreadPool;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName UpLoadClient
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/15 
 * @Version V1.0
 **/
public class UpLoadClient {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 8888;
    private static final String PATH = "src\\main\\resources\\ClientFile" + File.separator;

    public static void main(String[] args) {
        List<String> fileName = new ArrayList<>();
        fileName.add("1.png");
        fileName.add("2.png");
        fileName.add("3.png");
        fileName.add("4.jpg");
        fileName.add("5.png");

        for (String s : fileName) {
            ThreadPoolUtils.execute(new UpLoadClientRunnable(HOST, PORT, PATH + s));
        }
    }
}
