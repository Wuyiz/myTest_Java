package com.wuyiz.learning.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池：JDK1.5之后提供的
 * java.util.concurrent.Executors ：线程池的工厂类，用来生成线程池
 * Executors类中的静态方法：
 *      static ExecutorService newFixedThreadPool​(int nThreads) 创建一个线程池，该线程池重用固定数量的从共享无界队列中运行的线程。
 *          参数：
 *              nThreads - 池中的线程数
 *          返回值：
 *              ExecutorsService接口，返回的是ExecutorsService接口的实现类对象，我们可以使用ExecutorsService接口接受（面向接口）
 *
 *      java.util.concurrent.ExecutorService ：线程池接口
 *          用来获取线程池中的线程，调用start()执行线程任务
 *              submit(Runnable task)：提交一个Runnable任务用于执行
 *          关闭/销毁线程池的方法：
 *              void shutdown()
 *      线程池的使用步骤
 *          1.使用线程池的工厂类Executors提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
 *          2.创建一个类，实现Runnable接口，重写run()，设置线程任务
 *          3.调用ExecutorService接口中的方法submit()，传递线程任务(实现类)，开启线程，执行run()
 *          4.调用ExecutorService接口中的方法shutdown()销毁线程池（不建议使用，线程池的存在就是为了重复利用）
 **/
public class Demo01FixedThreadPool {
    public static void main(String[] args) {
        //1.使用线程池的工厂类Executors提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //3.调用ExecutorService接口中的方法submit()，传递线程任务(实现类)，开启线程，执行run()
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        //4.调用ExecutorService接口中的方法shutdown()销毁线程池（不建议使用，线程池的存在就是为了重复利用）
        executorService.shutdown();

        //如果在销毁线程池后提交线程任务，会报错
        try {
            executorService.submit(new RunnableImpl());
        } catch (Exception e) {
            System.out.println("e.toString() = " + e.getMessage());
        }
    }
}
