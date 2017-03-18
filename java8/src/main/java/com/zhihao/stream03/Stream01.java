package com.zhihao.stream03;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 需求是这样的，将list中的元素依次与list2的元素结合起来。这边用到了flatMap函数，很抽象的做法，不过很简单
 */
public class Stream01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi","Hello","你好");
        List<String> list2 = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");

        /*
        list.forEach(item -> {
            list2.forEach(item2 -> System.out.println(item.concat(",").concat(item2)));
        });
        */

        List<String> resultList = list.stream().flatMap(item -> list2.stream().map(item2 -> item.concat(",").
                concat(item2))).collect(Collectors.toList());
        resultList.forEach(System.out::println);
    }
}
