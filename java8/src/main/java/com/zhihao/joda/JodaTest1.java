package com.zhihao.joda;


import org.joda.primitives.list.IntList;
import org.joda.primitives.list.impl.ArrayIntList;

public class JodaTest1 {
    //如果使用的是jdk提供的ArrayList<Integer>，那么底层就是生成一个Integer[],而使用IntList[]底层生成的就是int[]
    //避免了装箱拆箱的过程，效率更高
    public static void main(String[] args) {
        IntList intList = new ArrayIntList();

        intList.add(1);
        intList.add(2);

        intList.forEach(System.out::println);
    }
}
