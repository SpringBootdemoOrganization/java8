package com.zhihao.miao.test3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("miaozhihao",23);
        Student student2 = new Student("zhangxueyou",34);
        Student student3 = new Student("lilianjie",16);
        Student student4 = new Student("suyoupeng",22);

        //�������õĵ�һ�ַ�ʽ������+��̬����
        List<Student> studentList = Arrays.asList(student1,student2,student3,student4);
//        studentList.sort((stu1, stu2) -> stu1.getAge()-stu2.getAge());
//        System.out.println(studentList);

//        studentList.sort((stu1, stu2) -> stu1.getName().compareToIgnoreCase(stu2.getName()));
//        System.out.println(studentList);

        studentList.sort(Student::compose);
        System.out.println(studentList);

    }
}