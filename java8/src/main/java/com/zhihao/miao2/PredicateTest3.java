package com.zhihao.miao2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		PredicateTest3 test3 = new PredicateTest3();
		List<Integer> result = new ArrayList<>();
		
		result = test3.conditionPredicate(list, item -> item % 2 == 0, item -> item > 5);
		System.out.println(result);
		
		result = test3.conditionPredicate2(list, item -> item % 2 == 0, item -> item > 5);
		System.out.println(result);
		
	}
	
	
	public List<Integer> conditionPredicate(List<Integer> list,Predicate<Integer> pre1,Predicate<Integer> pre2){
		List<Integer> result = new ArrayList<>();
		list.forEach( integer -> {
			if(pre1.and(pre2).test(integer)){
				result.add(integer);
			}
		});
		
		return result;
	}
	
	public List<Integer> conditionPredicate2(List<Integer> list,Predicate<Integer> pre1,Predicate<Integer> pre2){
		List<Integer> result = new ArrayList<>();
		list.forEach( integer -> {
			if(pre1.and(pre2).negate().test(integer)){
				result.add(integer);
			}
		});
		
		return result;
	}

}
