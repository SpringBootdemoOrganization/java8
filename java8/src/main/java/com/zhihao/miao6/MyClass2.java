package com.zhihao.miao6;

public class MyClass2 extends MyInterfaceImpl implements MyInterface2{
	
	//MyInterfaceImpl����myMethod��ʵ�֣�MyInterface2��Ҳ��myMethod��ʵ�֣���ôִ�е���myMethod����
	//ʵ�������ڽӿ�
	public static void main(String[] args) {
		MyClass2 myClass2 = new MyClass2();
		myClass2.myMethod();
	}

}