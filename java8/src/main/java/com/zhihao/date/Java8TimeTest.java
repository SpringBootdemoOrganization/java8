package com.zhihao.date;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

public class Java8TimeTest {
    public static void main(String[] args) {
        //关注与年月日
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.getYear()+", "+localDate.getMonthValue()+", "+localDate.getDayOfMonth());

        System.out.println("------------------");

        LocalDate localDate2 = LocalDate.of(2017,4,1);
        System.out.println(localDate2);

        System.out.println("------------------");

        //月份和日
        LocalDate localDate3 = LocalDate.of(2017,3,25);
        MonthDay monthDay = MonthDay.of(localDate3.getMonth(),localDate3.getDayOfMonth());
        MonthDay monthDay2 = MonthDay.from(LocalDate.of(2014,3,25));

        if(monthDay.equals(monthDay2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        //关注与时分秒
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time2 = time.plusHours(3).plusMinutes(40);
        System.out.println(time2);


    }
}
