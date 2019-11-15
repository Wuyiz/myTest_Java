package com.wuyiz.MyTest.Lambda;

import javax.sql.rowset.spi.SyncResolver;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @ClassName Demo04Java9Tester
 * @Description: 变量作用域
 * @Author AllureLove
 * @Date 2019/11/15 
 * @Version V1.0
 **/
public class Demo04Java9Tester {
    public static void main(String args[]) {
        int num = 1;
        Converter<Integer, String> stringConverter = (param) -> System.out.println(String.valueOf(param + num));
        stringConverter.convert(2);  // 输出结果为 3
//        i = 2;

        String[] str = {"1","12","123"};
        Comparator<String> stringComparator = (first, second) -> Integer.compare(first.length(), second.length());
        Arrays.sort(str, stringComparator);
        for (String s1 : str) {

        }

        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123123");
        Comparator<String> comparator = Comparator.comparingInt(String::length).reversed();
        Collections.sort(list,comparator);
        System.out.println(list);


        int i = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + i));
        s.convert(2);
//        i = 5;
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
