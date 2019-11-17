package com.wuyiz.learning.MethodReference;

/**
 * @ClassName Demo03StaticMethodReference
 * @Description: 通过类名引用静态成员方法
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class Demo03StaticMethodReference {
    public static void main(String[] args) {
        int value = calcu(-10, (num) -> Math.abs(num));
        System.out.println("value =>" + value);

        value = calcu(-10, Math::abs);
        System.out.println("value = " + value);
    }

    public static int calcu(int number, Calcable calcable) {
        return calcable.calsAbs(number);
    }
}
