package com.zhihao.stream01;

import java.util.Arrays;
import java.util.List;

public class StreamTest3 {

    //有个整型的list，中的每个元素都乘以，然后求和
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list.stream().map(i -> 2*i).reduce(0,Integer::sum));
    }
}
