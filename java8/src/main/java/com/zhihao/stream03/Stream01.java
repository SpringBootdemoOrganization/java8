package com.zhihao.stream03;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * �����������ģ���list�е�Ԫ��������list2��Ԫ�ؽ������������õ���flatMap�������ܳ���������������ܼ�
 */
public class Stream01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi","Hello","���");
        List<String> list2 = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");

        /*
        list.forEach(item -> {
            list2.forEach(item2 -> System.out.println(item.concat(",").concat(item2)));
        });
        */

        List<String> resultList = list.stream().flatMap(item -> list2.stream().map(item2 -> item.concat(",").
                concat(item2))).collect(Collectors.toList());
        resultList.forEach(System.out::println);
    }
}