package com.learning.java.lesson4;

// POJO - plain old java object
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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= this.age) {
            this.age = age;
        }
    }

    public void printInfo() {
        System.out.println("name: " + name + ", age: " + age);
    }

    @Override //анотація перевизначення методу
    public String toString() {
        return "(name:" + name + ", age: " + age + ")";
    }
}
