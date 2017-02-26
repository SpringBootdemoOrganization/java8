package com.zhihao.miao3;

import java.util.function.Supplier;

public class StudentTest {
	public static void main(String[] args) {
		//通过Supplier可以作为没有参数的工厂方法
		Supplier<Student> supplier = () -> new Student();
		System.out.println(supplier.get().getName());
		
		System.out.println("..............");
		
		//构造函数引用,保证Student类中有无参的构造函数
		Supplier<Student> supplier2 = Student::new;
		System.out.println(supplier2.get().getName());
	}
}
