package lesson7;

public class ObjectOverloadingExample {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan");
        doSomethingWithPerson(ivan);
        Student petro = new Student("Petro", 10);
        doSomethingWithPerson(petro);

    }

    public static void doSomethingWithPerson(Person person) {
        System.out.println("You are really a person? Yes, I am!!!");
    }

    public static void doSomethingWithPerson(Student person) {
        System.out.println("You are really a person? No, I am a student!!!");
    }

    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }
    }

    public static class Student extends Person {
        private int studentId;


        public Student(String name, int studentId) {
            super(name);
            this.studentId = studentId;
        }
    }
}
