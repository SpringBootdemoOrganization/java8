package com.zhihao.miao.test5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");
        List<String> stringList = stream.collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }
}
