package com.zhihao.stream02;

import java.util.Arrays;
import java.util.List;

public class Stream06 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello1","world","hello world");

        /*
        list.stream().filter(item -> item.length() ==5).limit(1).forEach(item -> {
            System.out.println(item);
            System.out.println(item.length());
        });
        */

//        list.stream().mapToInt(item -> item.length()).filter(length -> length ==5).limit(1).findFirst().ifPresent(System.out::println);

        //流存在短路运算的，只要找到符合条件的元素就会发生短路，下面不执行了，所以这里的item打印出来的是hello1,world,然后在world这边找到复合条件的
        //元素发生短路不往下执行了
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length ==5).limit(1).findFirst().ifPresent(System.out::println);
    }
}
