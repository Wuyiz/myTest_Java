package com.wuyiz.learning.Lambda;

/**
 * @ClassName Demo01Cook
 * @Description: 需求：
 *                  给定一个厨子Cook接口，包含唯一抽象方法makeFood()，无参无返回值
 *                  使用Lambda的标准格式调用invokeCook方法，打印输出 “吃饭啦” 内容
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
public class Demo01Cook {
    public static void main(String[] args) {
        //调用invokeCook()，参数时Cook接口，传递接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("匿名内部类：吃饭了");
            }
        });

        //使用Lambda表达式
        invokeCook(()->{
            System.out.println("Lambda表达式：吃饭了");
        });
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
