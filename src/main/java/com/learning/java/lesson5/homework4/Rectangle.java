package com.learning.java.lesson5.homework4;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    private double rectanglePerimeter;
    private double rectangleSquare;

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
    public void calculatePerimeter() {
        rectanglePerimeter = (sideA + sideB) * 2;
        System.out.println("The rectangle perimeter is " + rectanglePerimeter);
    }

    @Override
    public void calculateSquare() {
        rectangleSquare = sideA * sideB;
        System.out.println("The rectangle square is " + rectangleSquare);
    }

}
