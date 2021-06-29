package com.wuyiz.huawei;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 15:10
 * @description: 计算字符在ACSII码范围内(0 ~ 127)的没有空格的字符串有多少个不同的字符
 */
public class HJ10_countChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(count(str));
    }

    public static int count(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 0 && c <= 127) {
                set.add(c);
            }
        }
        return set.size();
    }
}
