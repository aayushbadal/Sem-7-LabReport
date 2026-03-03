// 2. Write a java program to create user defined package and use this package in another class or package.

package Lab2;

import Lab2.HCOE.Student;

public class Q02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Ramesh");
        s1.display();
        System.out.println("--------------");
        s2.display();
    }
}