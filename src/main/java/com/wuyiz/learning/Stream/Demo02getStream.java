package com.wuyiz.learning.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * java.util.stream
 * Interface Stream<T>
 *
 * 获取流的方式：
 *      Collection集合可以通过stream默认方法获取流
 *          default Stream<E> stream​() 返回一个序列 Stream与此集合作为其来源。
 *      Stream接口的静态方法of()
 *          static <T> Stream<T> of​(T... values)返回其元素是指定值的顺序排序流。
 **/
public class Demo02getStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        //Map集合转换流的三种方式
        Map<String, String> map = new HashMap<>();
        //1.获取键，存储到Set
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();
        //2.获取值，存储到一个Collection集合中
        Collection<String> value = map.values();
        Stream<String> stream4 = value.stream();
        //3.获取键值对
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String,String>> stream5 = entries.stream();

        //把数组转换为Stream流
        // 通过Stream的of()方法的可变参数传入数组
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5);
        Integer[] ints = {1,2,3,4,5};
        Stream<Integer> stream7 = Stream.of(ints);
        String[] arr = {"da","adsaw","asdadwa"};
        Stream<String> stream8 = Stream.of(arr);

    }
}
