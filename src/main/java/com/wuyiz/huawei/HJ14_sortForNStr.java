package com.wuyiz.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 15:43
 * @description: 给定n个字符串，请对n个字符串按照字典序排列。
 */
public class HJ14_sortForNStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = Integer.parseInt(in.nextLine());
            String[] array = new String[num];
            for (int i = 0; i < num; i++) {
                String next = in.nextLine();
                array[i] = next;
            }
            Arrays.stream(array).sorted().forEach(System.out::println);
        }
    }
}