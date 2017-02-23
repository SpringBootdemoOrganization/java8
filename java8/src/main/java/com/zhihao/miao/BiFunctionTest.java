package com.zhihao.miao;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {
	public static void main(String[] args) {
		BiFunctionTest test = new BiFunctionTest();
		System.out.println(test.compute(1, 2, (value1,value2) -> value1 + value2));
		System.out.println(test.compute(1, 2, (value1,value2) -> value1 - value2));
		System.out.println(test.compute(1, 2, (value1,value2) -> value1 * value2));
		System.out.println(test.compute(1, 2, (value1,value2) -> value1 / value2));
		
		System.out.println(test.compute2(2, 3,(value1,value2) -> value1+value2, value -> value*value));
	}
	
	public int compute(int a,int b,BiFunction<Integer,Integer,Integer> fun){
		return fun.apply(a, b);
	}
	
	public int compute2(int a,int b,BiFunction<Integer, Integer, Integer> fun1,Function<Integer,Integer> fun2){
		return fun1.andThen(fun2).apply(a, b);
	}
}
