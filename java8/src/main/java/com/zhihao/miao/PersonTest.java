package com.zhihao.miao;

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
		
		PersonTest test = new PersonTest();
		List<Person> result = test.getPersonsByUserName("zhangsan", persons);
		result.forEach( (person) -> System.out.println(person.getUsername()));
		
		
		System.out.println("....................");
		List<Person> result2 = test.getPersonsByAge(25, persons);
		result2.forEach( (person) -> System.out.println(person.getUsername()));
		
		System.out.println(".....................");
		
		List<Person> result3 = test.getPersonByAge2(25, persons, (ageOfPerson,personList) -> 
		      personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList())
		);
		result3.forEach(person -> System.out.println(person));
		
		System.out.println("......................");
		
		List<Person> result4 = test.getPersonByAge2(25, persons, (ageOfPerson,personList) -> 
			personList.stream().filter(person -> person.getAge() <= ageOfPerson).collect(Collectors.toList())
		);
		result4.forEach(person -> System.out.println(person));
	}
	
	public List<Person> getPersonsByUserName(String username,List<Person> persons){
		return persons.stream().filter(person -> username.equals(person.getUsername()))
				.collect(Collectors.toList());
	}
	
	public List<Person> getPersonsByAge(int age,List<Person> persons){
		BiFunction<Integer,List<Person>,List<Person>> fun1 = (ageOfPerson,personList) -> {
			return personList.stream().filter(person -> person.getAge() > ageOfPerson)
				.collect(Collectors.toList());
		};
		
		return fun1.apply(age, persons);
	}
	
	public List<Person> getPersonByAge2(int age,List<Person> persons,BiFunction<Integer,List<Person>,List<Person>> fun1){
		return fun1.apply(age, persons);
	}
}
