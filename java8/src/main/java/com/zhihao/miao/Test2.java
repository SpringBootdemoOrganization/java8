package com.zhihao.miao;

@FunctionalInterface
interface MyInterface {
	void test();
	
	String toString();
}

public class Test2{
	
	public void myTest(MyInterface myInterface){
		System.out.println(1);
		myInterface.test();
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		Test2 test = new Test2();
		
		test.myTest(new MyInterface() {
			@Override
			public void test() {
				System.out.println("mytest");
			}
		});
		
		//使用Lambda表达式写法，mytest方法中的就是MyInterface的一个实现，使用Lambda表达式创建其MyInterface的一个实现
		test.myTest(() -> {
			System.out.println("mytest");
		});
		
		System.out.println("-----------");
		
		//myInterface就是MyInterface的一个实现
		MyInterface myInterface = ()  -> {
			System.out.println("hello");
		};
		
		System.out.println(myInterface.getClass());   //就是一个myInterface的实现
		System.out.println(myInterface.getClass().getSuperclass());  //Object类
		System.out.println(myInterface.getClass().getInterfaces()[0]);
	}
}
