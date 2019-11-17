package com.wuyiz.learning.Lambda.functionUtils;

import java.util.function.Predicate;

/**
 * @ClassName Predicate_test
 * @Description: public interface Predicate<T>表示一个参数的谓词（布尔值函数）。
 *                  这是一个functional interface，其功能方法是test(Object) 。
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class PredicateUtils {
    public static void main(String[] args) {
        String arr = "abcdef";
        System.out.println("arr => " + arr + "\n");

        //test()
        boolean b = checkString(arr, str -> str.length() > 5);
        System.out.println("(str) -> str.length() > 5 => " + b + "\n");

        //add()
        b = checkString_and(arr, str -> str.length() > 5, (str) -> str.contains("a"));
        System.out.println("str.length() > 5 && (str) -> str.contains(\"a\") => " + b + "\n");

        //or()
        b = checkString_or(arr, str -> str.length() > 5, (str) -> str.contains("a"));
        System.out.println("str.length() > 5 || (str) -> str.contains(\"a\") => " + b + "\n");

        //negate()
        b = checkString_negate(arr, str -> str.length() > 5);
        System.out.println("! (str) -> str.length() > 5 => " + b + "\n");
    }


    /**
     * boolean test​(T t)在给定的参数上评估这个谓词。
     * 参数
     * t - 输入参数
     * 结果
     * true如果输入参数与谓词匹配，否则为 false
     */
    public static boolean checkString(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }

    /**
     * default Predicate<T> and​(Predicate<? super T> other)返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑AND。 当评估组合谓词时，如果该谓词为false ，则不评估other谓词。
     *  * 在评估任一谓词期间抛出的任何异常被中继到调用者; 如果此谓词的评估引发异常，则不会评估other谓词。
     *  *
     *  * default Predicate<T> and(Predicate<? super T> other) {
     *  *         Objects.requireNonNull(other);
     *  *         return (t) -> test(t) && other.test(t);
     *  *
     *  * 参数
     *  * other - 将与此谓词进行逻辑与操作的谓词
     *  * 结果
     *  * 一个代表该谓词和 other谓词的短路逻辑AND的 other谓词
     *  * 异常
     *  * NullPointerException - 如果其他为空
     */
    public static boolean checkString_and(String str, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(str) && pre2.test(str);
        return pre1.and(pre2).test(str);
    }

    /**
     * default Predicate<T> or​(Predicate<? super T> other)返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑或。 当评估组合谓词时，如果该谓词为true ，则不会评估other谓词。
     *  * 在评估任一谓词期间抛出的任何异常被中继到调用者; 如果此谓词的评估引发异常，则不会评估other谓词。
     *  *
     *  * default Predicate<T> or(Predicate<? super T> other) {
     *  *          Objects.requireNonNull(other);
     *  *          return (t) -> test(t) || other.test(t);
     *  *      }
     *  *
     *  * 参数
     *  * other - 将与此谓词进行逻辑关系的谓词
     *  * 结果
     *  * 一个组成的谓词，表示该谓词与 other谓词的短路逻辑或
     *  * 异常
     *  * NullPointerException - 如果其他为空
     */
    public static boolean checkString_or(String str, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(str) || pre2.test(str);
        return pre1.or(pre2).test(str);
    }

    /**
     * default Predicate<T> negate​()返回表示此谓词的逻辑否定的谓词。
     *
     * default Predicate<T> negate() {
     *         return (t) -> !test(t);
     *     }
     *
     * 结果
     * 一个表示该谓词的逻辑否定的谓词
     */
    public static boolean checkString_negate(String str, Predicate<String> pre) {
//        return !pre.test(str);
        return pre.negate().test(str);
    }
}
