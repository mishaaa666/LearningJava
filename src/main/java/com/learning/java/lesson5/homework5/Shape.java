package com.learning.java.lesson5.homework5;

public abstract class Shape {

    private String color;
//    private double perimeter;
//    private double square;


    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printColor() {
        System.out.println("Color: " + color);
    }

    public abstract double calculatePerimeter();


    public abstract double calculateSquare();

}
