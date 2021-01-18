package com.learning.java.lesson8.homework;

public class Car {

    private String vendor;
    private String model;
    private String color;
    private Person owner;

    public Car(String vendor, String model, String color) {
        this.vendor = vendor;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        if (this.owner == null) {
            this.owner = owner;
        } else {
            System.out.println("Cannot set an owner!");
        }
    }
        @Override
        public String toString () {
            return "Car{" +
                    "vendor='" + vendor + '\'' +
                    ", model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", owner='" + owner + '\'' +
                    '}';
        }
    }
