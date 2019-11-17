package com.wuyiz.learning.Lambda;

/**
 * @ClassName Demo03Calculator
 * @Description: 需求：
 *                  给定计算器Calculator接口，内涵抽象方法Calcu()可以讲两个int相加得到和值
 *                  使用lambda表达式调用invokeCalcu()，完成120和130的相加计算
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
public class Demo03Calculator {
    public static void main(String[] args) {
        System.out.print("匿名内部类：");
        invokeCalcu(10, 20, new Calculator() {
            @Override
            public int Calcu(int x, int y) {
                return x + y;
            }
        });

        System.out.print("Lambda表达式：");
        invokeCalcu(120, 130, (a, b) -> a + b);

    }

    public static void invokeCalcu(int x, int y, Calculator calculator) {
        int sum = calculator.Calcu(x, y);
        System.out.println("sum = " + sum);
    }
}
