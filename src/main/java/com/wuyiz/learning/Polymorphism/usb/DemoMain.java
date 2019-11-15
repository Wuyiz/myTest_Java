package com.wuyiz.learning.Polymorphism.usb;

/**
 * @ClassName DemoMain
 * @Description: 主入口方法
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        USB usbKeyBoard = new KeyBoard();
        computer.useDevice(usbKeyBoard);

        computer.powerOff();
    }
}
