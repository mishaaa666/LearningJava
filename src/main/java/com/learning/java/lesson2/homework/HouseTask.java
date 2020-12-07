package com.learning.java.lesson2.homework;

public class HouseTask {
    public static void main(String[] args) {
        // 2. Маючи номер квартири, к-сть під*їздів і загальну к-сть квартир порахувати
        // номер під*їзда для заданої квартири
        int numberOfAppartment = 67;
        int numberOfEntrance = 9;
        int totalNumberOfAppartment = 972;

        //int numberOfEntranceForAppartment = 5;
        int numberOfAppartmentsInEntrance = totalNumberOfAppartment / numberOfEntrance;
        System.out.println(numberOfAppartmentsInEntrance);

        for (int i = 1; i <= numberOfAppartmentsInEntrance; i++){
            int numberOfEntranceForAppartment = 1;

        }
    }
}
