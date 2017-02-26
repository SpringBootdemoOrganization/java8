package com.zhihao.miao.test2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;



public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("zhangsan",20);
		Person person2 = new Person("lisi",30);
		Person person3 = new Person("wangwu",40);
		
		List<Person> persons = Arrays.asList(person1,person2,person3);
		List<Person> result = getPersonByAge2(25,persons,(ageofperson,personList) ->{
			return personList.stream().filter(person -> ageofperson > person.getAge()).collect(Collectors.toList());
		});
		
		System.out.println(result);
		
	}
	
	public static List<Person> getPersonsByUserName(String name,List<Person> personList){
		return personList.stream().filter(person -> name.equals(person.getName()))
			.collect(Collectors.toList());
	}
	
	public static List<Person> getPersonByAge2(int age, List<Person> list,BiFunction<Integer,List<Person>,List<Person>> biFun1){
		return biFun1.apply(age, list);
	}
}
