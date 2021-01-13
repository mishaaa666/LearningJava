package com.learning.java.lesson8.homework;

public class CarService {

    private String newOwner;
    private String newColor;



    public static void paintCar(Car car, String newColor) {
        car.setColor(newColor);
    }

}
