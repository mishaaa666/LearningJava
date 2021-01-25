package com.learning.java.lesson10;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        int[] a = new int[2];
        int[] a2 = new int[]{1, 4};
        int[] a3 = {1, 4};

        int length = a.length;

        //звернення до елементу
        int val1 = a[1];
        a[0] = 8;

        //calcArray({1,4}) - doesn`t work
        calcArray(new int[]{1, 4});

        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
        for (int i = a2.length - 1; i > 0; i--) {
            System.out.println(a2[i]);
        }

        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = 3 * i * i + 7 * i + 9;
        }
        //  System.out.println(ints);//виведеться кракозября
        System.out.println(Arrays.toString(ints));


        //
//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//            for (int j = 0; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//        }
    }

    private static void calcArray(int[] arr) {

    }
}
