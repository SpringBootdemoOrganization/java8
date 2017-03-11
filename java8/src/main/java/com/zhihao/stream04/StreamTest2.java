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

        //�ҳ�Student�б��з�����С��ѧ��
        students.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);

        //�ҳ�Student�б��з�������ѧ��
        students.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);

        //�ҳ�ѧ���б��з�����ƽ��ֵ
        Double scoreAver = students.stream().collect(Collectors.averagingInt(Student::getScore));
        System.out.println(scoreAver);

        //���ѧ���������ܺ�
        int scoreTotal = students.stream().collect(Collectors.summingInt(Student::getScore));
        System.out.println(scoreTotal);

        IntSummaryStatistics intSummaryStatistics =  students.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println(intSummaryStatistics); //IntSummaryStatistics{count=4, sum=360, min=80, average=90.000000, max=100}

        //��student�б��е�����ƴ��������
        System.out.println(students.stream().map(student -> student.getName()).collect(Collectors.joining()));
        System.out.println(students.stream().map(student -> student.getName()).collect(Collectors.joining(", ")));
        System.out.println(students.stream().map(student -> student.getName()).collect(Collectors.joining(", ","<begin> "," <end>")));

        //��ʹ�÷������з��飬Ȼ��ʹ�����ֽ��з���
        Map<Integer,Map<String,List<Student>>> map =students.stream().collect(Collectors.groupingBy(Student::getScore,Collectors.groupingBy(Student::getName)));
        System.out.println(map);

        //��������80����һ��������С��80����һ������
        Map<Boolean,List<Student>> map2 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 80));
        System.out.println(map2);

        //��������80����һ��������С��80����һ��������Ȼ�����80���ٴη���������90�Ľ��з�����
        Map<Boolean,Map<Boolean,List<Student>>> map3 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 80,
                Collectors.partitioningBy(student -> student.getScore() >= 90)));
        System.out.println(map3);

        //��������80���ȷ�����Ȼ��ͳ�Ƹ����ĸ���
        Map<Boolean,Long> map4 = students.stream().collect(
                Collectors.partitioningBy(student -> student.getScore()>80,Collectors.counting()));
        System.out.println(map4);

        //�������ַ��飬�ڵõ�ÿ��ѧ���з�����͵�ѧ��
        Map<String,Student> map5 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.collectingAndThen(
                Collectors.minBy(Comparator.comparingInt(Student::getScore)),Optional::get)));
        System.out.println(map5);


    }
}