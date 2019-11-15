package com.wuyiz.learning.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName Demo02CollectionsSort
 * @Description: public static <T> void sort(List<T> list， Comparator<? super T>)
 *               将集合中元素按照制定规则排序
 *
 *               Comparator和Comparable的区别
 *                  Comparable：自己（this）和别人（T参数）比较，自己需要实现Comparable接口，重写比较的compareTo()
 *                  Comparator：相当于找一个第三方的裁判进行比较
 * @Autho AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Demo03SortComparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list => " + list);

        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;   //升序
                return o2 - o1; //降序
            }
        });
        System.out.println("list sort ASC/DESC => " + list);

        ArrayList<Student> list_1 = new ArrayList<>();
        list_1.add(new Student("t腾讯",20));
        list_1.add(new Student("百度",24));
        list_1.add(new Student("阿里巴巴",18));
        list_1.add(new Student("b阿里巴巴",20));

        Collections.sort(list_1,new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序
                int result = o1.getAge() - o2.getAge();
                //如果两人年龄相同，就使用姓名首字比较
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println("list_1 => " + list_1);
    }
}
