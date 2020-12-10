package com.learning.java.lesson4;

// extends - наслідування
public class Student extends Person {

    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age); // слово для звернення до батьківського класу
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
