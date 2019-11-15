package com.wuyiz.learning.Collection.VarArgs;

/**
 * @ClassName Demo01VarArgs
 * @Description: 可变参数：是JDK1.5之后出现的新特性
 *               使用前提：
 *                   当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
 *               使用格式：定义方法时使用
 *                   修饰符 返回值类型 方法名（数据类型...变量名）{}
 *               可变参数的原理：
 *                    可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
 *                    传递的参数个数，可以是0个（不传递），1，2，...多个
 *                可变参数的注意事项：
 *                     1.一个方法的参数列表只能有一个可变参数
 *                     2.如果方法的参数有多个，那么可变参数必须卸载参数列表的末尾
 * @Author AllureLove
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Demo01VarArgs {
    public static void main(String[] args) {
        int sum = add(10, 20, 30, 40, 50);
        System.out.println("sum = " + sum);

        int sub_val = method("sub", 10, 20, 30);
        System.out.println("sub_val = " + sub_val);
    }

    /**
     * 定义计算（0-n）整数和的方法
     * 已知：计算整数的和，数据类型已经确定int
     * 但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
     * add(); 会创建一个长度为0的数组，new int[0]，数组大小根据方法被调用时传入的参数个数调整
     */
    public static int add(int... arr) {
        System.out.println("arr = " + arr); //[I@7c30a502 底层是一个数组
        System.out.println("arr.length = " + arr.length);   //0

        //定义一个初始化的变量，记录累加求和
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //多个参数类型，可变参数只能存在一个并且要在参数列表末尾
    public static int method(String operating, int... arr) {
        int val = 0;
        if (operating.equals("sub")) {
            for (int i : arr) {
                val -= i;
            }
        }
        return val;
    }

//可变参数的特殊写法
//    public static void method(Object...objects){
//        for (Object object : objects) {
//            System.out.println(object);
//        }
//    }
}
