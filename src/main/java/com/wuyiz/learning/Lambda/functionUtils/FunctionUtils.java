package com.wuyiz.learning.Lambda.functionUtils;

import java.util.function.Function;

/**
 * public interface Function<T,R>表示接受一个参数并产生结果的函数。
 * 这是一个functional interface的功能方法是apply(Object)
 *
 * 参数类型
 *      T - 函数输入的类型
 *      R - 函数结果的类型
 **/
public class FunctionUtils {
    public static void main(String[] args) {
        String s = "250";
        System.out.println("s = " + s);

        apply(s, str -> Integer.valueOf(str));

        andThen(s, str -> Integer.valueOf(str) + 10, i -> String.valueOf(i));
    }

    /**
     * default <V> Function<T,V> andThen​(Function<? super R,? extends V> after)返回一个组合函数，首先将该函数应用于其输入，然后将after函数应用于结果。
     * 如果任一函数的评估引发异常，则将其转发给组合函数的调用者。
     *
     * default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
     *         Objects.requireNonNull(after);
     *         return (T t) -> after.apply(apply(t));
     *     }
     *
     * 参数类型
     *      V - after函数的输出类型，以及组合函数的输出类型
     * 参数
     *      after - 应用此功能后应用的功能
     * 结果
     *      一个组合函数首先应用此函数，然后应用 after函数
     */
    public static void andThen(String str, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        System.out.println("str + 10  = " + fun1.andThen(fun2).apply(str));
    }

    /**
     * R apply​(T t) 将此函数应用于给定的参数。
     *  *      使用场景：类型转换
     */
    public static void apply(String str, Function<String, Integer> function) {
        Integer integer = function.apply(str);
        System.out.println("integer = " + integer);
    }
}
