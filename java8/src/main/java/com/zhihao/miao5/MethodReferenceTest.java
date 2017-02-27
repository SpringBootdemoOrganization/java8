package com.zhihao.miao5;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
	public static void main(String[] args) {
		Student stu1 = new Student("zhangsan",90);
		Student stu2 = new Student("lisi",40);
		Student stu3 = new Student("wangwu",70);
		Student stu4 = new Student("liliu",60);
		
		List<Student> students = Arrays.asList(stu1,stu2,stu3,stu4);
		
     	students.sort((student,student2) -> student.getScore()-student2.getScore()); 
		System.out.println(students);
		
		students.sort( (student1,student2) -> {
			return Student.compareStudentByScore(student1,student2);
		}); 
		
		System.out.println(students);
		
		System.out.println("..................");
		
		students.sort(Student::compareStudentByScore);
		System.out.println(students);
		
		StudentCompare studentCompare = new StudentCompare();
		
		students.sort((student1,student2) -> studentCompare.compareStudentByScore(student1, student2)); 
		
		System.out.println(students);
		
		students.sort(studentCompare::compareStudentByName);
		System.out.println(students);
		
		
	}
}
