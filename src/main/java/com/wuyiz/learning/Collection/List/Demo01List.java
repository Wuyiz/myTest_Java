package com.wuyiz.learning.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Demo01List
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/8
 * @Version V1.0
 **/
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println("list = " + list);

        list.add(3, "wuyiz");
        System.out.println("add() => " + list);

        list.remove(2);
        System.out.println("remove() => " + list);

        String setE = list.set(4, "A");
        System.out.println("\n被替换的元素：" + setE + "\nset() => " + list);

        for (int i = 0; i < list.size(); i++) {
            System.out.printf( list.get(i) + "   ");
        }
        System.out.println("\n=========================================");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.printf(iter.next() + "   ");
        }
        System.out.println("\n=========================================");

        for (String s : list) {
            System.out.printf(s+"   ");
        }
        System.out.println("\n=========================================");
    }
}
