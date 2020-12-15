package com.learning.java.lesson5.homework4;

public class Circle extends Shape {

    private double radius;

//    private double circleLength;
//    private double circleSquare;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void printColor() {
        System.out.println("Circle color is " + getColor());
    }

    @Override
    public double calculatePerimeter() {
        double circleLength = 2 * Math.PI * radius;
        System.out.println("The length of circle is " + circleLength);
    }

    @Override
    public void calculateSquare() {
        double circleSquare = Math.PI * Math.pow(radius, 2);
        System.out.println("Square of circle is " + circleSquare);
    }
}
