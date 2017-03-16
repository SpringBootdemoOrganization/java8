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
            //�����stream�����߳�������ôִ�е��߳���ͬһ��������ǲ���������ÿ���̼߳�������һ��
            //��characteristics�����м���Characteristics.CONCURRENTö�����ԣ��ڶ��ִ��ʱ���׳�
            // ConcurrentModificationException�������޸��쳣��
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
        //IDENTITY_FINISH����˼���Ǳ��� finisher������ͬһ�Ժ������Ա�ȡ���������set�������ȷ��һ��δ������ת����A��R���Գɹ�ִ�У�������ɹ��ͻ��ų��쳣
        //����������������Characteristics.IDENTITY_FINISH�����м��������ͺͽ������һ�£��������Ǵ���ġ�
        //return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED,Characteristics.IDENTITY_FINISH));
    }

    public static void main(String[] args) {

        //��ǰ�����ĺ�������ʹ���˳��̣߳�һ���ں�ͨ��������������������������
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