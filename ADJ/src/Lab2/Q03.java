/*
3. Write a java program to demonstrate ArithmeticException, ArrayIndexOutOfBoundsException 
    and NumberFormatException class.
*/

package Lab2;

public class Q03 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            int arr[] = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
