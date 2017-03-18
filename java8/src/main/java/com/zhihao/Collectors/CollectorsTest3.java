package com.zhihao.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsTest3 {
    public static void main(String[] args) {
        People people1 = new People("shanghai","tom","james");
        People people2 = new People("beijing","jack","ma");
        People people3 = new People("wuhan","mills","zhu");
        People people4 = new People("suzhou","mike","liu");
        People people5 = new People("suzhou","hao","zhu");
        People people6 = new People("beijing","jun","yan");
        People people7 = new People("suzhou","hao","liu");



        List<People> peoples = Arrays.asList(people1,people2,people3,people4,people5,people6,people7);


        Map<String,Set<String>> setMap =peoples.stream().collect(Collectors.groupingBy(People::getCity,
                Collectors.mapping(People::getLastName,Collectors.toSet())));

        System.out.println(setMap);

        System.out.println(".........................");

        peoples.stream().collect(Collectors.groupingBy(People::getCity,TreeMap::new,
                Collectors.mapping(People::getLastName,Collectors.toSet())));

        System.out.println(".........................");

        List<String> stringList = peoples.stream().map(People::getLastName).collect(Collectors.collectingAndThen(Collectors.toList(),
                Collections::unmodifiableList));
        System.out.println(stringList);

    }
}
