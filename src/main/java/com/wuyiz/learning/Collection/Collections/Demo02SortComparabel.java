package com.wuyiz.learning.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Demo02SortComparabel
 * @Description: public static <T> void sort(List<T> list)  Person实现了Comparable接口
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Demo02SortComparabel {
    public static void main(String[] args) {
        //自定义类进行排序，需要实现Comparable类
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",32));
        list.add(new Person("王麻子",21));
        System.out.println("list => " + list);
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
