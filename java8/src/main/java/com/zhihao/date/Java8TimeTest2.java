package com.zhihao.date;


import java.time.*;
import java.time.temporal.ChronoUnit;

public class Java8TimeTest2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //当前日期的二天后
        LocalDate localDate2 = localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate2);
        System.out.println("............");

        //当前时间的二个月之前
        LocalDate localDate3 = localDate.minus(2,ChronoUnit.MONTHS);
        System.out.println(localDate3);
        System.out.println("..............");

        Clock clock = Clock.systemDefaultZone(); //当前时区的时刻
        System.out.println(clock.millis()); //获得当前的毫秒数


        LocalDate localDate5 = LocalDate.now();
        LocalDate localDate6 = LocalDate.of(2017,4,12);
        System.out.println(localDate5.isBefore(localDate6));  //判断时间在什么时间之前
        System.out.println(localDate5.isAfter(localDate6)); //判断时间在什么时间之后
        System.out.println(localDate5.isEqual(localDate6)); //判断时间和什么时间相等
        System.out.println("..............");



    }
}
