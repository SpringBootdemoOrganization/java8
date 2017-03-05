package com.zhihao.miao4;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("hello");
		Optional<String> optional2 = Optional.empty();
		
		//ʹ��optional.get������ʱ��Ҫʹ��optional.isPresent()����Ȼ�᲻�淶��idea������Ǿ��棬�������ַ���Ҳ�����Ƽ�
		if(optional.isPresent()){
			String str = optional.get();
			System.out.println(str);
		}else{
			
		}
		
		//�Ƽ���Optional��ʽ,optional2���Ϊ�գ���ô�Ͳ���ִ����
		optional.ifPresent(str -> System.out.println("optional"+str));
		optional2.ifPresent( str -> System.out.println(str));
		
		System.out.println("...................");
		
		//���optional2����Ϊ�գ���ô�ͷ���Ĭ�ϵ�ֵ��world
		System.out.println(optional2.orElse("world"));
		
		System.out.println("....................");
		System.out.println(optional2.orElseGet(() -> "nihao"));
		System.out.println(optional.orElseGet(() -> "nihao"));
	}
}