package com.zhihao.stream01;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello World");
        List<String> list = stream.collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
