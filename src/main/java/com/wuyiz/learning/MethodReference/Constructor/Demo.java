package com.wuyiz.learning.MethodReference.Constructor;

import com.wuyiz.learning.MethodReference.Constructor.Person;

import javax.print.attribute.standard.PrinterName;


/**
 * @ClassName Demo
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class Demo {
    public static void main(String[] args) {
        printName("迪丽热巴", name -> new Person(name));

        printName("佟丽娅",Person::new);
    }

    public static void printName(String name, PersonBuilder personBuilder) {
        Person person = personBuilder.builderPerson(name);
        System.out.println(person.getName());
    }
}
