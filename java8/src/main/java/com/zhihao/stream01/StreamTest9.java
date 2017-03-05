package com.zhihao.stream01;

import java.util.UUID;
import java.util.stream.Stream;

public class StreamTest9 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        //findFirst��һ����·���ն˲���
        stream.findFirst().ifPresent(System.out::println);

        //findFirst����һ��Optional����ifPresent����ȷ�÷�
        Stream<String> stream2 = Stream.empty();
        stream2.findFirst().ifPresent(System.out::println);

        //iterate���ص���һ��������������ѭ��ִ��f(i),f(f(i)),f(f(f(i))),һ�㶼�����limit�����ƴ���
        Stream.iterate(1,i -> i+2).limit(6).forEach(System.out::println);
    }
}