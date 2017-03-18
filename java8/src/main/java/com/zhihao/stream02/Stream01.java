package com.zhihao.stream02;


import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * 找出该流中大于2的元素，然后将每个元素乘以2，然后忽略流中的前二个元素，然后再取流中的前两个元素，最后求出元素的总和。
 */
public class Stream01 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1,i -> i+2).limit(6);
//        int sum = stream.filter(i -> i>2).mapToInt(i -> i *2).skip(2).limit(2).sum();
//        System.out.println(sum);

        //max和min方法返回的是OptionalInt，因为如果在没有最小值或者最大值的时候会抛出异常
        stream.filter(i -> i>200).mapToInt(i -> i *2).skip(2).limit(2).max().ifPresent(System.out::println);

        //如果我想要符合条件的最大值，最小值，和，那么怎么做呢？,如果没有符合条件的值，那么IntSummaryStatistics
        //中定义了整型的最大值和最小值，以便在开发中抛出异常
        IntSummaryStatistics intSummaryStatistics = stream.filter(i -> i>2).mapToInt(i -> i *2).
                skip(2).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getSum());

    }
}
