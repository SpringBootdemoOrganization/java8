package com.zhihao.joda;


import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.Date;

public class JodaTest2 {
    public static void main(String[] args) {
        DateTime today = new DateTime();
        DateTime datetorrow = today.plusDays(1);

        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(datetorrow.toString("yyyy-MM-dd"));

        System.out.println("......................");

        //获得一个时间的副本，将day设置成自己制定的时间
        DateTime d1 = today.withDayOfMonth(1);
        System.out.println(d1.toString("yyyy-MM-dd"));

        System.out.println("......................");

        LocalDate localDate = new LocalDate();
        System.out.println(localDate);

        System.out.println("........................");

        //获取当前时间三个月后的月份的最后一天
        localDate = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate);

        System.out.println("........................");


        //计算二年前第三个月最后一天的日期
        DateTime dateTime = new DateTime();
        DateTime dateTime2 = dateTime.minusYears(2).monthOfYear().setCopy(3).
                dayOfMonth().withMinimumValue();
        System.out.println(dateTime2.toString("yyyy-MM-dd"));

    }
}
