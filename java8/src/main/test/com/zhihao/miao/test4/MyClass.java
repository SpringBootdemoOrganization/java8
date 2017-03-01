package com.zhihao.miao.test4;


public class MyClass implements MyInterface,MyInterface2{
    public void myMethod() {
        MyInterface2.super.myMethod();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
