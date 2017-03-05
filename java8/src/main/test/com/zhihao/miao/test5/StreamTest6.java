package com.zhihao.miao.test5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest6 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");
        //List<String> list = stream.collect(Collectors.toList());
//        List<String> list = stream.collect(ArrayList::new,(theList,item) ->
//                theList.add(item),(theList1,theList2) -> theList1.addAll(theList2));

        List<String> list = stream.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        System.out.println(list);
    }
}
