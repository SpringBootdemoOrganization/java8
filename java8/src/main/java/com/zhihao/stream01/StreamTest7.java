package com.zhihao.stream01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest7 {
    public static void main(String[] args) {
          //ת��ΪArrayList
        Stream<String> stream = Stream.of("hello","world","hello World");
        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
        list.forEach(System.out::println);

        System.out.println("....................");

        //ת��ΪSet
        Stream<String> stream2 = Stream.of("hello","world","hello World");
        Set<String> set = stream2.collect(Collectors.toCollection(HashSet::new));
        System.out.println(set.getClass());
        set.forEach(System.out::println);

        System.out.println("......................");

        //�����е�����ת��ΪString,joining������˵���Ƿ���һ��Collector���󣨽������ÿ��Ԫ��ƴ��������������˳��
        Stream<String> stream3 = Stream.of("hello","world","hello World");
        String str = stream3.collect(Collectors.joining()).toString();
        System.out.println(str);
    }
}