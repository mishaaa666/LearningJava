package com.learning.java.lesson12.homework;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);
        System.out.println("n = " + n);

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] swap(int[] arr) {
        int template;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    template = arr[i];
                    arr[i] = arr[j];
                    arr[j] = template;
                }
            }
        }
        return arr;
    }
}
