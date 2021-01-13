package com.learning.java.lesson8.homework;

public class Car {

    private String vendor;
    private String model;
    private String color;
    private String owner;

    public Car(String vendor, String model, String color, Person person) {
        this.vendor = vendor;
        this.model = model;
        this.color = color;
        owner = person.getName();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
