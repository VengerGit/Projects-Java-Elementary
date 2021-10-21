package com.venger.hw5.Task1.professions;

public class Person {
    private int age;
    private String fullname;

    public Person(int age, String fullname) {
        this.age = age;
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "(" + "fullname:" + fullname + " " + "age:" + age + ')';
    }
}