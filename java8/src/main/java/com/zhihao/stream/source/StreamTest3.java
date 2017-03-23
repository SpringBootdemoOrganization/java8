package com.zhihao.stream.source;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class StreamTest3 {

    public static void main(String[] args) {
        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i -> System.out.println(i);

        System.out.println(consumer instanceof Consumer);
        System.out.println(intConsumer instanceof  IntConsumer);

        test(consumer);  //面向对象方式
        test(consumer::accept); //函数式接口
        test(intConsumer::accept); //函数式接口
    }


    public static void test(Consumer<Integer> action){
        action.accept(1000);
    }
}
