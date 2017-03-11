package com.zhihao.comparator;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao","hello","world","welcome");
        //list.sort(String::compareToIgnoreCase);
        //Collections.sort(list);

        //按照元素的长度进行排序
        //Collections.sort(list,(item1,item2) -> item1.length() -item2.length());

        //按照元素长度降序排序
        //Collections.sort(list, (item1,item2) -> item2.length()-item1.length());
        //另外一种实现
        //Collections.sort(list, Comparator.comparingInt(String::length).reversed());

        //为什么这边用lambda表达式的方式会报错呢？此时发现item的类型是Object类型,为什么这边的item是编译器无法推断出来呢？
        //因为这边的源码是表名这个的参数是list中的每个元素的<? super T>，T类型及其父类，这边的T是String
        //删除reversed编译器就可以推断出来item元素的类型，
        //Collections.sort(list,Comparator.comparingInt(item -> item.length()).reversed());

        //二者等价的
        //Collections.sort(list,Comparator.comparingInt((String item) -> item.length()).reversed());
        //list.sort(Comparator.comparingInt(String::length).reversed());

        //先根据元素的长度进行排序然后根据它的字母的顺序进行排序
        //Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
        //Collections.sort(list,Comparator.comparingInt(String::length).
                //thenComparing((item1,item2) -> item1.compareToIgnoreCase(item2)));
        //Collections.sort(list,Comparator.comparing(String::length).thenComparing(
                //Comparator.comparing(String::toLowerCase)));

        //先根据元素的长度进行排序，然后根据字母的逆序进行排序
        //Collections.sort(list,Comparator.comparingInt(String::length).
                //thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));

        //先是按照长度的倒序，然后再根据行吗的倒序
        Collections.sort(list,Comparator.comparingInt(String::length).reversed().
                thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));


        Collections.sort(list,Comparator.comparingInt(String::length).reversed().thenComparing
                (Comparator.comparing(String::toLowerCase,Comparator.reverseOrder()))
                //这一步是没有发生作用的，而上面的所有元素都已经通过比较器比较出结果了
                .thenComparing(Comparator.reverseOrder()));

        System.out.println(list);

    }
}
