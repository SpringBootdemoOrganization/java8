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

        //�����ڶ�·����ģ�ֻҪ�ҵ�����������Ԫ�ؾͻᷢ����·�����治ִ���ˣ����������item��ӡ��������hello1,world,Ȼ����world����ҵ�����������
        //Ԫ�ط�����·������ִ����
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length ==5).limit(1).findFirst().ifPresent(System.out::println);
    }
}