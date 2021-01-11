package com.learning.java.lesson7.homework;

public class Employee extends Person {
    private int salary;

    public Employee(String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", salary: " + salary + "$.";
    }
}
