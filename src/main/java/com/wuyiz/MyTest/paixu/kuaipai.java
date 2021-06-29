package com.wuyiz.MyTest.paixu;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-20 0:38
 * @description: 快排
 */
public class kuaipai {
    public static void main(String[] args) {
        int[] ints = generator(10, 100);
        System.out.println("ints => " + Arrays.toString(ints));
    }

    public static int[] generator(int len, int max) {
        int[] ints = new int[len];
        for (int i = 0; i < len; i++) {
            ints[i] = (int) (Math.random() * max);
        }
        return ints;
    }
}
