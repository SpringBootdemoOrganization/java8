package com.zhihao.miao.test2;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Student> supplier = () -> new Student();
		System.out.println(supplier.get().getName());
		
		System.out.println(".....................");
		
		Supplier<Student> supplier2 = Student::new;
		String name = supplier2.get().getName();
		System.out.println(name);
	}
}
