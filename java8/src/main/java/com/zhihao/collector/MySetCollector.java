package com.zhihao.collector;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MySetCollector<T> implements Collector<T,Set<T>,Set<T>>{

    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("Supplier invoke!");
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("BiConsumer invoke!");
        //return (set,t) -> set.add(t);
        return Set<T>::add;
    }

    //只有并发的时候才去调用
    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("BinaryOperator invoke!");
        return (set1,set2) ->{
            set1.addAll(set2);
            return set1;
        };
    }

    //因为我们这边的最终的返回结果类型和中间容器的类型是一致的，也可以抛出异常
    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher invoke!");
        //return t -> t;
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoke!");
        //IDENTITY_FINISH表示accumulator和finisher函数是一致的，而UNORDERED表示无序的
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH,Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","welcome","hello");
        Set<String> set = list.stream().collect(new MySetCollector<>());
        System.out.println(set);

    }
}
