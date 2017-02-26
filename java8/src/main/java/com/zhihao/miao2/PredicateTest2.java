package com.zhihao.miao2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateTest2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		PredicateTest2 predicateTest2 = new PredicateTest2();
		
		List<Integer> result = new ArrayList<Integer>();
		
		result = predicateTest2.conditionPredicate(list, item -> item % 2 == 0);
		System.out.println(result);
		System.out.println("...........");
		result = predicateTest2.conditionPredicate(list, item -> item % 2 != 0);
		System.out.println(result);
		System.out.println("...........");
		result = predicateTest2.conditionPredicate(list, item -> item >= 5);
		System.out.println(result);
		System.out.println("...........");
		result = predicateTest2.conditionPredicate(list, item -> item < 5);
		System.out.println(result);
		System.out.println("...........");
		
		result = predicateTest2.conditionPredicate(list, item -> true);
		System.out.println(result);
	}
	
	
	public List<Integer> conditionPredicate(List<Integer> list, Predicate<Integer> predicate){
		List<Integer> result = new ArrayList<Integer>();
		list.forEach( integer -> {
			if(predicate.test(integer)){
				result.add(integer);
			}
		});
		
		return result;
	}
}
