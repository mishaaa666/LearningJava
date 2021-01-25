package com.learning.java.lesson10.homework;

public class Person {

    private String name;
    private int age;
    private String passportNumber;

    public Person(String name, int age, String passportNumber) {
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof Person) {
                Person person1 = (Person) obj;
                return this.passportNumber.equals(person1.passportNumber);
            } else {
                return false;
            }
        }
    }
}

