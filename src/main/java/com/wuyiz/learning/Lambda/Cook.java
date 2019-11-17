package com.wuyiz.learning.Lambda;

/**
 * @InterfaceName Cook
 * @Description: 定义一个厨子Cook接口，包含唯一一个抽象方法makeFood()
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
@FunctionalInterface
public interface Cook {
    void makeFood();    //做饭
}
