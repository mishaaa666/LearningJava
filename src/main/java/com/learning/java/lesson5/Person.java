package com.learning.java.lesson5;

public class Person {

    private String name;
    private int age;
    private boolean isAdult;

    //дефолтний конструктор
    public Person() {
        this("No Name", -1); //перша інструкція всередині конструктора
        //або
        //this.name = "No Name";
        //this.age = 15;
        //this.isAdult = false;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        if (this.age >= 18) {
            this.isAdult = true;
        }
    }

    public Person(String name){
        this.name = name;
    }

    //getters and setters

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }
}
