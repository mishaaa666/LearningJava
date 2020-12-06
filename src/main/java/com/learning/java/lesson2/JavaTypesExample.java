package com.learning.java.lesson2;

public class JavaTypesExample {
    public static void main(String[] args) {
        //type annotation - анотція типу

        //8 primitive types
        byte aByte = 127; // [-128, 127] -(2^(x-1)) ...2^(x-1)-1< where x is number of bits
        char aChar = 'a'; // 2 bytes, Homework find ASCII table
        short aShort = 2; // 2 bytes
        int aInt = 125_523_897; // 4 bytes
        long aLong = 554131L; // 8 bytes L for int number to Long
        int aIntHex = 0xfffff; // hex
        int aIntBinary = 0b011010; //binary
        float aFloat = 2.5f; // 4 bytes f for float
        double aDouble = 2.5; // 8 bytes
        boolean aBoolean = true; // ?

        System.out.println("aChar = " + (int)aChar);
    }
}
