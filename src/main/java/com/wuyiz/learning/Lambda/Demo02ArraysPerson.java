package com.wuyiz.learning.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName Demo02Arrays
 * @Description: Lambda表达式 有参有返回值的联系
 *               需求：
 *                  使用数组存储多个Person对象
 *                  对数组中的Person对象使用Arrays的sort()通过年龄进行升序输出
 * @Author AllureLove
 * @Date 2019/11/13 
 * @Version V1.0
 **/
public class Demo02ArraysPerson {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("佟丽娅", 26),
                new Person("范冰冰", 22),
                new Person("柳岩", 21)
        };

        //匿名内部类重写comparator接口里的compare()
        System.out.println("=======匿名内部类升序排序：=================");
        Arrays.sort(arr, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Person person : arr) {
            System.out.println(person);
        }

        //使用Lambda表达式，简化匿名内部类
        System.out.println("=======Lambda表达式降序排序：===============");
        Arrays.sort(arr, (o1, o2) -> o2.getAge() - o1.getAge());
//        Arrays.sort(arr,Comparator.comparingInt(Person::getAge).reversed());    //jdk1.8 也可以这样写  方法引用
        for (Person person : arr) {
            System.out.println(person);
        }

        //流
        System.out.println("=======Stream-sort升序排序：===============");
        Arrays.stream(arr).sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);

    }
}


