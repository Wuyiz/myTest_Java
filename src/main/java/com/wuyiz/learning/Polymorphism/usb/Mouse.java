package com.wuyiz.learning.Polymorphism.usb;

/**
 * @ClassName Mouse
 * @Description: 鼠标实现USB接口方法
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}
