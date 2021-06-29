package com.wuyiz.MyTest;

public class test {
    public static void main(String[] args) {
        /*String s1 = "1";
        String s2 = "1";
        String s3 = new String("1");
        StringBuilder sb = new StringBuilder("1");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s1 == sb.toString());  //false*/

        String s1 = "1";
        String s2 = "2";
        String s3 = "1" + "2";
        String s4 = s1 + s2;
        String s5 = "12";
        String s6 = s1;
        String s7 = "1";

        System.out.println("s1==s6:" + (s1 == s6));     //true
        System.out.println("s1==s7:" + (s1 == s7));     //true
        System.out.println("s3==s4:" + (s3 == s4));     //false
        System.out.println("s3==s5:" + (s3 == s5));     //true
        System.out.println("s3==(s1+s2):" + (s3 == (s1 + s2)));     //false
        System.out.println("s4==s5:" + (s4 == s5));                 //false
        System.out.println("s4==(s1+s2):" + (s4 == (s1 + s2)));     //false
        System.out.println("1+2==s3:" + (("1" + "2") == s3));      //true
        System.out.println("1+2==s4:" + (("1" + "2") == s4));      //false
        System.out.println("1+2==s5:" + (("1" + "2") == s5));      //true

        System.out.println("1+2.0==3:" + (2.0 - 1.9 == 0.1));   //false

        double d = 1;
        float f = 1f;
        float ff = 2f;
        double dd = 2;
        System.out.println(d + f == dd);
        System.out.println(f == d);
        System.out.println(ff == dd);

        Float f1 = 1f;
        Float f2 = 1f;
        Float f3 = 2f;
        Double d1 = 1.0;
        Double d2 = 1.0;
        Double d3 = 2.0;
        System.out.println("f1==f2 =>" + (f1 == f2));               //false
        System.out.println("(f1+f2)==f3 =>" + ((f1 + f2) == f3));   //true
        System.out.println("d1==d2 =>" + (d1 == d2));               //false
        System.out.println("(d1+d2)==d3 =>" + ((d1 + d2) == d3));   //true
        System.out.println("f1+f2==d3 =>" + ((f1 + f2) == d3));     //true


        System.out.println(getNumber(20));
    }

    private static int getNumber(int i) {
        System.out.println(i); //20
        try {
            i = 10;
            System.out.println(i / 0);
            i = 20;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(i);//10
            return i;  //在内存中其实已经形成返回10的操作，但是发现有finally，于是继续执行finally里面的代码
        } finally {
            i = 30;
            System.out.println(i);//30 执行完finally，又回去执行之前没有执行的返回 10的操作
        }

        return i;
    }
}
