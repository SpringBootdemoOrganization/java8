package com.zhihao.miao;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		FunctionTest test = new FunctionTest();
		System.out.println(test.compute(1, value -> {return 2 * value;}));
		System.out.println(test.compute(5, value -> 5 + value));
		System.out.println(test.compute(3, value -> value * value ));
		
		System.out.println(test.compute(1));
		
		System.out.println(test.convert(4, value -> String.valueOf(value+"hello")));
		
		Function<Integer,Integer> fun1 = value -> value * 2;
		System.out.println(test.compute(1, fun1));
	}
	
	public int compute(int a,Function<Integer,Integer> function){
		int result = function.apply(a);
		return result;
	}
	
	public String convert(int a,Function<Integer,String> function){
		return function.apply(a);
	}
	
	public int compute(int a){
		return 2 * a;
	}
	
	public int compute2(int a){
		return 5 + a;
	}
	
	public int compute3(int a){
		return a * a;
	}
}


