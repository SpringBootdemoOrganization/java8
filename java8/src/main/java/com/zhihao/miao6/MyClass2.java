package com.zhihao.miao6;

public class MyClass2 extends MyInterfaceImpl implements MyInterface2{
	
	//MyInterfaceImpl中有myMethod的实现，MyInterface2中也有myMethod的实现，那么执行的是myMethod方法
	//实现类优于接口
	public static void main(String[] args) {
		MyClass2 myClass2 = new MyClass2();
		myClass2.myMethod();
	}

}
