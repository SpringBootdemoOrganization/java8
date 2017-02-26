package com.zhihao.miao.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello","world","hello world");
		List<String> result = new ArrayList<>();
		list.forEach(item -> {
			result.add(item.toUpperCase());
		});
		
		System.out.println(result);
		
		list.stream().map(item -> item.toLowerCase()).forEach(item -> System.out.println(item.toUpperCase()));
	}
}
