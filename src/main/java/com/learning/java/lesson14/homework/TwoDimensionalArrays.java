package com.learning.java.lesson14.homework;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);
        int m = random.nextInt(10);
        int k = random.nextInt(10);
        int[][] arr1 = generateRandomTwoDimensionalFirstArray(n, m);
        int[][] arr2 = generateRandomTwoDimensionalFirstArray(m, k);
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        int[][] arr3 = multiplyTwoArrays(arr1, arr2);

        System.out.println(Arrays.deepToString(arr3));
    }


    public static int[][] generateRandomTwoDimensionalFirstArray(int n, int m) {
        Random random = new Random();
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = random.nextInt(10);
            }
        }
        return arr1;
    }




    public static int[][] multiplyTwoArrays(int[][] arr1, int[][] arr2) {
//        Random random = new Random();
//        int n = random.nextInt(10);
//        int m = random.nextInt(10);
//        int k = random.nextInt(10);
        int n = arr1.length;
        int m1 = arr1[0].length;

        int m2 = arr2.length;
        int k = arr2[0].length;


        int[][] arr3 = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int r = 0; r < m2; r++) {
                    arr3[i][j] += arr1[i][r] * arr2[r][j];

                }
            }

        }

        return arr3;
    }
}