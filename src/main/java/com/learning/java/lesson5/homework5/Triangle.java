package com.learning.java.lesson5.homework5;

public class Triangle extends Shape {

    private double cathetusA;
    private double cathetusB;


    public Triangle(String color, double cathetusA, double cathetusB) {
        super("red");
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;

    }

    public double getCathetusA() {
        return cathetusA;
    }

    public void setCathetusA(double cathetusA) {
        this.cathetusA = cathetusA;
    }

    public double getCathetusB() {
        return cathetusB;
    }

    public void setCathetusB(double cathetusB) {
        this.cathetusB = cathetusB;
    }

    @Override
    public void printColor() {
        System.out.println("Triangle color is " + getColor());
    }


    @Override
    public double calculatePerimeter() {
        double hypotenuzy = Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
        double trianglePerimeters = cathetusA + cathetusB + hypotenuzy;
        return trianglePerimeters;
    }

    @Override
    public double calculateSquare() {
        double triangleSquare = (cathetusA * cathetusB) / 2;
        return triangleSquare;
    }
}
