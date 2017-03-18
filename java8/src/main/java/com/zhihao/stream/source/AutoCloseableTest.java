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

        //����try with-resources֮����ʽ�ĵ���AutoCloseable��close�����ر���Դ
        try(AutoCloseableTest test = new AutoCloseableTest()){
            test.doSomething();
        }
    }


}