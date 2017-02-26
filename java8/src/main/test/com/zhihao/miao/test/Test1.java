package com.zhihao.miao.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.forEach(item -> System.out.println(item));
		
		System.out.println("................");
		
		list.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		System.out.println(list.spliterator());
	}
}
