package com.wuyiz.learning.Polymorphism.usb;

/**
 * @ClassName computer
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Computer {
    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    //使用USB设备的方法，用接口作为方法的参数
    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse)usb;
            mouse.click();
        } else if (usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.type();
        }
        usb.close();
    }
}
