package com.learning.java.lesson8.homework;


public class CarExample {


    public static void main(String[] args) {

        Person person1 = new Person("Kate Johnson", 26);
        Car car1 = new Car("BMW", "X5", "white", person1);
        System.out.println("car1 = " + car1);
        Car someCar1 = car1;
        paintCar(someCar1, "red");
        registerNewOwner(someCar1, "John Smith");
        System.out.println("someCar1 = " + someCar1);

        Person person2 = new Person("Mike Pearson", 32);
        Car car2 = new Car("Mercedes", "GLE 250d", "brown", person2);
        System.out.println("car2 = " + car2);

        paintCar(car2, "black");
        registerNewOwner(car2, "Jessika Simpson");
        System.out.println("car2 = " + car2);


    }

    public static void paintCar(Car car, String newColor) {
        car.setColor(newColor);
    }

    private static void registerNewOwner(Car car, String newOwner) {
        car.setOwner(newOwner);
//       Person ivan = new Person("Ivan", 18);
//        car = new Car("Mercedes", "GLE 250d", "brown", ivan);
//        System.out.println("car = " + car);
    }

}
