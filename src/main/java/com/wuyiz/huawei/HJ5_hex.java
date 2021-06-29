package com.wuyiz.huawei;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 14:14
 * @description: 转16进制
 */
public class HJ5_hex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(Integer.valueOf(scanner.next().substring(2), 16).toString());
        }
    }
}
