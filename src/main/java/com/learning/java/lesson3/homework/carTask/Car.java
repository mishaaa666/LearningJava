package com.learning.java.lesson3.homework.carTask;

public class Car {
    //fields
    public String carVendor;
    public String model;
    public String productionYear;
    public int price;

    //constructors
    public Car(String carVendor, String model, String productionYear, int price) {
        this.carVendor = carVendor;
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
    }

    //methods
    public void printCarInformation() {
        System.out.println("This car is " + carVendor + " " + model + ". It produces in " + productionYear + ". It costs " + price + ".");
    }

    public void printNiceModelLogo() {
        System.out.println(carVendor + " " + model + " (" + productionYear + ")");
    }

    public void printNicePrice() {
        System.out.println("Hello! I`m " + carVendor + " " + model + " (" + productionYear + "). My price is " + price + "$. But only for today I have 10% OFF. Hurry UP!!!");
    }
}
