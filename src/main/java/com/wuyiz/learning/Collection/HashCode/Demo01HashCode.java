package com.wuyiz.learning.Collection.HashCode;

/**
 * @ClassName Demo01HashCode
 * @Description: TODO
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Demo01HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();

        Person p2 =new Person();
        int h2 = p2.hashCode();

        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);

        /**
         * public String toString() {
         *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         */
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p1==p2 => " + (p1 == p2));

        /**
         * String类的哈希值
         *      String类重写Object类的hashCode()
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());

        System.out.println("\"重地\".hashCode() = " + "重地".hashCode());   //这两个字符串的哈希值很巧合的相等
        System.out.println("\"通话\".hashCode() = " + "通话".hashCode());
    }
}
