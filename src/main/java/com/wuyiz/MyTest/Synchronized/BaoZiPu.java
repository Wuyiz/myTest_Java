package com.wuyiz.MyTest.Synchronized;

/**
 * 生产者（包子铺）类：是一个线程类，extends Thread
 * 重写run()：生产包子
 *      对包子状态进行判断：
 *          true：包子铺调用wait()进入等待状态
 *          false：包子铺开始生产两种不同皮和馅的包子     包子铺生产好了包子   修改包子的状态为true    唤醒吃货线程开始吃包子
 *
 *  注意：
 *      包子铺线程和包子线程关系 => 通信（互斥）
 *      必须同时同步技术保证两个线程只能有一个在执行
 *      锁对象必须保证唯一，可以使用包子对象作为锁对象
 *      包子铺类和吃货类需要把包子对象作为参数传递进来
 *          1，需要在成员位置创建一个包子变量
 *          2.使用带参数构造方法，为包子变量赋值
 **/
public class BaoZiPu extends Thread {
    private BaoZi baozi;

    public BaoZiPu(BaoZi baoZi) {
        this.baozi = baoZi;
    }

    @Override
    public void run() {
        int baoziType = 0;     //定义包子种类

        while (true) {
            synchronized (baozi) {
                if (baozi.isState()) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (baoziType % 2 == 0) {
                    baozi.setPi("薄皮");
                    baozi.setXian("三鲜馅");
                } else {
                    baozi.setPi("冰皮");
                    baozi.setXian("猪肉萝卜馅");
                }
                baoziType++;

                System.out.println("包子铺生产中,请等待3秒...\t正在生产的包子种类 => " + baozi.getPi() + baozi.getXian());
                try {
                    this.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                baozi.setState(true);
                baozi.notify();

                System.out.println("包子铺生产完成 => " + baozi.getPi() + baozi.getXian());
            }
        }
    }
}
