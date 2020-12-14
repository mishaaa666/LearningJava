package com.learning.java.lesson4.homework4;

public class Triangle extends Shape {

    private double cathetusA;
    private double cathetusB;

    public double hypotenuzy;
    public double trianglePerimeters;
    public double triangleSquare;


    public Triangle(String color, double cathetusA, double cathetusB) {
        super(color);
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
    public void calculatePerimeter() {
        hypotenuzy = Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
        trianglePerimeters = cathetusA + cathetusB + hypotenuzy;
        System.out.println("Perimeter of triangle is " + trianglePerimeters);
    }

    @Override
    public void calculateSquare() {
        triangleSquare = (cathetusA * cathetusB) / 2;
        System.out.println("Square of triangle is " + triangleSquare);
    }
}
