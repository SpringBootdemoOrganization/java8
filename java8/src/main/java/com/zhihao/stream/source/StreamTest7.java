package com.zhihao.stream.source;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","welcome");

        Stream<String> stream = list.stream();

        System.out.println("111111");

        Stream<String> stream2 = stream.map(item -> item+"_abc");

        System.out.println("2222222");

        stream2.forEach(System.out::println);
    }
}
