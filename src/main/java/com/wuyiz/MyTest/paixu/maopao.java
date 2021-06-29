package com.wuyiz.MyTest.paixu;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-20 0:38
 * @description: 冒泡排序
 */
public class maopao {
    public static void main(String[] args) {
        int[] ints = generator(10, 100);
        System.out.println("ints => " + Arrays.toString(ints));
        System.out.println("arr => " + Arrays.toString(maoPao(new int[]{1,2,3,4,5})));
    }

    public static int[] maoPao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) return arr;
        }
        return arr;
    }

    public static int[] generator(int len, int max) {
        int[] ints = new int[len];
        for (int i = 0; i < len; i++) {
            ints[i] = (int) (Math.random() * max);
        }
        return ints;
    }
}
