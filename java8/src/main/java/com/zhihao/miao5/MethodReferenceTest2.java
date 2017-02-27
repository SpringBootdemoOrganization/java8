package com.zhihao.miao5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest2 {
	public static void main(String[] args) {
		Student stu1 = new Student("zhangsan",90);
		Student stu2 = new Student("lisi",40);
		Student stu3 = new Student("wangwu",70);
		Student stu4 = new Student("liliu",60);
		
		List<Student> students = Arrays.asList(stu1,stu2,stu3,stu4);
		
     	//lambda需要二个参数，第一个参数作为方法的调用者，而第二个参数作为方法的参数，如果Lambda是多个参数
		//那么也是以此类推
		students.sort(Student::compareByScore);
		System.out.println(students);
		
		//下面的列子更加直观的描述使用类名::实例方法（方法引用）
		List<String> cities = Arrays.asList("beijing","shanghai","qingdao","tianjing");
		//Collections.sort(cities, (city1,city2) -> city1.compareToIgnoreCase(city2));
		//cities.forEach((city)-> System.out.println(city));
		
		Collections.sort(cities, String::compareToIgnoreCase);
		cities.forEach(System.out::println);
		
	}
}
