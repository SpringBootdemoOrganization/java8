package com.zhihao.stream01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {
        Stream stream = Stream.of("hello","world","hello world");

        String[] strArr = new String[]{"hello","world","hello world"};
        Stream stream2 = Stream.of(strArr);

        Stream stream3 = Arrays.stream(strArr);

        List<String> list = Arrays.asList(strArr);
        Stream stream4 = list.stream();
    }
}
