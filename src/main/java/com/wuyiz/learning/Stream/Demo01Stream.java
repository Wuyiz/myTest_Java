package com.wuyiz.learning.Stream;

import java.util.ArrayList;

/**
 * @ClassName Demo01Stream
 * @Description: 使用Stream流的方式遍历集合，对集合中的数据进行过滤
 *               Stream屎JDK1.8之后出现的
 *               流关注的是做什么，而不是怎么做
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class Demo01Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张筱雨");
        list.add("张三丰");
        System.out.println("list => " + list);

        list.stream().filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(System.out::println);
    }
}
