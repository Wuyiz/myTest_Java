package com.wuyiz.learning.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *  Map集合遍历的第二种方式：使用Entry对象遍历
 *
 *  方法：Set<Map.Entry<K,V>> entrySet​() 返回此映射中包含的映射关系的Set图
 *
 *  实现步骤：
 *      1.使用Map集合中的方法entrySet（），把Map集合中的entry对象取出来，存储到Set集合
 *      2.遍历Set
 *      3.使用Entry对象的getKey（）和getValue（）获取键和值
 */
public class Demo03Entry {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=>" + value);
        }
        System.out.println("==============================");

        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
