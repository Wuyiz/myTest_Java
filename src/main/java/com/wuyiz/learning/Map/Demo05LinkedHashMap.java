package com.wuyiz.learning.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * java.util.LinkedHashMap<K,V> extends HashMap<K,V>
 * Map接口的哈希表和链接列表实现，具有可预知的迭代顺序
 * 底层原来：
 *      哈希表+链表（记录元素的位置）
 **/
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "a");
        hashMap.put("c", "c");
        hashMap.put("b", "b");
        hashMap.put("a", "d");
        System.out.println("hashMap => " + hashMap);    //key不允许重复，无序

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", "a");
        linkedHashMap.put("c", "c");
        linkedHashMap.put("b", "b");
        linkedHashMap.put("a", "d");
        System.out.println("linkedHashMap => " + linkedHashMap);    //key不允许重复，有序
    }
}
