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
		
		//��ߵ�ArrayList<>�е�String���Ϳ���ʡ�ԣ��ٷ��ĵ���˵����diamond�����ķ���Ϊשʯ�﷨���߽���Ϊ�����﷨
		//Ҳ�Ǳ�������֧�ֵ������ƶϸ����������ƶϳ�
		List<String> list2 = new ArrayList<>();
		
		//list.forEach(str -> list2.add(str.toUpperCase()));
		//list2.forEach(str -> System.out.println(str));
		
		//���򵥵ķ�ʽ,map�Ĳ�����һ��Function���ͣ����������������ͷ��ز�����������������list�е�ÿ��Ԫ��
		//���ز�����listÿ��Ԫ�صĴ�д����
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