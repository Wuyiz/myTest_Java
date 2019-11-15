package com.wuyiz.learning.Net.TCPThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadPoolUtils
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/15 
 * @Version V1.0
 **/
public class ThreadPoolUtils {
    private static ExecutorService threadPool = Executors.newCachedThreadPool();

    public static void execute(Runnable command){
        threadPool.execute(command);
    }
}
