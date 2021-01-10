package lesson7.homework;


public class Client {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 27);
        printPersonInfo(ivan);
        Student petro = new Student("Petro", 18, 2110);
        printPersonInfo(petro);
        Employee vasyl = new Employee("Vasyl", 26, 700);
        printPersonInfo(vasyl);

    }

    public static void printPersonInfo(Person person) {
        System.out.println(person);
    }

    public static void printPersonInfo(Student person) {
        System.out.println(person);
    }

    public static void printPersonInfo(Employee person) {
        System.out.println(person);
    }

}

