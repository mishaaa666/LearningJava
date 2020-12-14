package com.learning.java.lesson4;

public class FieldsExample {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 30);

        ivan.printInfo();
        ivan.setName("Petro");
        ivan.printInfo();

        ivan.setAge(25);
        ivan.printInfo();

         Student studentPetro = new Student("Petro", 18, 1014);
        // System.out.println(ivan.toString());//toString() метод для перетворення в строку
        //System.out.println(ivan);// те саме, що попередня строчка

        String str = "This person is:" + studentPetro;
        System.out.println(str);
    }


}
