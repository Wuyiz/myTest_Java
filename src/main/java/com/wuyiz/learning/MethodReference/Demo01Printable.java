package com.wuyiz.learning.MethodReference;

/**
 * @ClassName Demo01Printable
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class Demo01Printable {
    public static void main(String[] args) {
        //Lambda：只关注目的，打印字符串
        printString(s-> System.out.println(s));

        //方法引用：对Lambda表达式优化
        printString(System.out::println);
    }

    public static void printString(Printable printable){
        printable.printf("Hello World");
    }
}
