package com.zhihao.stream02;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * �������봮������ִ��Ч�ʶԱ�
 */
public class Stream05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);

        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }


        System.out.println("排序开始");

        long startTime =System.nanoTime();

        //串行操作时间与并行操作时间上的差异
        //list.stream().sorted().count();
        list.parallelStream().sorted().count();

        System.out.println("排序结束");

        long endTime = System.nanoTime();

        long miles = TimeUnit.NANOSECONDS.toMillis(endTime-startTime);

        System.out.println(miles);
    }
}
