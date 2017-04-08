package com.zhihao.stream.source;


import java.util.Arrays;
import java.util.List;

public class StreamTest6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","welcome");

        list.stream().map(str -> str+"_abc").forEach(System.out::println);
    }
}
