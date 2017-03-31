package com.zhihao.stream.source;

import java.util.Arrays;
import java.util.List;

public class StreamTest4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world","welcome","person","student");

        System.out.println(list.getClass());//class java.util.Arrays$ArrayList

        list.stream().map(item -> item).forEach(System.out::println);

        //list.stream().forEach(System.out::println);

        //list.stream().map(item -> item).filter(item -> true).forEach(System.out::println);
    }
}
