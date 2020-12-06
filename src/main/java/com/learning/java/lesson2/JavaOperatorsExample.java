package com.learning.java.lesson2;

public class JavaOperatorsExample {
    public static void main(String[] args) {
        // + - / * =
        int sum = 5 + 7; // + binary operator
        int negativeSum = -sum;
        int expressionResult = (2 + 2) * 2;
        System.out.println("expressionResult = " + expressionResult);

        int divisionResult = 5 / 2; // при double = 2
        int divisionRest = 5 % 2; // остача від ділення

        double divisionResultDouble = 1.0 * 5 / 2;
        System.out.println("divisionResultDouble = " + divisionResultDouble);

        // >> << >>> | & ^ : homework bitwise and bit shift operators
        int a = 0b0010; // 2
        int b = 0b0001; // 1
        int c = a | b; // 0b0011
        int d = a & b; // 0b0000 if the same =1, else 0

    }
}
