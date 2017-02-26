package com.zhihao.miao.test2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {
	public static void main(String[] args) {
		System.out.println(compose(2,3,(a,b) -> a + b));
		System.out.println(compose(2,3,(a,b) -> a - b));
		System.out.println(compose(2,3,(a,b) -> a * b));
		System.out.println(compose(2,3,(a,b) -> a % b));
		
		System.out.println(compose2(2,3,(a,b) -> a + b,a -> a*a));
	}
	
	public static int compose(int a,int b,BiFunction<Integer,Integer,Integer> fun){
		return fun.apply(a, b);
	}
	
	public static int compose2(int a,int b,BiFunction<Integer,Integer,Integer> bifun,Function<Integer,Integer> fun){
		return bifun.andThen(fun).apply(a, b);
	}
}
