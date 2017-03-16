package com.zhihao.Collectors;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        String str1 = "a1233";
        String str2 = "b2222";

        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add(str1);
        stringJoiner.add(str2);

        System.out.println(stringJoiner.toString());

        String str3 = "c3333";
        String str4 = "d4444";

        StringJoiner stringJoiner2 = new StringJoiner(",");
        stringJoiner2.add(str3);
        stringJoiner2.add(str4);

        System.out.println(stringJoiner2);

        String result = stringJoiner.merge(stringJoiner2).toString();
        System.out.println(result);




    }
}
