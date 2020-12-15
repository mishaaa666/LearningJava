package com.learning.java.lesson5.homework4;

public class ShapeExample {
    public static void main(String[] args) {
        Shape triangle = new Triangle("red", 12.345, 23.456);

        triangle.printColor();
        triangle.calculatePerimeter();
        triangle.calculateSquare();

        System.out.println();

        Shape circle = new Circle("blue", 5.3);

        circle.printColor();
        circle.calculatePerimeter();
        circle.calculateSquare();

        System.out.println();

        Shape rectangle = new Rectangle("yellow", 54.321, 76.543);

        rectangle.printColor();
        rectangle.calculatePerimeter();
        rectangle.calculateSquare();
    }
}
