package com.wuyiz.huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 14:52
 * @description: 合并表记录
 */
public class HJ8_mix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < num; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + value);
                } else {
                    map.put(key, value);
                }
            }
            for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
                System.out.println(integerIntegerEntry.getKey() + " " + integerIntegerEntry.getValue());
            }
        }
    }
}
