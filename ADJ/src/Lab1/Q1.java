//1. Write a  java program to find sum of first n natural number which are odd only.

package Lab1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("The Sum of odd numbers = " + sum);
        sc.close();
    }
}