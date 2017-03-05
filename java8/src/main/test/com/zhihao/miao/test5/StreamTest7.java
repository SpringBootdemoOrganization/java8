package com.zhihao.miao.test5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest7 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");
//        List<String> list= stream.collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(list.getClass().getName());
//
//        Set<String> set = stream.collect(Collectors.toCollection(HashSet::new));
//        System.out.println(set.getClass().getName());

        String str = stream.collect(Collectors.joining()).toString();
        System.out.println(str);
    }
}
