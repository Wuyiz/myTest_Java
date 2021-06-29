package com.wuyiz.learning.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap存储自定义类型的键值
 * Map集合保证key唯一
 *  作为key的元素，必须重写hashCode()和equals()，以保证key唯一
 **/
public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /**
     * HashMap存储自定义类型的键值
     *      key：Person类型
     *           Person类型必须重写hashCode和equals，保证key唯一
     *      value：String类型
     *           value可以重复
     */
    private static void show02() {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("女王", 18),"英国");
        map.put(new Person("主席", 18),"中国");
        map.put(new Person("总统", 18),"俄罗斯");
        map.put(new Person("女王", 18),"毛里求斯");

        Set<Map.Entry<Person, String>> set = map.entrySet();

        for (Map.Entry<Person, String> entry : set) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }

    /**
     * HashMap存储自定义类型的键值
     * key：String类型
     *      String类型重写hashCode和equals
     * value：Person类型
     *      value可以重复（同名同岁的人视为同一人）
     */
    private static void show01() {
        Map<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 18));
        map.put("广州", new Person("李四", 19));
        map.put("上海", new Person("王麻子", 20));
        map.put("北京", new Person("赵六", 18));

        for (String key : map.keySet()) {
            System.out.println(key + "=>" + map.get(key));
        }
    }
}
