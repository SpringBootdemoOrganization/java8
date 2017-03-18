package com.zhihao.stream02;

import java.util.stream.Stream;

/**
 * 需求1：将集合中的每个元素的首字母大写，其他是小写，输入到控制台上。如果不执行forEach方法，那么map这些中间操作就不会执行，
 * 其实流操作中的中间操作并不会执行，只有遇到及时求值操作才会将之前的中间操作按照顺序去遍历每个元素去执行。
 */
public class Stream03 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");

//        stream.map(item -> item.substring(0,1).toUpperCase()+item.substring(1)).
//                forEach(System.out::println);

        stream.map( item -> {
            String result = item.substring(0,1).toUpperCase()+item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);
    }
}
