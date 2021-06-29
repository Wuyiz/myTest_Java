package com.wuyiz.learning.Stream;

import java.util.stream.Stream;

/**
 * 常用方法：
 *      延迟方法：返回值类型仍然是Stream接口自身类型的方法，因此支持链式调用。（除了终结方法外，其余方法均为延迟方法）
 *      终结方法：返回值类型不再是Stream接口自身类型的方法，因此不再支持类似StringBuilder那样的链式调用。
 *          例如count()和forEach()
 **/
public class Demo03Stream_function {
    public static void main(String[] args) {
        forEach();
        System.out.println("\n==============================");

        filter();
        System.out.println("\n==============================");

        map();
        System.out.println("\n==============================");

        count();
        System.out.println("\n==============================");

        limit();
        System.out.println("\n==============================");

        skip();
        System.out.println("\n==============================");

        concat();
        System.out.println("\n==============================");
    }

    /**
     * static <T> Stream<T> concat​(Stream<? extends T> a, Stream<? extends T> b)
     *      创建一个懒惰连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素
     */
    private static void concat() {
        Stream<String> stream1 = Stream.of("喜羊羊", "美羊羊", "懒洋洋", "灰太狼", "红太狼");
        Stream<String> stream2 = Stream.of("张三", "李四", "王五", "赵六", "田七");

        Stream<String> stream_concat = Stream.concat(stream1, stream2);
        stream_concat.forEach(name -> System.out.print(name + " "));
    }

    /**
     * Stream<T> skip​(long n)
     *      在丢弃流的第一个 n元素后，返回由该流的剩余元素组成的流
     */
    private static void skip() {
        String[] arr = {"喜羊羊", "美羊羊", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);
        stream.skip(3).forEach(name -> System.out.print(name + "   "));
    }

    /**
     * Stream<T> limit​(long maxSize)
     *      返回由此流的元素组成的流，截短长度不要超过maxSize
     */
    private static void limit() {
        String[] arr = {"喜羊羊", "美羊羊", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);
        stream.limit(3).forEach(name -> System.out.print(name + " "));
    }

    /**
     * 终结方法之一：
     *      long count​()
     *          返回此流中的元素数
     */
    private static void count() {
        Stream<Integer> stream = Stream.of(12, 32, 15, 12, 3, 56);
        System.out.printf("count() = %d", stream.count());
    }

    /**
     * <R> Stream<R> map​(Function<? super T,? extends R> mapper)
     *      返回由给定函数应用于此流的元素的结果组成的流
     */
    private static void map() {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        stream.map(Integer::valueOf).map(s -> ++s).forEach(s -> System.out.print(s + " "));
    }

    /**
     * Stream<T> filter​(Predicate<? super T> predicate)
     *      返回由与此给定谓词匹配的此流的元素组成的流
     */
    private static void filter() {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.filter(name -> name.startsWith("张")).forEach(name -> System.out.print(name + " "));
    }

    /**
     * 终结方法之一：
     *      void forEach​(Consumer<? super T> action)
     *          对此流的每个元素执行操作
     */
    public static void forEach() {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(name -> System.out.print(name + "  "));
//        stream.forEach(System.out::println);    //方法引用
    }
}
