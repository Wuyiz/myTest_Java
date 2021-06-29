package com.wuyiz.huawei;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 14:46
 * @description: 四舍五入
 */
public class HJ7_sheru45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double d = sc.nextDouble();
            System.out.println(Math.round(d));
        }
    }
}
