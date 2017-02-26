package com.zhihao.miao.test2;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
	public static void main(String[] args) {
		BinaryOperatorTest test = new BinaryOperatorTest();
		int result = test.operate(2, 3, (a,b) -> a + b);
		System.out.println(result);
		
		
		result = test.compateTwoInteger(2, 3, (a,b) -> b-a);
		System.out.println(result);
	}
	
	public int operate(int a,int b,BinaryOperator<Integer> oper){
		return oper.apply(a, b);
	}
	
	public int compateTwoInteger(int a,int b,Comparator<Integer> comparator){
		return BinaryOperator.maxBy(comparator).apply(a, b);
	}
}
