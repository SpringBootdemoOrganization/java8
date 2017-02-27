package com.zhihao.miao5;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest3 {
	public String getString(Supplier<String> supplier){
		return supplier.get()+"test";
	}
	
	public String getString2(String str,Function<String,String> function){
		return function.apply(str);
	}
	
	public static void main(String[] args) {
		MethodReferenceTest3 test = new MethodReferenceTest3();
		System.out.println(test.getString(String::new));
		System.out.println(test.getString2("hello", String::new));
	}
}
