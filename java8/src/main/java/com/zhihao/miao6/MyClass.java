package com.zhihao.miao6;

public class MyClass implements MyInterface,MyInterface2{
	
	//���MyInterface��myMethod���Ĭ�Ϸ�����MyInterface2Ҳ��myMethod���Ĭ�Ϸ�������ôҪ��д���myMethod������ᱨ��
	//�����Ҫȥ����MyInterface2��myMethodʵ�֣���ô����
	@Override
	public void myMethod(){
		MyInterface2.super.myMethod();
	}
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.myMethod();
	}
}