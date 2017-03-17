package com.zhihao.Collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest4 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        int sum = integerList.stream().collect(Collectors.summingInt(i -> i+10));
        System.out.println(sum);

        double average = integerList.stream().collect(Collectors.averagingInt(i -> i+10));
        System.out.println(average);

        int sum2 = integerList.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum2);

        //验证的就是当集合中的没有元素的时候返回identity参数值
        int sum3 = new ArrayList<Integer>().stream().reduce(9,(a,b) -> a+b);
        System.out.println(sum3);
    }
}
