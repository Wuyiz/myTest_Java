package com.wuyiz.learning.Lambda.functionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * 练习：集合信息筛选
 *      数组当中有多条“姓名，性别”
 *      通过Predicate接口拼接符合要求的字符串筛选到集合ArrayList中
 *      条件：
 *          1.必须为女生
 *          2.姓名长度为4
 *      分析：
 *          1.有两个判断条件，需要使用两个Predicate接口对条件进行判断
 *          2.同时满足两个条件，使用and()连接
 **/
public class Demo05PredicateAnd {
    public static void main(String[] args) {
        String[] info = {"盖伦，男", "皇子，男", "战争女神，女", "光辉女郎，女", "辛德拉，女"};
//        Arrays.stream(info).forEach(System.out::printf);
        for (String s : info) {
            System.out.print(s+"  ");
        }
        System.out.println();

        ArrayList<String> filter = filter(info, str -> str.split("，")[0].length() == 4, (str) -> str.split("，")[1].equals("女"));

        System.out.println("filter => " + filter);
    }

    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if (pre1.and(pre2).test(s)) {
                list.add(s);
            }
        }
        return list;
    }
}
