package com.zhihao.stream.source;

import java.util.Arrays;
import java.util.List;

public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world","welcome","person","student");
        list.stream().forEach(System.out::println);
        list.stream().map(str -> str+"").forEach(System.out::println);

        //使用并行流执行的顺序未知，看看forEach的api就知道原因了
        list.parallelStream().forEach(System.out::println);


    }
}
