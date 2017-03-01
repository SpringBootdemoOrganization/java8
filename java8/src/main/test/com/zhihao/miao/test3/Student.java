package com.zhihao.miao.test3;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static int compose(Student stu1,Student stu2){
        return stu1.getAge() - stu2.getAge();
    }

    public static int compose2(Student stu1,Student stu2){
        return stu1.getName().compareToIgnoreCase(stu2.getName());
    }
}
