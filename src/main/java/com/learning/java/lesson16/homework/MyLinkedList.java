package com.learning.java.lesson16.homework;

public class MyLinkedList {
    public static void main(String[] args) {
        List list = new List();
        for (int i = 0; i <= 10; i++) {
            list.addLastElement(i);
            list.printMylinkedList();
            list.deleteFirstElement(0);

        }
    }

    private static class Node {
        Node next;
        int element;
    }

    public static class List {


        private Node head;
        private Node tail;


        public void addLastElement(int element) {
            Node elem = new Node();
            elem.element = element;
            if (tail == null) {
                head = elem;
                tail = elem;
            } else {
                tail.next = elem;
                tail = elem;
            }
        }

        public void deleteFirstElement(int element) {
            if (head == null) {
                return;
            }
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            if (head.element == element) {
                head = head.next;
                return;
            }
        }

        public void printMylinkedList() {
            Node pointer = this.head;
            while (pointer != null) {
                System.out.print(pointer.element + " ");
                pointer = pointer.next;
            }
            System.out.println();
        }

    }

}
