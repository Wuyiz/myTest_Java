package com.wuyiz.learning.Collection.HashCode;

/**
 * @ClassName Person
 * @Description: public native int hashCode;
 *               native：代表该方法调用的是本地操作系统的方法
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Person extends Object{
    //重写hashCode()

    @Override
    public int hashCode() {
        return 1;
    }
}
