package com.wuyiz.learning.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName Demo02SingleThreadExecutor
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
public class Demo02SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        MyRunnable myRunnable = new MyRunnable();

        for (int i = 0; i < 5; i++) {
            executorService.execute(myRunnable);
        }

        System.out.println("=======任务开始=======");
        executorService.shutdown();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
