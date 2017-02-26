package com.zhihao.miao.test2;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		System.out.println(compute(2, (a) -> a * a));
		System.out.println(compute(2, (a) -> a + 5));
		System.out.println(compute(2, (a) -> a - 1));
		System.out.println(compute(2, (a) -> a % 2));
	}
	
	public static int compute(int a,Function<Integer,Integer> fun){
		return fun.apply(a);
	}
}
