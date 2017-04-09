package com.zhihao.stream.source;

import java.util.Arrays;
import java.util.List;

public class StreamTest8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","welcome");

        list.stream().forEach(System.out::println);

        System.out.println("................");

        //底层与流没有关系
        list.forEach(System.out::println);
    }
}
