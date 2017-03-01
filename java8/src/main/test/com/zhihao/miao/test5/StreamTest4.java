package com.zhihao.miao.test5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");
        String[] strArr = stream.toArray(String[]::new);
        List<String> list = Arrays.asList(strArr);
        list.forEach(str -> System.out.println(str));
    }
}
