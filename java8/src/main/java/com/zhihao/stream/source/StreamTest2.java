package com.zhihao.stream.source;

import java.util.Arrays;
import java.util.List;

public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
        list.stream().forEach(System.out::println);
    }
}
