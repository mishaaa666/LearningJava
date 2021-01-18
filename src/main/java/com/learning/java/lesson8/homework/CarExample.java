package com.learning.java.lesson8.homework;


import static com.learning.java.lesson8.homework.CarService.paintCar;
import static com.learning.java.lesson8.homework.CarService.registerNewOwner;

public class CarExample {


    public static void main(String[] args) {

        Person ownerCar1 = new Person("Kate Johnson", 26);
        Car car1 = new Car("BMW", "X5", "white");
        registerNewOwner(car1, ownerCar1);
        System.out.println("car1 = " + car1);
        Car someCar1 = car1;
        paintCar(someCar1, "red");

        Person newOwnerCar1 = new Person("John Smith", 43);
        registerNewOwner(someCar1, newOwnerCar1);
        System.out.println("someCar1 = " + someCar1);


        Person ownerCar2 = new Person("Mike Pearson", 32);
        Car car2 = new Car("Mercedes", "GLE 250d", "brown");
        System.out.println("car2 = " + car2);
        registerNewOwner(car2, ownerCar2);
        paintCar(car2, "black");

        Person newOwnerCar2 = new Person("Jessika Simpson", 30);
        registerNewOwner(car2, newOwnerCar2);
        System.out.println("car2 = " + car2);


    }
}


