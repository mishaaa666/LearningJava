package com.learning.java.lesson2.homework;

public class GeometricTask {
    public static void main(String[] args) {

        double katetA = 8.459787;
        double katetB = 5.349765;

        double hypotenuzy = Math.sqrt(Math.pow(katetA, 2) + Math.pow(katetB, 2));
        System.out.println("Hypotenuzy = " + hypotenuzy);

        double triangleSquare = (katetA * katetB) / 2;
        System.out.println("The area of the triangle = " + triangleSquare);
    }
}
