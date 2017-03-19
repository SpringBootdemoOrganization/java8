package com.zhihao.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest3 {

    public static void main(String[] args) {
        //比较的元素都不为null，就按照比较器的顺序来比较
        List<String> list = Arrays.asList("nihao","hello","world","welcome");
        //list.sort(Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER));
        //System.out.println(list);

        //二个比较的值都为null，那么返回的比较结果是相等的
        List<String> list2 = Arrays.asList(null,null);
        list2.sort(Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER));
        System.out.println(list2);

        //如果比较器是null，那么就当作二个非空的比较元素是相等的。
        List<String> list3 = Arrays.asList("nihao","welcome","world","hello");
        list.sort(Comparator.nullsFirst(null));
        System.out.println(list); //[nihao, hello, world, welcome]
        System.out.println(".................");
        list3.sort(Comparator.nullsFirst(null)); //[nihao, welcome, world, hello]
        System.out.println(list3);

        //null元素小于非null的元素
        List<String> list4 = Arrays.asList("nihao","welcome","world","hello",null);
        list4.sort(Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER));
        System.out.println(list4); //[null, hello, nihao, welcome, world]

        //null元素大于非null的元素
        List<String> list5 = Arrays.asList(null,"nihao","welcome","world","hello");
        list5.sort(Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)); //[hello, nihao, welcome, world, null]
        System.out.println(list5);
    }
}
