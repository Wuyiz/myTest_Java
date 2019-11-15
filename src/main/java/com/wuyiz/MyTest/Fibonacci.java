package com.wuyiz.MyTest;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Fibonacci
 * @Description: 斐波那契函数       { 0，n=0
 *                          F(n) = { 1， n=1
 *                                 { F(n-1) + F(n-2),   n>1
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
public class Fibonacci {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> fibo = new LinkedHashMap<>();

        for (int i = 0; i < 20; i++) {
            fibo.put(i, Fib(i));
        }

        System.out.println("斐波那契数列：" + fibo);
    }

    private static int Fib(int i) {
        if (i < 2) return i == 0 ? 0 : 1;
        return Fib(i - 1) + Fib(i - 2);     //递归
    }
}
