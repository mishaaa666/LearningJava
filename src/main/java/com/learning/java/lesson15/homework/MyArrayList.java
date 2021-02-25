package com.learning.java.lesson15.homework;

import java.util.Arrays;

public class MyArrayList {

    private Object[] elements;
    private int size;

    public MyArrayList() {
        size = 0;
        elements = new Object[10];
    }

    public void addToIndex(int index, Object o) {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        System.arraycopy(elements, index, elements, index + 1, size - 2);
        elements[index] = o;
        size++;
    }


    public void add(Object o) {
        if (elements.length <= size) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size] = o;
        size++;
    }

    public void removeByIndex(int index) {
        // 5 4 78 9 8   - 1
        // 5 78 9 8
        for (int i = index; i < size - 1; i++) {
            elements[index] = elements[index + 1]; // 5 78 9 8 8
        }
        // System.arraycopy(elements, index+1, elements, index, size - index-1)
        elements[size - 1] = null;
        // 5 78 9 8 null
        size--;
    }

    public void removeElement(int index) {
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public void removeByElement(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                removeByIndex(i);
            }
        }
    }

    public Object getElementByIndex(int index) {
        return elements[index];
    }


    @Override
    public String toString() {
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
        myArrayList.add("two");
        myArrayList.add("three");
        myArrayList.add("four");

        myArrayList.getElementByIndex(2);
        System.out.println(myArrayList);
        myArrayList.addToIndex(4, "five");
        myArrayList.addToIndex(5, "five");
        System.out.println(myArrayList);
        myArrayList.removeElement(3);
        System.out.println(myArrayList);
        myArrayList.removeByIndex(4);
        System.out.println(myArrayList);
        myArrayList.removeByElement("five");
        System.out.println(myArrayList);
    }
}
