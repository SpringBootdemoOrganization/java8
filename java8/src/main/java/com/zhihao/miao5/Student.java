package com.zhihao.miao5;

public class Student {
	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public int compareByScore(Student stu){
		return this.getScore() - stu.getScore();
	}
	
	public int compareByName(Student stu){
		return this.getName().compareToIgnoreCase(stu.getName());
	}

	public static int compareStudentByScore(Student stu1,Student stu2){
		return stu1.getScore() - stu2.getScore();
	}
	
	public static int compareStudentByName(Student stu1,Student stu2){
		return stu1.getName().compareToIgnoreCase(stu2.getName());
	}

	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
	
}
