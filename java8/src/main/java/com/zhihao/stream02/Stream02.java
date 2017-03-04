package com.zhihao.stream02;

import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i+2).limit(6);
//        System.out.println(stream);
//        System.out.println(stream.filter(i -> i> 2));
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //是因为stream已经在使用了，所以不能在使用了，还有一种情况也是stream不能使用，就是stream关闭了时候
//        System.out.println(stream.distinct());

        //下面的写法就是正确的，不过还是支持使用链式编程
        System.out.println(stream);
        Stream stream2 = stream.filter(i -> i >2);
        System.out.println(stream2);
        Stream stream3 = stream2.distinct();
        System.out.println(stream3);

    }
}
