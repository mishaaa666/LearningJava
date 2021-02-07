package com.learning.java.lesson12.homework;

import java.util.Arrays;
import java.util.Random;

import static com.learning.java.lesson11.homework.ArrayRandom.generateRandomArray;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private static void testArrays() {
        int[] arr3 = {0, 1, 2}; //+3

        int[] arr4 = new int[arr3.length + 1];
        for (int i = 0; i < arr3.length; i++) {
            arr4[i] = arr3[i];
        }
        arr4[arr4.length - 1] = 3;

        int[] ints = Arrays.copyOf(arr3, arr3.length + 1);
        ints[ints.length - 1] = 3;

//        System.arraycopy();
    }
}
