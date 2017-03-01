package com.zhihao.miao.test3;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest2 {

    public String getString(Supplier<String> supplier){
        return supplier.get()+"test";
    }

    public String getString2(String str,Function<String,String> fun1){
        return fun1.apply(str);
    }

    public static void main(String[] args) {
        MethodReferenceTest2 test = new MethodReferenceTest2();
        System.out.println(test.getString(String::new));

        System.out.println(test.getString2("hello",String::new));
    }
}
