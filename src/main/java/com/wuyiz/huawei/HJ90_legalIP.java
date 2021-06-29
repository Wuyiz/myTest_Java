package com.wuyiz.huawei;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 15:53
 * @description: 合法ip
 */
public class HJ90_legalIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(isOk(line));
        }
    }

    public static String isOk(String input) {
        if (input.contains(" ")) {
            return "NO";
        }
        String[] s = input.split("\\.");
        if (s.length != 4) {
            return "NO";
        }
        int pow = (int) Math.pow(2, 8);
        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(s[i]) > pow || Integer.parseInt(s[i]) < 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
