package HCOE;

public class Student {
    int roll;
    String name;

    public Student() {
    }

    public Student(int r, String n) {
        roll = r;
        name = n;
    }

    public void display() {
        System.out.println("Roll=" + roll + "\nName=" + name);
    }
}
