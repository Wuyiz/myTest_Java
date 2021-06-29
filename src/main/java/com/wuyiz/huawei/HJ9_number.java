package com.wuyiz.huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 15:01
 * @description: 提取不重复数字
 */
public class HJ9_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String number = sc.next();
            LinkedHashSet<String> set = new LinkedHashSet<>();
            for (int length = number.length() - 1; length >= 0; length--) {
                set.add(String.valueOf(number.charAt(length)));
            }
            set.stream().forEach(System.out::print);
        }
    }
}
