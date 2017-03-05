package com.zhihao.stream02;


import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * �ҳ������д���2��Ԫ�أ�Ȼ��ÿ��Ԫ�س���2��Ȼ��������е�ǰ����Ԫ�أ�Ȼ����ȡ���е�ǰ����Ԫ�أ�������Ԫ�ص��ܺ͡�
 */
public class Stream01 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1,i -> i+2).limit(6);
//        int sum = stream.filter(i -> i>2).mapToInt(i -> i *2).skip(2).limit(2).sum();
//        System.out.println(sum);

          //max��min�������ص���OptionalInt����Ϊ�����û����Сֵ�������ֵ��ʱ����׳��쳣
        stream.filter(i -> i>200).mapToInt(i -> i *2).skip(2).limit(2).max().ifPresent(System.out::println);

        //�������Ҫ�������������ֵ����Сֵ���ͣ���ô��ô���أ�,���û�з���������ֵ����ôIntSummaryStatistics
        //�ж��������͵����ֵ����Сֵ���Ա��ڿ������׳��쳣
        IntSummaryStatistics intSummaryStatistics = stream.filter(i -> i>2).mapToInt(i -> i *2).
                skip(2).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getSum());

    }
}