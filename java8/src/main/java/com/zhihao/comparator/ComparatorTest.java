package com.zhihao.comparator;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao","hello","world","welcome");
        //list.sort(String::compareToIgnoreCase);
        //Collections.sort(list);

        //����Ԫ�صĳ��Ƚ�������
        //Collections.sort(list,(item1,item2) -> item1.length() -item2.length());

        //����Ԫ�س��Ƚ�������
        //Collections.sort(list, (item1,item2) -> item2.length()-item1.length());
        //����һ��ʵ��
        //Collections.sort(list, Comparator.comparingInt(String::length).reversed());

        //Ϊʲô�����lambda����ʽ�ķ�ʽ�ᱨ���أ���ʱ����item��������Object����,Ϊʲô��ߵ�item�Ǳ������޷��ƶϳ����أ�
        //��Ϊ��ߵ�Դ���Ǳ�������Ĳ�����list�е�ÿ��Ԫ�ص�<? super T>��T���ͼ��丸�࣬��ߵ�T��String
        //ɾ��reversed�������Ϳ����ƶϳ���itemԪ�ص����ͣ�
        //Collections.sort(list,Comparator.comparingInt(item -> item.length()).reversed());

        //���ߵȼ۵�
        //Collections.sort(list,Comparator.comparingInt((String item) -> item.length()).reversed());
        //list.sort(Comparator.comparingInt(String::length).reversed());

        //�ȸ���Ԫ�صĳ��Ƚ�������Ȼ�����������ĸ��˳���������
        //Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
        //Collections.sort(list,Comparator.comparingInt(String::length).
                //thenComparing((item1,item2) -> item1.compareToIgnoreCase(item2)));
        //Collections.sort(list,Comparator.comparing(String::length).thenComparing(
                //Comparator.comparing(String::toLowerCase)));

        //�ȸ���Ԫ�صĳ��Ƚ�������Ȼ�������ĸ�������������
        //Collections.sort(list,Comparator.comparingInt(String::length).
                //thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));

        //���ǰ��ճ��ȵĵ���Ȼ���ٸ�������ĵ���
        Collections.sort(list,Comparator.comparingInt(String::length).reversed().
                thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));


        Collections.sort(list,Comparator.comparingInt(String::length).reversed().thenComparing
                (Comparator.comparing(String::toLowerCase,Comparator.reverseOrder()))
                //��һ����û�з������õģ������������Ԫ�ض��Ѿ�ͨ���Ƚ����Ƚϳ������
                .thenComparing(Comparator.reverseOrder()));

        System.out.println(list);

    }
}