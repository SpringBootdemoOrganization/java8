package com.zhihao.stream02;

import java.util.stream.IntStream;

/**
 * 这个demo因为iterate执行的结果是0，1，0，1。。。这样不断循环下去，然后去重永远只会取到0，1，而limit一直在等到达到6，所以输出结果
 * 虽然是0，1但是程序永远没有中断，而后者却可以，逻辑很容易懂得。
 */
public class Stream04 {
    public static void main(String[] args) {
        //IntStream.iterate(0, i -> (i+1) % 2).distinct().limit(6).forEach(System.out::println);

        IntStream.iterate(0,i -> (i+1) % 2).limit(6).distinct().forEach(System.out::println);

    }
}
