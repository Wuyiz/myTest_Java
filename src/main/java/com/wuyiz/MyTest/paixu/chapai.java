package com.wuyiz.MyTest.paixu;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-20 0:07
 * @description: 插入排序
 */
public class chapai {
    public static void main(String[] args) {
        int[] ints = generator(10, 100);
        System.out.println("ints => " + Arrays.toString(ints));
        System.out.println("arr => " + Arrays.toString(chaPai(ints)));

    }

    public static int[] chaPai(int[] arr) {
        int j = 0, key = 0;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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
