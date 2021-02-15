package com.learning.java.lesson15.homework;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> person = new ArrayList<>();


//        Object personName[] = new Object[10];
//
//        personName[0] = "Vasya";
//        personName[1] = "Kolya";
//        personName[2] = "Vika";
//        personName[3] = "Ivan";
//        personName[4] = "Katya";
//        personName[5] = "Sasha";
//        personName[6] = "Vasya";
//        personName[7] = "Maria";
//        personName[8] = "Sonya";
//        personName[9] = "Ivan";

//        person.add(personName);

        person.add(0, "Ivan");
        person.add(1, "Vasya");
        person.add(2, "Maria");
        person.add(3, "Katya");
        person.add(4, "Vasya");
        person.add(5, "Petro");

        for (String peopleList : person) {
            System.out.println("People list = " + peopleList);
        }
        System.out.println();

        person.get(4);

        System.out.println("Our person is " + person.get(4));
        System.out.println();


        person.remove("Vasya");

        person.remove(2);

        for (String newPeopleList : person) {

            System.out.println("New people list = " + newPeopleList);
        }
    }
}
