package com.zhihao.miao.test3;

public class StudentCompare {
    public int compose(Student student1,Student student2){
        return student1.getAge() - student2.getAge();
    }

    public int compose2(Student student1,Student student2){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
