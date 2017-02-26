package com.zhihao.miao.test;

import java.util.function.Function;

public class Test4 {
	public static void main(String[] args) {
		Function<String,String> function = String::toUpperCase;
		System.out.println(function.getClass().getInterfaces()[0]);
	}
}
