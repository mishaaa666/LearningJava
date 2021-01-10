package lesson7.homework;

public class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", studentId: " + studentId + ".";
    }
}
