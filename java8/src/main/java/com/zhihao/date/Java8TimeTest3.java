package com.zhihao.date;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Java8TimeTest3 {
    public static void main(String[] args) {
        //时区
        Set<String> sets = ZoneId.getAvailableZoneIds();

        //sets.stream().forEach(System.out::println);

        //构建一个TreeSet的匿名内部类,然后里面是个代码块表示在实例创建的时候执行这个代码块
        TreeSet<String> treeSet = new TreeSet<String>(){
            {
                addAll(sets);
            }
        };

        treeSet.stream().forEach(System.out::println);

        System.out.println("........................");

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);//2017-04-12T22:05:22.500

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zonedDateTime); //2017-04-12T22:05:22.500+08:00[Asia/Shanghai]

        System.out.println("..................");

        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        System.out.println(yearMonth.lengthOfMonth());  //当月有多少天
        System.out.println(yearMonth.isLeapYear()); //是否是闰年

        System.out.println(".............");

        YearMonth yearMonth2 = YearMonth.of(2016,2);
        System.out.println(yearMonth2);
        System.out.println(yearMonth2.lengthOfMonth()); //当前的月有多少天
        System.out.println(yearMonth2.lengthOfYear()); //一年有多少天
        System.out.println(yearMonth2.isLeapYear()); //是否是闰年

    }
}
