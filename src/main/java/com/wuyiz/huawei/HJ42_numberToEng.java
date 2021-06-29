package com.wuyiz.huawei;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 16:20
 * @description: 数字转为英文写法
 */
public class HJ42_numberToEng {
    public static String[] ones = new String[]{null, "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static String[] tens = new String[]{"ten", "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    public static String[] twieties = new String[]{null, null, "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static int[] range = new int[]{(int) 1e2, (int) 1e3, (int) 1e6, (int) 1e9, (int) 1e12};
    public static String[] ranges = new String[]{"hundred", "thousand", "million", "billion"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = Math.toIntExact(sc.nextLong());
            // 转换
            System.out.println(transfer(num));
        }
    }

    public static String transfer(int num) {
        if (num <= 9) return ones[(num)];
        if (num <= 19) return tens[(num % 10)];
        if (num <= 99) return twieties[num / 10] + (num % 10 == 0 ? " " : " " + ones[num % 10]);

        for (int i = 0; i < 4; i++) {
            if (num < range[i + 1]) {
                return transfer(num / range[i]) + " " + ranges[i] +
                        (num % range[i] == 0 ? " " : (i != 0 ? " " : " and ") + transfer(num % range[i]));
            }
        }
        return "";
    }
}
