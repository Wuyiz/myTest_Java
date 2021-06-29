package com.wuyiz.learning.Collection.Set;

import java.util.HashSet;

/**
 * @ClassName Demo03HashSetSavePerson
 * @Description: HashSet存储自定义类型元素
 *               Set集合报错元素唯一：
 *                  存储的元素(String,Integer,...,Student,Person...)，必须重写hashCode()和equals()
 *               要求:
 *                  同名和同年龄的人，视为同一个人，只能存储一次
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女", 18);
        Person p2 = new Person("小美女", 18);
        Person p3 = new Person("小美女", 19);
        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());
        System.out.println("p3.hashCode() = " + p3.hashCode());
        System.out.println("p1==p2 => " + (p1 == p2));
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println("set = " + set);
    }
}
