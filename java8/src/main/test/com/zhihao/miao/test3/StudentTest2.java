package com.zhihao.miao.test3;

import java.util.Arrays;
import java.util.List;

public class StudentTest2 {
    public static void main(String[] args) {
        Student student1 = new Student("miaozhihao",23);
        Student student2 = new Student("zhangxueyou",34);
        Student student3 = new Student("lilianjie",16);
        Student student4 = new Student("suyoupeng",22);

        List<Student> studentList = Arrays.asList(student1,student2,student3,student4);
        StudentCompare studentCompare =new StudentCompare();
        studentList.sort(studentCompare::compose);
        System.out.println(studentList);
    }
}
