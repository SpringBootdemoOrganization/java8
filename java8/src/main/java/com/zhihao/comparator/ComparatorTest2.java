package com.zhihao.comparator;


import java.util.*;

public class ComparatorTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao","hello","world","welcome");

        //default <U> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor,Comparator<? super U> keyComparator)
        //的使用方式，虽然这个demo没有显示出排序的结果
        Collections.sort(list, Comparator.comparingInt(String::length).reversed().thenComparing(item -> {
            System.out.println(RandowString()+item);
            return RandowString()+item;
        },Comparator.comparing(String::toLowerCase)));

        System.out.println(list);
    }

    public static String RandowString(){
        return UUID.randomUUID().toString().substring(0,1);
    }
}
