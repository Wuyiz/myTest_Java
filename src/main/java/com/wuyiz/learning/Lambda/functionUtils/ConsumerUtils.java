package com.wuyiz.learning.Lambda.functionUtils;

import java.util.function.Consumer;

/**
 * @ClassName AndThen
 * @Description: public interface Consumer<T>表示接受单个输入参数并且不返回结果的操作。
 *                  与大多数其他功能接口不同， Consumer预期通过副作用进行操作。
 *
 *                  消费性接口，给我一个数据，消费其值
 * @Author AllureLove
 * @Date 2019/11/17 
 * @Version V1.0
 **/
public class ConsumerUtils {
    public static void main(String[] args) {
        String[] arr = {"盖伦，45", "皇子，43", "光辉，26", "赵信，38"};
        andThen(arr,
                message -> System.out.print("姓名：" + message.split("，")[0]),
                message -> System.out.println("   年龄：" + message.split("，")[1]));
    }

    /**
     * default Consumer<T> andThen​(Consumer<? super T> after)返回一个组合的Consumer ，依次执行此操作，然后执行after操作。
     * 如果执行任一操作会抛出异常，它将被转发到组合操作的调用者。 如果执行此操作会引发异常，则不会执行after操作。
     * 参数
     * after - 此操作后执行的操作
     * 结果
     * 一个组成的 Consumer ，依次执行 after操作
     */
    public static void andThen(String[] s, Consumer<String> con1, Consumer<String> con2) {
        for (String message : s) {
            con1.andThen(con2).accept(message);
        }
    }

    /**
     * accept
     * void accept​(T t)对给定的参数执行此操作。
     * 参数
     * t - 输入参数
     */
}
