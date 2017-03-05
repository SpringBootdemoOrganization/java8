package com.zhihao.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream07 {
    //每个元素的元素去除空格然后去重
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world","world hello","hello world hello","hello welcome");

        //并没有实现它
        /*
        List<String> resultList = new ArrayList<>();
        list.stream().map(item -> {
            List<String> middleList = Arrays.asList(item.split(" "));
            resultList.addAll(middleList);
            return resultList;
        }).distinct().forEach(System.out::println);
        */

        //flapMap的正确使用，实际场景经常用到，将得到的Stream<String[]> 打平成Stream<String>
        List<String> resultList = list.stream().map(item -> item.split(" ")).
                flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        resultList.forEach(System.out::println);


    }
}
