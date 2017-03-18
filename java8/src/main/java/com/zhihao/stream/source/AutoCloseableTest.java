package com.zhihao.stream.source;

public class AutoCloseableTest implements AutoCloseable{

    public void doSomething(){
        System.out.println("doSomething invoke");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close invoke!");
    }


    public static void main(String[] args) throws Exception {

        //会在try with-resources之后隐式的调用AutoCloseable的close方法关闭资源
        try(AutoCloseableTest test = new AutoCloseableTest()){
            test.doSomething();
        }
    }


}
