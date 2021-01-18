package com.learning.java.lesson8.homework;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    //не потрібен
   // public void setName(String name) {
    //    this.name = name;
   // }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
