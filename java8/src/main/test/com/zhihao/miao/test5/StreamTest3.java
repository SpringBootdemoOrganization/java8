package com.zhihao.miao.test5;

import java.util.stream.IntStream;

public class StreamTest3 {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4,5,6);
        System.out.println(intStream.map(i -> 2*i).reduce((a,b) -> a+b).getAsInt());;
    }
}
