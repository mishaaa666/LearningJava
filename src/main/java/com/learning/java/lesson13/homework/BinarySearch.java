package com.learning.java.lesson13.homework;

import java.util.Arrays;

import static com.learning.java.lesson11.homework.ArrayRandom.generateRandomArray;
import static com.learning.java.lesson12.homework.ArraySort.sort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arrayToSort = generateRandomArray();
//        int[] arrayToSort = new int[]{5, 3, 7, 1, 9, 8};
        int[] sortedArray = sort(arrayToSort);
        System.out.print("Arrays.toString(sortedArray) = " + Arrays.toString(sortedArray));
        System.out.println();
        int firstElement = 0;
        int lastElement = sortedArray.length - 1;
        int index = binarySearch(sortedArray, 9);
        System.out.println(index + 1);
    }

    public static int binarySearch(int[] sortedArray, int elementToFind) {
        int indexOfSearchingElement = 0;
        int firstElement = 0;
        int lastElement = sortedArray.length - 1;
        while (firstElement <= lastElement) {
            int middleElement = (firstElement + lastElement) / 2;
            if (sortedArray[middleElement] < elementToFind) {
                firstElement = middleElement + 1;
            } else if (sortedArray[middleElement] > elementToFind) {
                lastElement = middleElement - 1;
            } else if (sortedArray[middleElement] == elementToFind) {
                indexOfSearchingElement = middleElement;
                break;
            }


        }
        return indexOfSearchingElement;
    }
}
