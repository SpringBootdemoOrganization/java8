package com.zhihao.stream01;


import java.util.stream.IntStream;

public class StreamTest2 {
    public static void main(String[] args) {
        IntStream.of(new int[]{5,6,7}).forEach(System.out::println);
        System.out.println("...........");

        //������߲������ұ�
        IntStream.range(3,8).forEach(System.out::println);
        System.out.println("............");

        //������߰����ұ�
        IntStream.rangeClosed(3,8).forEach(System.out::println);
    }
}