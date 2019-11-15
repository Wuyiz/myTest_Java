package com.wuyiz.learning.Collection.Set;

import java.util.HashSet;

/**
 * @ClassName Demo02HashSetSaveString
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println("set = " + set);
    }
}
