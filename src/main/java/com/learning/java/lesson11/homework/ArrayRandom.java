package com.learning.java.lesson11.homework;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100);
        System.out.println("n = " + n);

        int[] ints = new int[n];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ints));
        calculateArraySum(ints);
        calculateAverageValue(ints);
        printArrayInReversOrder(ints);
        System.out.println();
        printEachSecondElementOnly(ints);
    }

    private static void calculateArraySum(int[] ints) {
        int arraySum = 0;
        for (int i = 0; i < ints.length; i++) {
            arraySum = arraySum + ints[i];
        }
        System.out.println("Array sum is: " + arraySum);
    }

    private static void calculateAverageValue(int[] ints) {
        int averageValue = 0;
        int arraySum = 0;
        for (int i = 0; i < ints.length; i++) {
            arraySum = arraySum + ints[i];
            averageValue = arraySum / ints.length;
        }
        System.out.println("Average value of the elements is: " + averageValue);
    }

    private static void printArrayInReversOrder(int[] ints) {
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i] + " ");
        }
    }

    private static void printEachSecondElementOnly(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 1) {
                System.out.print(ints[i] + " ");
            }
        }
    }
}