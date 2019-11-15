package com.wuyiz.learning.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Demo01Collections
 * @Description: Collections工具类
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");*/
        Collections.addAll(list,"a","b","c","d");
        System.out.println("list => " + list);

        Collections.shuffle(list);
        System.out.println("list => " + list);

        Collections.sort(list);     //默认升序
        System.out.println("list => " + list);
        Collections.sort(list);
        System.out.println("list => " + list);

    }
}
