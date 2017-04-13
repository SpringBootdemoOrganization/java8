package com.zhihao.date;


import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Java8TimeTest4 {
    public static void main(String[] args) {
        //LocalDate localDate1 = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2017,4,12);
        LocalDate localDate2 = LocalDate.of(2018,3,16);

        Period period = Period.between(localDate1,localDate2);
        System.out.println(period.getYears()); //获取相隔的年份差 0
        System.out.println(period.getMonths()); //获取相隔的月份差 11
        System.out.println(period.getDays()); //获取相隔的日子差 4

        System.out.println("...............");

        System.out.println(Instant.now()); //表示当前的不带时区的UTC标准时间,2017-04-12T14:40:29.309Z
    }
}
