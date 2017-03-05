package com.zhihao.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream07 {
    //ÿ��Ԫ�ص�Ԫ��ȥ���ո�Ȼ��ȥ��
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world","world hello","hello world hello","hello welcome");

        //��û��ʵ����
        /*
        List<String> resultList = new ArrayList<>();
        list.stream().map(item -> {
            List<String> middleList = Arrays.asList(item.split(" "));
            resultList.addAll(middleList);
            return resultList;
        }).distinct().forEach(System.out::println);
        */

        //flapMap����ȷʹ�ã�ʵ�ʳ��������õ������õ���Stream<String[]> ��ƽ��Stream<String>
        List<String> resultList = list.stream().map(item -> item.split(" ")).
                flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        resultList.forEach(System.out::println);


    }
}