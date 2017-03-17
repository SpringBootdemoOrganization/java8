package com.zhihao.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest4 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        int sum = integerList.stream().collect(Collectors.summingInt(i -> i+10));
        System.out.println(sum);
    }
}
