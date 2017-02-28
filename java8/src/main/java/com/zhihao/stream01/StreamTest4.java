package com.zhihao.stream01;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello World");

        //String[] stringArrs = stream.toArray(length -> new String[length]);
        String[] stringArrs = stream.toArray(String[]::new);
        Arrays.asList(stringArrs).forEach(System.out::println);


    }
}
