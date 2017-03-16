package com.zhihao.collector;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MySetCollector2<T> implements Collector<T,Set<T>,Map<T,T>>{
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoke!");
        //return HashSet::new;

        return () ->{
            System.out.println("--------------");
            return new HashSet<>();
        };
    }

    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoke!");
        return (set,item) -> {
            //如果是stream（单线程流，那么执行的线程是同一个，如果是并发流发现每个线程几乎都不一样
            //在characteristics方法中加入Characteristics.CONCURRENT枚举属性，在多次执行时会抛出
            // ConcurrentModificationException（并发修改异常）
            System.out.println("accumulator==="+"set=="+set+""+Thread.currentThread().getName());
            set.add(item);
        };
    }

    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoke!");
        return (set1,set2) -> {
            System.out.println("set1 ="+set1);
            System.out.println("set2 ="+set2);
            set1.addAll(set2);
            return set1;
        };
    }

    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoke!");
        return set -> {
            Map<T,T> map = new HashMap<>();
            set.stream().forEach(item -> map.put(item,item));
            return map;
        };
    }

    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoke!");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED,Characteristics.CONCURRENT));
        //return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
        //Indicates that the finisher function is the identity function and can be elided.  If set, it must be the
        // case that an unchecked cast from A to R will succeed.
        //IDENTITY_FINISH的意思就是表名 finisher函数是同一性函数可以被取消，如果是set，你必须确保一个未经检查的转换从A到R可以成功执行，如果不成功就会排除异常
        //而我们这边如果加上Characteristics.IDENTITY_FINISH表名中间容器类型和结果类型一致，很明显是错误的。
        //return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED,Characteristics.IDENTITY_FINISH));
    }

    public static void main(String[] args) {

        //当前主机的核心数（使用了超线程，一个内核通常被当作二个核心数来处理）
        System.out.println(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i <1 ; i++) {
            List<String> list = Arrays.asList("hello","world","hello world","hello","a","b","f","e","k","j","q");
            //System.out.println(list);
            Set<String> set = new HashSet<>();
            set.addAll(list);

            System.out.println(set);

            Map<String,String> map = list.stream().collect(new MySetCollector2<>());
            //Map<String,String> map = list.parallelStream().collect(new MySetCollector2<>());
            System.out.println(map);
        }



    }
}
