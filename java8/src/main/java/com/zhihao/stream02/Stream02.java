package com.zhihao.stream02;

import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i+2).limit(6);
//        System.out.println(stream);
//        System.out.println(stream.filter(i -> i> 2));
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //����Ϊstream�Ѿ���ʹ���ˣ����Բ�����ʹ���ˣ�����һ�����Ҳ��stream����ʹ�ã�����stream�ر���ʱ��
//        System.out.println(stream.distinct());

        //�����д��������ȷ�ģ���������֧��ʹ����ʽ���
        System.out.println(stream);
        Stream stream2 = stream.filter(i -> i >2);
        System.out.println(stream2);
        Stream stream3 = stream2.distinct();
        System.out.println(stream3);

    }
}