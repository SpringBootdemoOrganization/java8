package com.zhihao.miao6;

public interface MyInterface {
	
	default void myMethod(){
		System.out.println("myInterface");
	}
}
