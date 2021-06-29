package com.wuyiz.learning.Collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 *  java.util.Map<k,v>集合
 *  Map集合的特点：
 *      1.Map集合是一个双列集合，一个元素包含两个值（k，v）
 *      2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
 *      3.Map集合中的元素，key是不允许重复的，value可以重复
 *      4.Map集合中的元素，key和value是一一对应的
 *
 *  java.util.HashMap<k,v>集合 implements Map<k,v>接口
 *  HashMap集合的特点：
 *      1.HashMap集合底层是哈希表：查询速度特别快
 *          JDK1.8之前：数组+单向链表
 *          JDK1.8之后：数组+单向链表/红黑树（链表的长度超过8时转为红黑树）：提高查询的速度
 *      2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
 *
 *  java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
 *  LinkedHashMap集合的特点：
 *      1.LinkedHashMap集合底层是哈希表+双向链表（保证迭代的顺序）
 *      2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序一致
 */
public class Demo01Map {
    public static void main(String[] args) {
//        addMap();
//        removeMap();
//        getMap();
        containsKeyMap();
    }

    /**
     * bollean containsKey(Object key) 判断集合中是否包含指定的键
     *  包含返回true，反之则返回false
     */
    private static void containsKeyMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        boolean b1 = map.containsKey("赵丽颖");
        System.out.println("b1 = " + b1);

        boolean b2 = map.containsKey("123");
        System.out.println("b2 = " + b2);
    }

    /**
     * public V get(Object key)：根据指定的键，在Map集合中获取对应的值
     *  返回值：
     *      key存在，返回对应的value
     *      key不存在，返回null
     */
    private static void getMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        Integer v1 = map.get("杨颖");
        System.out.println("v1 = " + v1);

        Integer v2 = map.get("徐峥");
        System.out.println("v2 = " + v2);
    }

    /**
     * public V remove(Object key):把指定的键所对应的键值对元素，在Map集合中删除，返回被删除的元素值
     *  返回值:V
     *      key存在，V返回被删除的值
     *      key不存在，V返回null
     */
    private static void removeMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        System.out.println("map = " + map);

        Integer v1 = map.remove("林志玲");
        System.out.println("v1 = " + v1);

        System.out.println("map = " + map);

        Integer v2 = map.remove("林志颖");
//        int v2 = map.remove("林志颖");   //可以使用int类型接受返回值，自动拆箱原理，但是返回值为null时会抛异常，建议使用包装类进行接受
        System.out.println("v2 = " + v2);
    }

    /**
     * public V put(K key, V value):把指定的键与指定的值添加到Map集合中
     *  返回值：v
     *      存储键值对的时候，key不重复，返回值v时null
     *      存储键值对的时候，key重复，会使用新的value替换Map中重复的value，返回被替换的value值
     */
    private static void addMap() {
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1 = " + v1);
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2 = " + v2);
        System.out.println("map = " + map);

        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("小鱼儿", "小龙女");
        System.out.println("map = " + map);
    }
}
