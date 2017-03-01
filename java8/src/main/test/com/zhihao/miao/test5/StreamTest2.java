package com.zhihao.miao.test5;

import java.util.stream.IntStream;

public class StreamTest2 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(5,6,7);
        intStream.forEach(item -> System.out.println(item));

        System.out.println("............................");

        IntStream.range(3,8).forEach(System.out::println);

        System.out.println(".............................");

        IntStream.rangeClosed(3,8).forEach(System.out::println);

    }
}
