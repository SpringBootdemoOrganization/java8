package com.zhihao.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan",26);
        Person person2 = new Person("lisi",28);
        Person person3 = new Person("wangwu",30);
        Person person4 = new Person("zhaoliu",45);

        List<Person> personList = Arrays.asList(person1,person2,person3,person4);

        List<String> names = personList.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(names);

        //将名字存放到一个有序的Set中
        Set<String> stringSet = personList.stream().map(Person::getName).collect(Collectors.toSet());
        Set<String> stringSet2 = personList.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));

        System.out.println(stringSet);
        System.out.println(stringSet2);

        String namestr = personList.stream().map(Person::getName).collect(Collectors.joining(","));
        System.out.println(namestr);


    }
}
