package com.zhihao.miao.test5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest8 {
    public static void main(String[] args) {
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1,2),Arrays.asList(2,3),Arrays.asList(3,4,5));
        stream.flatMap(theList -> theList.stream()).distinct().map(i -> i*i).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
