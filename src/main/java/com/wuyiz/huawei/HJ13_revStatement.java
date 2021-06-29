package com.wuyiz.huawei;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 15:29
 * @description: 反转句子，以单词为单位
 */
public class HJ13_revStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        for (String word : sc.nextLine().split(" ")) {
            list.addFirst(word);
        }
        System.out.println(String.join(" ", list));
    }
}
