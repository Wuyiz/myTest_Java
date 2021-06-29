package com.wuyiz.huawei;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 13:15
 * @description: 计算字符串最后一组单词的长度
 */
public class HJ1_lengthStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        String[] s = next.split(" ");
        System.out.println(s[s.length - 1].length());
    }
}
