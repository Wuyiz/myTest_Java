package com.wuyiz.huawei;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 13:44
 * @description: 保存一段随机数并去重排序
 */
public class HJ3_randomSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //获取个数
            int num = sc.nextInt();
            //创建TreeSet进行去重排序
            TreeSet<Integer> set = new TreeSet<>();
            //输入
            for (int i = 0; i < num; i++) {
                set.add(sc.nextInt());
            }

            //输出
            for (Integer integer : set) {
                System.out.println(integer);
            }
        }
    }
}
