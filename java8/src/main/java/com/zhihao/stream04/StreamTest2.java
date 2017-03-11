package com.zhihao.stream04;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest2 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",80);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",100);
        Student student4 = new Student("zhaoliu",90);
        Student student5 = new Student("zhaoliu",90);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5);

        //找出Student列表中分数最小的学生
        students.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);

        //找出Student列表中分数最大的学生
        students.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);

        //找出学生列表中分数的平均值
        Double scoreAver = students.stream().collect(Collectors.averagingInt(Student::getScore));
        System.out.println(scoreAver);

        //算出学生分数的总和
        int scoreTotal = students.stream().collect(Collectors.summingInt(Student::getScore));
        System.out.println(scoreTotal);

        IntSummaryStatistics intSummaryStatistics =  students.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println(intSummaryStatistics); //IntSummaryStatistics{count=4, sum=360, min=80, average=90.000000, max=100}

        //将student列表中的姓名拼接起来，
        System.out.println(students.stream().map(student -> student.getName()).collect(Collectors.joining()));
        System.out.println(students.stream().map(student -> student.getName()).collect(Collectors.joining(", ")));
        System.out.println(students.stream().map(student -> student.getName()).collect(Collectors.joining(", ","<begin> "," <end>")));

        //先使用分数进行分组，然后使用名字进行分组
        Map<Integer,Map<String,List<Student>>> map =students.stream().collect(Collectors.groupingBy(Student::getScore,Collectors.groupingBy(Student::getName)));
        System.out.println(map);

        //分数大于80的在一个分区，小于80的在一个分区
        Map<Boolean,List<Student>> map2 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 80));
        System.out.println(map2);

        //分数大于80的在一个分区，小于80的在一个分区，然后大于80中再次分区（大于90的进行分区）
        Map<Boolean,Map<Boolean,List<Student>>> map3 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 80,
                Collectors.partitioningBy(student -> student.getScore() >= 90)));
        System.out.println(map3);

        //分数大于80的先分区，然后统计各区的个数
        Map<Boolean,Long> map4 = students.stream().collect(
                Collectors.partitioningBy(student -> student.getScore()>80,Collectors.counting()));
        System.out.println(map4);

        //根据名字分组，在得到每组学生中分数最低的学生
        Map<String,Student> map5 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.collectingAndThen(
                Collectors.minBy(Comparator.comparingInt(Student::getScore)),Optional::get)));
        System.out.println(map5);


    }
}
