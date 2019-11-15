package com.wuyiz.learning.Collection.Collections;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
//        return 0;   //返回0，表示认为元素都是相同的
        //自定义比较的规则，比较两个人的年龄（this，Person）
        return this.getAge() - o.getAge();    //年龄升序排序
    }
}
