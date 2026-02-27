// 7. Write a jav aprogram to implement the concept of Method Overloading.

package Lab1;

public class Q7 {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Q7 mtd_overl = new Q7();
        System.out.println("Sum of Two integer =" + mtd_overl.add(5, 6));
        System.out.println("Sum of three integer = " + mtd_overl.add(5, 6, 7));
        System.out.println("Sum of two double = " + mtd_overl.add(5.5, 6.5));
    }
}
