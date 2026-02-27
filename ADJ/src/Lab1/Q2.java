//2.Write a java program to find max and min from 1-d array having n elements.

package Lab1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter Size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int min = num[0];
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (min > num[i])
                min = num[i];
            if (max < num[i])
                max = num[i];
        }
        System.out.println("Min=" + min + "\nMax=" + max);
        sc.close();
    }
}
