package com.learning.java.lesson2.homework;

public class HouseTask {
    public static void main(String[] args) {
        // 2. Маючи номер квартири, к-сть під*їздів і загальну к-сть квартир порахувати
        // номер під*їзда для заданої квартири
        int numberOfAppartment = 101;
        int numberOfEntrance = 9;
        int totalNumberOfAppartment = 900;

        int numberOfAppartmentsInEntrance = totalNumberOfAppartment / numberOfEntrance;
        System.out.println(numberOfAppartmentsInEntrance);

        int numberOfEntranceForAppartment = (numberOfAppartment - 1) / numberOfAppartmentsInEntrance + 1;
        System.out.println("Number of Entrance For Appartment is = " + numberOfEntranceForAppartment);

    }
}
