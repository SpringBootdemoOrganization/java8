package com.zhihao.stream02;

import java.util.stream.IntStream;

/**
 * ���demo��Ϊiterateִ�еĽ����0��1��0��1��������������ѭ����ȥ��Ȼ��ȥ����Զֻ��ȡ��0��1����limitһֱ�ڵȵ��ﵽ6������������
 * ��Ȼ��0��1���ǳ�����Զû���жϣ�������ȴ���ԣ��߼������׶��á�
 */
public class Stream04 {
    public static void main(String[] args) {
        //IntStream.iterate(0, i -> (i+1) % 2).distinct().limit(6).forEach(System.out::println);

        IntStream.iterate(0,i -> (i+1) % 2).limit(6).distinct().forEach(System.out::println);

    }
}