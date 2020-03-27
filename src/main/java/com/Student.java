package com;

import lombok.Data;

@Data
public class Student extends Person {
    private String school;

    public void getInfo() {
        System.out.println("小学生");
    }
}
