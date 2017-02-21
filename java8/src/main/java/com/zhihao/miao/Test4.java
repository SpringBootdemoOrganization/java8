package com.zhihao.miao;

import java.util.function.Function;

public class Test4 {
	public static void main(String[] args) {
		//特殊的方法引用，因为toUpperCase没有输入参数，输入参数为调用该方法的String对象，
		Function<String, String> fun1 = String::toUpperCase;
		System.out.println(fun1.getClass().getInterfaces()[0]); //interface java.util.function.Function
	}
}
