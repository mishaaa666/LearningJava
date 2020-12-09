package com.learning.java.lesson3.homework.mobileTask;

public class MobilesExample {
    public static void main(String[] args) {
        Mobile firstMobile = new Mobile("iPhone", "XR", "2018",
                "6.1`", "Apple A12", 6, 2,
                "12 MP + 7 MP", 3, 128, "iOS", "Li-Ion");

        firstMobile.printMobileProduction();
        firstMobile.printMainCharacteristics();
        firstMobile.printCameraFeatures();
    }
}
