package com.wuyiz.learning.MethodReference.Constructor;



/**
 * @InterfaceName PersonBuilder
 * @Description: 定义一个Person对象的函数式接口
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
@FunctionalInterface
public interface PersonBuilder {
    Person builderPerson(String name);
}
