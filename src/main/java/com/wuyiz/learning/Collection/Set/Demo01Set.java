package com.wuyiz.learning.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName Demo01Set
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); //无序、不重复

        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        //迭代器
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer n = iterator.next();
            System.out.println(n);
        }

        //增强for循环
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
