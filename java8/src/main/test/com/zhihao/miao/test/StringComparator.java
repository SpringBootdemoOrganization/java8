package com.zhihao.miao.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");
//		Collections.sort(list,new Comparator<String>(){
//			public int compare(String s1, String s2) {
//				return s1.compareTo(s2);
//			}
//			
//		});
		
		System.out.println(list);
		
//		Collections.sort(list,(s1,s2) -> s1.compareTo(s2));
//		
//		System.out.println(list);
		
//		Collections.sort(list,Comparator.naturalOrder());
//		
//		System.out.println(list);
		
		list.sort((s1,s2) -> s1.compareTo(s2));
		
		System.out.println(list);
	}
}
