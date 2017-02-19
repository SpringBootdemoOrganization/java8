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
		
		//i���Բ�д�������ͣ����Խ��������ƶ�
		/*
		list.forEach(i -> {
			System.out.println(i);
		});
		*/
		
		//ͨ��������������������ʽ�ӿڵ�ʵ��(method references)
		list.forEach(System.out::println);
	}
}