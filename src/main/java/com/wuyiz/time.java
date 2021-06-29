package com.wuyiz;

import java.util.Arrays;
import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = sc.nextInt();
            }
            Arrays.sort(ints);
            System.out.println(minTime(m, n, ints));
        }
    }

    public static int minTime(int m, int n, int[] ints) {
        if (m >= n) return ints[ints.length - 1];
        int[] line = new int[m];
        int k = ints.length;
        int j = 0;
        int len = line.length;
        while (j < k) {

        }

        return 1;
    }


}