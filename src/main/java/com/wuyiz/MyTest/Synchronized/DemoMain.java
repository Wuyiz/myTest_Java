package com.wuyiz.MyTest.Synchronized;

/**
 * @ClassName DemoMain
 * @Description: 测试类：创建包子对象；    创建包子铺线程，开启生产包子；     创建吃货线程，开启吃包子
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
public class DemoMain {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi baozi = new BaoZi();
        //创建包子铺线程
        new BaoZiPu(baozi).start();
        //创建吃货线程
        new ChiHuo(baozi).start();
    }
}
