package com.zhihao.stream03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStream {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan",100,20);
        Student stu2 = new Student("lisi",90,20);
        Student stu3 = new Student("wangwu",90,30);
        Student stu4 = new Student("zhangsan",80,40);

        List<Student> studentList = Arrays.asList(stu1,stu2,stu3,stu4);
//        Map<String,List<Student>> resultMap = studentList.stream().collect(Collectors.groupingBy(student -> student.getName()));
//        Map<String,List<Student>> resultMap = studentList.stream().collect(Collectors.groupingBy(Student::getName));

        //����score���з���
//        Map<Integer,List<Student>> resultMap = studentList.stream().collect(Collectors.groupingBy(Student::getScore));

        //�൱��select name,count(*) from student order by name
        //Map<String,Long> resultMap = studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));

        //�����������ƽ��ֵ
        //Map<String,Double> resultMap = studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getScore)));

        Map<Boolean,List<Student>> resultMap = studentList.stream().collect(Collectors.partitioningBy(stu -> stu.getScore() >= 90));
        List<Student> students = resultMap.get(true);
        System.out.println(students);
        System.out.println(resultMap);
    }
}