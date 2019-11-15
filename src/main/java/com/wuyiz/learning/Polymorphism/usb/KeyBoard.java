package com.wuyiz.learning.Polymorphism.usb;

/**
 * @ClassName keyBoard
 * @Description: 键盘实现USB接口方法
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("键盘输入");
    }
}
