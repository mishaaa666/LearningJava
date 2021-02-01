package com.learning.java.lesson11.homework;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] ints = generateRandomArray();
        System.out.println(Arrays.toString(ints));

        int arraySum = calculateArraySum(ints);
        System.out.println("Array sum is: " + arraySum);

        double averageValue = calculateAverageValue(arraySum, ints.length);
        System.out.println("averageValue = " + averageValue);
        printArrayInReversOrder(ints);

        System.out.println();
        printEachSecondElementOnly(ints);
    }


    private static int[] generateRandomArray() {
        Random random = new Random();
        int n = random.nextInt(100);
        System.out.println("n = " + n);
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        return ints;
    }

    private static int calculateArraySum(int[] ints) {
        int arraySum = 0;
        for (int i = 0; i < ints.length; i++) {
            arraySum = arraySum + ints[i];
        }
        return arraySum;

    }

    private static double calculateAverageValue(int arraySum, int length) {
        return 1.0 * arraySum / length;
    }


    private static void printArrayInReversOrder(int[] ints) {
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i] + " ");
        }
    }

    private static void printEachSecondElementOnly(int[] ints) {
        for (int i = 0; i < ints.length; i = i + 2) {
            System.out.print(ints[i] + " ");

        }
    }
}