package com.learning.java.lesson4.homework4;

public class Shape {

    private String color;
    private double perimeter;
    private double square;


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

    public void calculatePerimeter() {
        System.out.println("Perimeters is " + perimeter);
    }

    public void calculateSquare() {
        System.out.println("Square is " + square);
    }
}
