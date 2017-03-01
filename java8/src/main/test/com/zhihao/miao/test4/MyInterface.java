package com.zhihao.miao.test4;

public interface MyInterface {
    default void myMethod(){
        System.out.println("MyInterface");
    }
}
