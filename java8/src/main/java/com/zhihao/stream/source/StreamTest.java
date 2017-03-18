package com.zhihao.stream.source;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");

        NullPointerException nullPointerException = new NullPointerException();

        try(Stream<String> stream = list.stream()){
            stream.onClose(() -> {
                System.out.println("aaa");
                //throw new NullPointerException("first exception");
                //throw nullPointerException;
                throw new NullPointerException("first exception");
            }).onClose(() -> {
                System.out.println("bbb");
                //throw new ArithmeticException("secord exception");
                //throw nullPointerException;
                throw new NullPointerException("secord exception");
            }).forEach(System.out::println);
        }
    }
}
