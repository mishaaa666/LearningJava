package com.learning.java.lesson3.homework.mobileTask;

public class MobilesExample {
    public static void main(String[] args) {
        Mobile firstMobile = new Mobile("iPhone", "XR", "2018",
                "6.1`", "Apple A12", 6, 2,
                "12 MP + 7 MP", 3, 128, "iOS", "Li-Ion");

        Mobile secondMobile = new Mobile("Samsung", "A5", "2013",
                "5.0`", "1.2GGc", 4, 2,
                "13 MP + 5 MP", 2, 16, "Android", "Li-Ion");

        firstMobile.printMobileProduction();
        firstMobile.printMainCharacteristics();
        firstMobile.printCameraFeatures();

        secondMobile.printMobileProduction();
        secondMobile.printMainCharacteristics();
        secondMobile.printCameraFeatures();
    }
}
