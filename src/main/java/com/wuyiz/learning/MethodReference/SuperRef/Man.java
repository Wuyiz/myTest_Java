package com.wuyiz.learning.MethodReference.SuperRef;

import java.lang.management.MemoryType;

/**
 * @ClassName Man
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class Man extends Human {
    public static void main(String[] args) {
        new Man().show();
    }

    @Override
    public void sayHello() {
        System.out.println("Hello,我是 Man");
    }

    //定义一个方法，传入一个Greetable接口参数
    public void method(Greetable greetable) {
        greetable.greet();
    }

    public void show() {
        /*method(() -> {
            //创建Human对象
            Human human = new Human();
            human.sayHello();
        });*/

//        method(() -> super.sayHello());

        //子父类关系存在且成员方法存在
        method(super::sayHello);
    }
}
