package com.learning.java.lesson10.homework;

public class PersonExample {
    public static void main(String[] args) {

        Person[] people = new Person[5];

        people[0] = new Person("Ivan", 26, "FU1234");
        people[1] = new Person("Vasyl", 30, "FX2345");
        people[2] = new Person("Mary", 23, "ME1928");
        people[3] = new Person("Petro", 37, "TI6723");
        people[4] = new Person("Ann", 31, "LO1730");

        Person person = new Person("Mary", 23, "ME1928");

        for (int i = 0; i < people.length; i++) {
           //if, if else, if else if else
            if (people[i].equals(person)) {
                System.out.println("This person is person number = " + i);
            }
//            else if (!people[i].equals(person)) {
//                System.out.println("Such person does not exist!");
//            }
        }
    }
}