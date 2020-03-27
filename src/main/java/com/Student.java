package com;

import lombok.Data;

@Data
public class Student extends Person {
    private String school;

    public void getInfo() {
        System.out.println("小学生");
    }

    public void getStudentName() {
        System.out.println("学生姓名");
    }

    public void getStudentSchool() {
        System.out.println("小学生的学校-----");
    }
}
