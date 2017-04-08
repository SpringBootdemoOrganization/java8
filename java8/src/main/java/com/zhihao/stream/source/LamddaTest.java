package com.zhihao.stream.source;

/**
 * 匿名内部类的名称由当前类加上$加上在这个类中的第几个内部类的顺序组成
 * 
 * 从这个类子中我们知道lamdba表达式和匿名内部类是不同的二个概念，作用域不一样
 */
public class LamddaTest {

    //com.zhihao.stream.source.LamddaTest@63a4b9de
    Runnable r1 = () -> System.out.println(this);

    //匿名内部类
    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            //com.zhihao.stream.source.LamddaTest$1@1188fc84
            System.out.println(this);
        }
    };


    public static void main(String[] args) {
        LamddaTest lamddaTest = new LamddaTest();

        Thread t1 = new Thread(lamddaTest.r1);
        t1.start();

        System.out.println("...................");


        Thread t2 = new Thread(lamddaTest.r2);
        t2.start();


    }
}
