package com.wuyiz.MyTest;

public class test {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "1";
        String s3 = new String("1");
        StringBuilder sb = new StringBuilder("1");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==sb.toString());

        double d = 1;
        float f = 1f;

        double dd = 2;

        System.out.println(d+f == dd);
        System.out.println(f == d);
    }
}
