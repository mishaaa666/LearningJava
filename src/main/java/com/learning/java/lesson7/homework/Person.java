package com.learning.java.lesson7.homework;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name:" + name + ", age: " + age + ".";
    }
}
