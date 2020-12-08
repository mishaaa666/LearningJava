package com.learning.java.lesson3.homework;

public class CarsExample {
    public static void main(String[] args) {


        Car firstCar = new Car("BMW", "X5", "2013", 20000);
        Car secondCar = new Car("Mersedes", "GLE250d", "2010", 17000);
        Car thirdCar = new Car("Tesla", "Roadster", "2008", 15000);
        Car fourthCar = new Car("Audi", "A3", "2007", 7500);
        Car fifthCar = new Car("Volkswagen", "Tiguan", "2014", 19000);

        firstCar.printCarInformation();
        secondCar.printCarInformation();
        thirdCar.printCarInformation();
        fourthCar.printCarInformation();
        fifthCar.printCarInformation();

        firstCar.printNiceModelLogo();
        secondCar.printNiceModelLogo();
        thirdCar.printNiceModelLogo();
        fourthCar.printNiceModelLogo();
        fifthCar.printNiceModelLogo();

        firstCar.printNicePrice();
        secondCar.printNicePrice();
        thirdCar.printNicePrice();
        fourthCar.printNicePrice();
        fifthCar.printNicePrice();
    }
}
