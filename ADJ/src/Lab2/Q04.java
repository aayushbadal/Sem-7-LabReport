/*
4. Write a java program that will read balance and withdraw amount from keyboard 
    and display the remaining balance on screen if the balance is greater than withdraw 
    amount otherwise throw an exception with appropriate message.
*/

package Lab2;

import java.util.Scanner;

class BalanceException extends Exception {
    public BalanceException(String m) {
        super(m);
    }
}

public class Q04 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter balance amount:");
            double b = sc.nextDouble();
            System.out.println("Enter Withdraw Amount:");
            double w = sc.nextDouble();
            sc.close();
            if (b >= w)
                System.out.println("Remaining Balance: " + (b - w));
            else
                throw (new BalanceException("Insufficient Balance!!"));
        } catch (BalanceException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
