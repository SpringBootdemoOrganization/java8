package com.zhihao.miao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		TheInterface i1 = () -> {};
		System.out.println(i1.getClass().getInterfaces()[0]);
		
		TheInterface2 i2 = () -> {};
		System.out.println(i2.getClass().getInterfaces()[0]);
		
		new Thread(() -> System.out.println("hello Lambda")).start();
		
		List<String> list = Arrays.asList("hello","world","hello world");
		
		//list.forEach(str -> System.out.println(str.toUpperCase()));
		
		//这边的ArrayList<>中的String类型可以省略，官方文档中说这是diamond，中文翻译为砖石语法或者解释为菱形语法
		//也是编译器所支持的类型推断根据声明来推断出
		List<String> list2 = new ArrayList<>();
		
		//list.forEach(str -> list2.add(str.toUpperCase()));
		//list2.forEach(str -> System.out.println(str));
		
		//更简单的方式,map的参数是一个Function类型，传入的是输入参数和返回参数，这边输入参数是list中的每个元素
		//返回参数是list每个元素的大写返回
		list.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
		list.stream().map(String::toUpperCase).forEach(str -> System.out.println(str));
		
		
		
		
	}
}

@FunctionalInterface
interface TheInterface{
	void theMethod();
}

@FunctionalInterface
interface TheInterface2{
	void theMethod2();
}
