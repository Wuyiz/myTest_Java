package com.wuyiz.learning.MethodReference.Constructor;

import java.util.Objects;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/11 
 * @Version V1.0
 **/
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
