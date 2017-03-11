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

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("BinaryOperator invoke!");
        return (set1,set2) ->{
            set1.addAll(set2);
            return set1;
        };
    }

    //��Ϊ������ߵ����յķ��ؽ�����ͺ��м�������������һ�µ�
    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher invoke!");
        //return t -> t;
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoke!");
        //IDENTITY_FINISH��ʾaccumulator��finisher������һ�µģ���UNORDERED��ʾ�����
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH,Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","welcome","hello");
        Set<String> set = list.stream().collect(new MySetCollector<>());
        System.out.println(set);

    }
}