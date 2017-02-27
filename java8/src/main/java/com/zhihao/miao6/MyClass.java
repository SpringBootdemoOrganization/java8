package com.zhihao.miao6;

public class MyClass implements MyInterface,MyInterface2{
	
	//如果MyInterface有myMethod这个默认方法，MyInterface2也有myMethod这个默认方法，那么要重写这个myMethod，否则会报错
	//如果想要去调用MyInterface2的myMethod实现，那么可以
	@Override
	public void myMethod(){
		MyInterface2.super.myMethod();
	}
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.myMethod();
	}
}
