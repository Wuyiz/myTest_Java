package com.wuyiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 20:03
 * @description: 水仙花
 */
public class shuixianhua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(shuixianhua(n1, n2));
        }
    }

    private static int shuixianhua(int n1, int n2) {
        if (n1 < 3 || n1 > 7) {
            return -1;
        }
        int min = (int) Math.pow(10, n1 - 1);
        int max = (int) Math.pow(10, n1);
        List<Integer> arr = new ArrayList<>();
        for (int i = min; i < max; i++) {
            int temp = i;
            int j = 0;
            int[] a = new int[n1];
            while (temp != 0) {
                a[j] = temp % 10;
                temp = temp / 10;
                j++;
            }
            int sum = 0;
            for (int k = 0; k < n1; k++) {
                sum += (int) Math.pow(a[k], n1);
            }
            if (sum == i) {
                arr.add(i);
            }
        }
        if (n2 > arr.size()) {
            return n2 * arr.get(arr.size() - 1);
        }
        return arr.get(n2);
    }
}
