package com.zhihao.miao;

import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		Predicate<String> pre = p -> p.length() > 5;
		System.out.println(pre.test("hello"));
	}
}
