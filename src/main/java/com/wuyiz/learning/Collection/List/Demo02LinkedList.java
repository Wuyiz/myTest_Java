package com.wuyiz.learning.Collection.List;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;

/**
 * @ClassName Demo02LinkedList
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/8
 * @Version V1.0
 **/
public class Demo02LinkedList {
    static LinkedList<String> linked = new LinkedList<>();

    public static void initLinkedList(){
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println("LinkedList => " + linked);
    }

    public static void clearLinkedList(){
        linked.clear();
    }

    public static void main(String[] args) throws IllegalAccessException {
        addLinkedList();
        getLinkedList();
        removeLinkedList();

        Demo02LinkedList a = new Demo02LinkedList();
        Method[] methods = a.getClass().getDeclaredMethods();
        Field[] fields = a.getClass().getDeclaredFields();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        for (Field field : fields) {
            System.out.println(field.getName()+":"+field.get(a));
        }
    }

    private static void removeLinkedList() {
        System.out.println("removeLinkedList() method show:    ");
        initLinkedList();

        String removeFirst = linked.removeFirst();
        System.out.println("removeFirst = " + removeFirst);
        String removeLast = linked.removeLast();
        System.out.println("removeLast = " + removeLast);

        System.out.println("after remove linked = " + linked);

        clearLinkedList();
    }

    private static void getLinkedList() {
        System.out.println("getLinkedList() method show:   ");
        initLinkedList();

        String first = linked.getFirst();
        System.out.println("first = " + first);
        String last = linked.getLast();
        System.out.println("last = " + last);

        System.out.println();
        clearLinkedList();
    }

    private static void addLinkedList() {
        System.out.println("addLinkedList() method show:   ");
        initLinkedList();

//        linked.addFirst("wuyiz");
        linked.push("wuyiz");
        System.out.println("push() => " + linked);

        linked.addLast("666");  //等效于 add()
        System.out.println("addLast() => " + linked);

        System.out.println();
        clearLinkedList();
    }
}
