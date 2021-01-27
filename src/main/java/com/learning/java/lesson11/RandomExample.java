package com.learning.java.lesson11;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber = random.nextInt(100); //[0, 100)
        System.out.println("myRandomNumber = " + myRandomNumber);

        int [] ints = new int[4];
        for (int i = 0; i < ints.length; i++){
            ints[i] = 5;
        }
    }
}
