package com.learning.java.lesson5;

//Terminology:
//Subclass - Superclass
//Child - Parent
//Дочірній клас - Батьківський клас

public class Student extends Person {

    //при наслідуванні класу треба визвати конструктор класу

    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void work() {
        System.out.println("I`m lazy, but I try to do at least something!");
    }

}
