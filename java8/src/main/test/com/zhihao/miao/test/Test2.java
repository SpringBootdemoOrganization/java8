package com.zhihao.miao.test;

@FunctionalInterface
interface MyFunctionalInterface{
	void test();
	String toString();
}
public class Test2 {
	
	public void myTest(MyFunctionalInterface myFunctionalInterface){
		myFunctionalInterface.test();
	}
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.myTest(new MyFunctionalInterface() {
			public void test() {
				System.out.println("hello world");
			}
		});
		
		
		test.myTest(() -> {
			System.out.println("hello wolrd");
		});
		
		MyFunctionalInterface myFunctionalInterface = () -> System.out.println("hello wolrd");
		System.out.println(myFunctionalInterface.getClass().getName());
		System.out.println(myFunctionalInterface.getClass().getInterfaces()[0]);
		System.out.println(myFunctionalInterface.getClass().getSuperclass());
		
		
		
		
	}
}
