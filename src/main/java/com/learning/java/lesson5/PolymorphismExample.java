package com.learning.java.lesson5;

public class PolymorphismExample {

    public static void main(String[] args) {

//        Person p = new Person("Ivan", 18);
//        Person p = new Student("Ivan", 18, 1010);
        Person p = getNextPersonFromQueue();
        p.work();


    }

    private static Person getNextPersonFromQueue() {
        double random = Math.random();
        if (random > 0.66) {
            return new Student("Ivan", 18, 2021);
        } else if (random > 0.33) {
            return new Person("Petro", 32);
        } else {
            return new Employee();
        }
    }
}
