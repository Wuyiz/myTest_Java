package com.wuyiz.MyTest.Synchronized;

/**
 * 消费者（吃货）类：是一个线程类 extends Thread
 * 重写线程任务run()：吃包子
 *      对包子状态进行判断：
 *          false：吃货调用wait()进入等待状态
 *          true：吃货吃包子  吃货吃完包子  修改包子状态为false    吃货唤醒包子铺线程，开始继续生产包子
 **/
public class ChiHuo extends Thread {
    private BaoZi baozi;

    public ChiHuo(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baozi) {
                if (!baozi.isState()) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃包子，包子种类为 => " + baozi.getPi() + baozi.getXian());

                baozi.setState(false);
                baozi.notify();

                System.out.println("吃货已经把 " + baozi.getPi() + baozi.getXian() + " 的包子吃完了，请求包子铺开始重新下一批包子");
                System.out.println("===============================================================================================");
            }
        }
    }
}
