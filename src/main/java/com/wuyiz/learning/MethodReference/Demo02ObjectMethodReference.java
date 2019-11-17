package com.wuyiz.learning.MethodReference;

import java.lang.reflect.Method;

/**
 * @ClassName Demo02ObjectMethodReference
 * @Description: 通过对像名引用成员方法
 *               前提：
 *                      对象名是已经存在的，成员方法也是存在的
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class Demo02ObjectMethodReference {
    public static void main(String[] args) {
        printString(s->{
            //创建对象
            MethodRefObject obj = new MethodRefObject();
            //调用成员方法
            obj.printUpperCaseString(s);
        });

        //使用方法引用优化Lambda
        MethodRefObject obj = new MethodRefObject();
        printString(obj::printUpperCaseString);
    }

    //因为要使用Lambda，所以传入函数式接口，这里使用Printable接口
    public static void printString(Printable p){
        p.printf("Hello World");
    }
}
