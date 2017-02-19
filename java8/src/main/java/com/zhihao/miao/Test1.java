package com.zhihao.miao;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		for(int i = 0;i<list.size();i++){
			System.out.println(i);
		}
		
		System.out.println("----------");
		
		for(Integer i : list){
			System.out.println(i);
		}
		
		System.out.println("............");
		
		/*
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		});
		*/
		
		//i可以不写它的类型，可以进行类型推断
		/*
		list.forEach(i -> {
			System.out.println(i);
		});
		*/
		
		//通过方法引用来创建函数式接口的实例(method references)
		list.forEach(System.out::println);
	}
}
