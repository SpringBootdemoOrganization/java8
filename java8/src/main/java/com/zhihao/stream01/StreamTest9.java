package com.zhihao.stream01;

import java.util.UUID;
import java.util.stream.Stream;


public class StreamTest9 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);

        stream.limit(10).forEach(System.out::println);
        //findFirst是一个短路的终端操作
        //stream.findFirst().ifPresent(System.out::println);

        //findFirst返回一个Optional对象，ifPresent的正确用法
        Stream<String> stream2 = Stream.empty();
        stream2.findFirst().ifPresent(System.out::println);

        //iterate返回的是一个无限流，并且循环执行f(i),f(f(i)),f(f(f(i))),一般都会加上limit来限制次数
        Stream.iterate(1,i -> i+2).limit(6).forEach(System.out::println);
    }
}

