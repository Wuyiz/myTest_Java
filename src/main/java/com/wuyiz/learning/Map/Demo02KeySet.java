package com.wuyiz.learning.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的第一种遍历方式：通过键寻找值的方式
 * Map集合中的方法：
 *      Set<k> keySet() 返回此映射中包含的键的Set图
 * 实现步骤：
 *      1.使用Map集合中的方法KeySet（），把Map集合中的所有key取出来，存储到Set集合中
 *      2.遍历Set集合，获取Map集合中的每一个key
 *      3.通过Map集合中的get（key），获取value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + "=>" + map.get(key));
        }
        System.out.println("================================================");

        for (String key : set) {
            System.out.println(key + "=>" + map.get(key));
        }

    }
}
