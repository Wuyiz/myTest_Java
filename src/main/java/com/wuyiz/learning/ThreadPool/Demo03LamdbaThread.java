package com.wuyiz.learning.ThreadPool;

/**
 * @ClassName Demo03Lamdba
 * @Description: 使用lambda表达式实现多线程（函数式编程）
 *               Lambda表达式的标准格式：
 *                  1.一些参数
 *                  2.一个箭头
 *                  3.一段代码
 *
 *               格式：
 *                  (参数列表)->{一些重写方法的代码};
 *
 *               格式说明：
 *                  ()：接口中抽象方法的参数列表，没有参数就空着，有参数则写出参数，多个参数用逗号分隔
 *                  ->：传递的意思，将参数传递给方法体{}
 *                  {}：重写接口的抽象方法的方法体
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
public class Demo03LamdbaThread {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程的创建
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            }
        }).start();

        //使用lambda表达式实现多线程
        new Thread(() -> {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        }).start();

        //优化lambda  可推导
        new Thread(() -> System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName())).start();
    }
}
