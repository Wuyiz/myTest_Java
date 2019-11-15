package com.wuyiz.learning.Map;

import javax.swing.text.html.HTML;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * public class Hashtable<K,V> implements Map<K,V>
 *
 * Hashtable：底层也是一个哈希表，是线程安全的集合，速度慢
 * HashMap：底层是一个哈希表，时线程不安全的集合，速度快
 *
 * HashMap集合：可以存储null的key和value（包括之前所有的集合）
 * Hashtable集合：只能存储任何非null对象的键值或值
 *
 * Hashtable和Vector集合一样，在jdk1.2之后被更先进的集合HashMap（Vector被ArrayList取代）取代了
 * Hashtable的子类Properties依然在被使用
 * Properties集合是唯一一个和I/O流相结合的集合
 **/
public class Demo06Hashtable {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "a");
        hashMap.put("c", null);
        hashMap.put(null, null);
        System.out.println("hashMap => " + hashMap);

        Hashtable<String, String> hashtable = new Hashtable<>();

        try {
            hashtable.put(null, "a");
//            hashtable.put(null, null);
//            hashtable.put("a", null);
            System.out.println("hashtable => " + hashtable);
        } catch (Exception e) {
            System.out.println("Exception = " + e.toString());
        }
    }
}
