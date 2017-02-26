package com.zhihao.miao4;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("hello");
		Optional<String> optional2 = Optional.empty();
		
		//使用optional.get方法的时候要使用optional.isPresent()，不然会不规范，idea会给我们警告，不过这种方法也不被推荐
		if(optional.isPresent()){
			String str = optional.get();
			System.out.println(str);
		}else{
			
		}
		
		//推荐的Optional方式,optional2如果为空，那么就不会执行了
		optional.ifPresent(str -> System.out.println("optional"+str));
		optional2.ifPresent( str -> System.out.println(str));
		
		System.out.println("...................");
		
		//如果optional2对象为空，那么就返回默认的值即world
		System.out.println(optional2.orElse("world"));
		
		System.out.println("....................");
		System.out.println(optional2.orElseGet(() -> "nihao"));
		System.out.println(optional.orElseGet(() -> "nihao"));
	}
}
