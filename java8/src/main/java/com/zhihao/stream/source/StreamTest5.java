package com.zhihao.stream.source;


import java.util.Arrays;
import java.util.List;

public class StreamTest5 {
    public static void main(String[] args) {
        List<String>  lists = Arrays.asList("hello","world","welcome");
        lists.stream().map(str -> str.length()).peek(e -> System.out.println());

    }
}
