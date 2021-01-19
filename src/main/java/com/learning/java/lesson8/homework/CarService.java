package com.learning.java.lesson8.homework;

public class CarService {

    public static void paintCar(Car car, String newColor) {
        car.setColor(newColor);
    }

    public static void registerNewOwner(Car car, Person newOwner) {
        if (car.getOwner() == null) {
            car.setOwner(newOwner);
        } else {
            System.out.println("Car already has an owner. New owner cannot be registered!");
        }
    }
}