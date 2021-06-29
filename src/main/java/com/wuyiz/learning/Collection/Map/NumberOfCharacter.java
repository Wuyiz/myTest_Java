package com.wuyiz.learning.Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName NumberOfCharacter
 * @Description: 计算字符串中每个字符出现的次数
 *               分析：
 *                      1.使用Scanner获取用户的输入内容
 *                      2.用Map集合接收，key是字符串中字符，value是字符个数
 *                      3.遍历字符串
 *                      4.用获取到的字符，去Mao集合中判断是否存在
 *                          key存在：
 *                              通过key获取value
 *                              value++
 *                              put（key，value）把新的value存储到Map集合中
 *                          key不存在：
 *                              put（key，1）
 *                       5.遍历Map集合，输出
 *
 * @Author AllureLove
 * @Date 2019/11/11
 * @Version V1.0
 **/
public class NumberOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String str = scanner.next();

        Set<Map.Entry<Character, Integer>> set = getNumberOfStr(str).entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }

        scanner.close();
    }

    private static LinkedHashMap<Character, Integer> getNumberOfStr(String str) {
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if (linkedHashMap.containsKey(c)) {
                Integer value = linkedHashMap.get(c);
                linkedHashMap.put(c,++value);
            } else {
                linkedHashMap.put(c,1);
            }
        }
        return linkedHashMap;
    }


}
