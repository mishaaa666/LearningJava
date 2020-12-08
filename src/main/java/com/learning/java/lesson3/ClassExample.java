package com.learning.java.lesson3;

public class ClassExample {

    public static void main(String[] args) {
//        new Person();
//        Person myFirstPerson = new Person();
//        myFirstPerson.name = "Ivan";
//        myFirstPerson.age = 19;
        Person myFirstPerson = new Person("Ivan", 19);
        Person mySecondPerson = new Person("Hanna", 20);
        Person myThirdPerson = new Person("Petro", 22);

        myFirstPerson.introduceYourself();
        mySecondPerson.introduceYourself();
        myThirdPerson.introduceYourself();

        mySecondPerson.sayHello();

//        System.out.println(myFirstPerson.name + " is " + myFirstPerson.age + " years old!");
//        System.out.println(mySecondPerson.name + " is " + mySecondPerson.age + " years old!");
//        System.out.println(myThirdPerson.name + " is " + myThirdPerson.age + " years old!");


//        System.out.println("myFirstPerson = " + myFirstPerson);
    }
}
