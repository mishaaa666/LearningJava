package com.learning.java.lesson5.homework5;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;


    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public void printColor() {
        System.out.println("Rectangle color is " + getColor());
    }

    @Override
    public double calculatePerimeter() {
        double rectanglePerimeter = (sideA + sideB) * 2;
        return rectanglePerimeter;
    }

    @Override
    public double calculateSquare() {
        double rectangleSquare = sideA * sideB;
        return rectangleSquare;
    }

}
