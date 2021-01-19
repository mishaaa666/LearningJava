package com.learning.java.lesson9;

public class ObjectExample {

    public static void main(String[] args) {
        Object myObject = new Object();

        // get class example
        MyClass myClassInstance = new MyClass();
        Class<? extends MyClass> aClass = myClassInstance.getClass();
        String nameOfTheMyClass = aClass.getName();
        System.out.println("nameOfTHeMyClass = " + nameOfTheMyClass);
        System.out.println(aClass.getDeclaredMethods());

        //equals example


        int a = 0;
        int b = 0;
        boolean aIsB = a == b;
        System.out.println("aIsB = " + aIsB);

        Person ivan1 = new Person("Ivan");
        Person ivan2 = new Person("Ivan");
        Person ivan3 = ivan1;
        boolean ivanAreTheSame = ivan1 == ivan2;
        System.out.println("ivanAreTheSame = " + ivanAreTheSame);
        boolean ivansAreEquals = ivan1.equals(ivan2);
        System.out.println("ivansAreEquals = " + ivansAreEquals);

    }

    public static class MyClass {
        public void sayHello() {

        }
    }

    public static class Person {

        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            if (obj instanceof Person) {
                Person otherPerson = (Person) obj;
                return this.name.equals(otherPerson.name);
            } else {
                return false;
            }
        }
    }
}

