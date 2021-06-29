package com.wuyiz.huawei;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-28 14:01
 * @description: 多行输入。每行字符串少于8位补0，每组8位打印
 */
public class HJ4_splitStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();//牢记字符串缓冲区的建立语法
            sb.append(str);//字符串缓冲区的加入
            int size = str.length();
            int addZero = 8 - size % 8;//addzero的可能值包括8
            while ((addZero > 0) && (addZero < 8)) {//注意边界调节，避免addzero=8
                sb.append("0");//使用‘’或“”都可
                addZero--;
            }
            String str1 = sb.toString();
            while (str1.length() > 0) {
                System.out.println(str1.substring(0, 8));
                str1 = str1.substring(8);
            }
        }
    }
}
