package com.learning.java.lesson15.homework;

import java.util.Arrays;

public class MyArrayList {

    private Object[] elements;
    private Object[] elementsList2;
    private int size;

    public MyArrayList() {
        size = 10;
        elements = new Object[size];
        elements[0] = "Vasya";
        elements[1] = "Ivan";
        elements[2] = "Petro";
        elements[3] = "Katya";
        elements[4] = "Ira";
    }

    public Object[] addToIndex(Object o, int index) {
//        o = new Object[size];
        Object[] newElem = Arrays.copyOf(elements, size * 2);
//        Object[] newElem = new Object[size];
        System.arraycopy(elements, 0, newElem, 5, size);
        return elements;
    }

    public void add(Object o) {
        o = new Object[size];
        if (size < elements.length) {
            elements[size] = o;
            size++;
        } else {
            Object[] newElements = Arrays.copyOf(elements, size * 2);
        }

    }

    public void removeByIndex(int index) {
//        elementsList2 = elements;
//        index = 4;
        for (int i = 0; i < size-1; i++) {
            elements[index-1] = elements[index];
            elements[index] = null;




        }

    }

    @Override
    public String toString() {
//        System.out.println(elements[0]);
//        for (int i = 1; i < size; i++){
//            System.out.println(elements[i]);
//        }
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elements[i]);
            if (i != size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println(myArrayList);
        myArrayList.add("one");
        myArrayList.add("one");
        myArrayList.add("one");
        myArrayList.add("one");
        System.out.println(myArrayList);
        myArrayList.addToIndex("two", 5);
        System.out.println(myArrayList);
        myArrayList.removeByIndex(4);
        System.out.println(myArrayList);
    }
}
