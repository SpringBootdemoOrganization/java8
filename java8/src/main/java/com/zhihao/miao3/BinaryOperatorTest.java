package com.zhihao.miao3;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
	public static void main(String[] args) {
		BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();
		int result = binaryOperatorTest.compute(1, 2, (a,b) -> a+b);
		System.out.println(result);
		
		result = binaryOperatorTest.compute(1, 2, (a,b) -> a-b);
		System.out.println(result);
		
		String str = binaryOperatorTest.getCompareTo("hello123", "world", (a,b) -> a.length()-b.length());
		System.out.println(str);
		str = binaryOperatorTest.getCompareTo("hello123", "world", (a,b) -> a.charAt(0)-b.charAt(0));
		System.out.println(str);
		
	}
	
	public int compute(int a,int b,BinaryOperator<Integer> binaryOperator){
		return binaryOperator.apply(a, b);
	}
	
	public String getCompareTo(String a,String b,Comparator<String> comparator){
		return BinaryOperator.minBy(comparator).apply(a, b);
	}
}
