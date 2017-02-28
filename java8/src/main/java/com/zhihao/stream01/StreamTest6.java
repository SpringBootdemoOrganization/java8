package com.zhihao.stream01;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest6 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello World");
//        List<String> list = stream.collect(() -> new ArrayList<String>(),(theList,item) -> theList.add(item),
//                (theList1,theList2) -> theList1.addAll(theList2));
        List<String>  list = stream.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);
        list.forEach(System.out::println);
    }
}
