package com.wuyiz.learning.ThreadPool;

/**
 * @ClassName RunnableImpl
 * @Description: Runnable接口的实现类
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
