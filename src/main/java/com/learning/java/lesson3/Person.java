package com.learning.java.lesson3;

public class Person {
    //fields
    public String name; // field name or myName (camel case) //properties
    public int age;

    //read code convention

    //constructors
    public Person(String name, int age) {
        //initialization class
        this.name = name; //звертання до параметру класа
        this.age = age;
    }

    //methods
    public void introduceYourself() {
        System.out.println(name + " is " + age + " years old!!!");
    }

    public void sayHello() {
        System.out.println("Hello! My name is " + name);
    }


}
