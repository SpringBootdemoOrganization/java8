package com.zhihao.miao3;

import java.util.function.Supplier;

public class StudentTest {
	public static void main(String[] args) {
		//ͨ��Supplier������Ϊû�в����Ĺ�������
		Supplier<Student> supplier = () -> new Student();
		System.out.println(supplier.get().getName());
		
		System.out.println("..............");
		
		//���캯������,��֤Student�������޲εĹ��캯��
		Supplier<Student> supplier2 = Student::new;
		System.out.println(supplier2.get().getName());
	}
}