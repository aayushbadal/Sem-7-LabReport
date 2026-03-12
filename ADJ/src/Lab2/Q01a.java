//Lab-2 : Inheritance, Package, ExceptionHandling, Thread and File Handling

/*
1. Write a java program to illustrate the concept of folowing inheritance:
    a. Single Level Inheritance
*/

package Lab2;

class Person {
    String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayPerson() {
        System.out.println("Name=" + name + "\nAddress=" + address);
    }
}

class Student extends Person {
    int roll;

    public Student(int roll, String name, String address) {
        super(name, address);
        this.roll = roll;
    }

    public void displayStudent() {
        System.out.println("Roll=" + roll);
        super.displayPerson();
    }
}

public class Q01a {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ramesh", "Kathmandu");
        s1.displayStudent();
    }
}
