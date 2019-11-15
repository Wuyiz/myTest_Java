package com.wuyiz.learning.Polymorphism.usb;

/**
 * @InterfaceName USB
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public interface USB {
    public abstract void open();    //打开设备
    public abstract void close();   //关闭设备
}
