package com.zhihao.stream02;

import java.util.stream.Stream;

/**
 * ����1���������е�ÿ��Ԫ�ص�����ĸ��д��������Сд�����뵽����̨�ϡ������ִ��forEach��������ômap��Щ�м�����Ͳ���ִ�У�
 * ��ʵ�������е��м����������ִ�У�ֻ��������ʱ��ֵ�����ŻὫ֮ǰ���м��������˳��ȥ����ÿ��Ԫ��ȥִ�С�
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