package com.zhihao.miao;

import java.util.function.Function;

public class Test4 {
	public static void main(String[] args) {
		//����ķ������ã���ΪtoUpperCaseû������������������Ϊ���ø÷�����String����
		Function<String, String> fun1 = String::toUpperCase;
		System.out.println(fun1.getClass().getInterfaces()[0]); //interface java.util.function.Function
	}
}