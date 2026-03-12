package Lab2.HCOE;

public class Student {
    public int roll;
    public String name;

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
