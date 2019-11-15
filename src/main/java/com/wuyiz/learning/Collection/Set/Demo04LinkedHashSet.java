package com.wuyiz.learning.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @ClassName Demo04LinkedHashSet
 * @Description: java.util.LinkedHashSet集合 extend HashSet集合
 *               LinkedHashSet集合特点：
 *                  底层是一个哈希表(数组+链表/红黑树)+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();  //无序，不重复
        set.add("www");
        set.add("abc");
        set.add("itcast");
        set.add("abc");
        System.out.println("set = " + set);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();    //有序，不重复
        linkedHashSet.add("www");
        linkedHashSet.add("itcast");
        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        System.out.println("linkedHashSet = " + linkedHashSet);
    }
}
