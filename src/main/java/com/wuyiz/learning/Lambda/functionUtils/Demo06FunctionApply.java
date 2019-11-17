package com.wuyiz.learning.Lambda.functionUtils;

import java.util.function.Function;

/**
 * @ClassName Demo06FunctionApply
 * @Description: 自定义函数模型拼接
 *               题目：
 *                  使用Function接口进行函数模型拼接，按照顺序执行多个函数操作
 *                  1.将字符串截取数字年龄部分
 *                  2.将上一步的字符串转换为int类型
 *                  3.累加100,返回int
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class Demo06FunctionApply {
    public static void main(String[] args) {
        String s = "德玛西亚，34";
        System.out.println("s = " + s);

        System.out.println(change(s, str -> str.split("，")[1],
                s1 -> Integer.valueOf(s1),
                integer -> integer + 100
        ));
    }

    public static int change(String str, Function<String, String> fun1,
                             Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(str);
    }
}
