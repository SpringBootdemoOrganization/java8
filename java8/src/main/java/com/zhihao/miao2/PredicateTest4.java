package com.zhihao.miao2;

import java.util.Date;
import java.util.Objects;
import java.util.function.Predicate;

public class PredicateTest4 {
	public static void main(String[] args) {
		PredicateTest4 test = new PredicateTest4();
//		System.out.println(test.isEqual("test").test("test"));
		
//		System.out.println(test.isEqual2(new Date()).test(new Date()));
		
		System.out.println(test.isEqual2(null).test(new Date()));
		
		System.out.println(Objects.isNull(null));
	}
	
//	public Predicate<String> isEqual(Object object){
//		return Predicate.isEqual(object);
//	}
	
	public Predicate<Date> isEqual2(Object object){
		return Predicate.isEqual(object);
	}
	
}
