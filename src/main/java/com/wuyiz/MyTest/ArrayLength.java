package com.wuyiz.MyTest;

/**
 * @ClassName ArrayLength
 * @Description: 利用反射技术发现数组的length既不是属性也不是方法
 * @Author AllureLove
 * @Date 2019/11/11 
 * @Version V1.0
 **/
public class ArrayLength {
    public static void main(String[] args) {
        String[] arr = new String[2];
        System.out.println("arr.length => " + arr.length);
        System.out.println("getDeclaredMethods().length => " + arr.getClass().getDeclaredMethods().length); //0
        System.out.println("getDeclaredFields().length => " + arr.getClass().getDeclaredFields().length);  //0

    }
}
