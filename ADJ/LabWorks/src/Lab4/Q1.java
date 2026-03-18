//Lab–4 (Advanced Swing Components)
/*
1. Design a GUI form using Swing with a text field and a text label for displaying the input message “Input any String”, 
and three buttons with captions:

CheckPalindrome

Reverse

FindVowels

Write a complete program for the above scenario and:

Check palindrome when the first button is clicked.

Reverse the string when the second button is clicked.

Extract vowels from the string when the third button is clicked.
*/

package Lab4;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Q1 {
    JFrame f;
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2, b3;

    public Q1() {
        f = new JFrame("Checking");
        l1 = new JLabel("Input any String:");
        t1 = new JTextField(20);
        b1 = new JButton("CheckPalindrome");
        b2 = new JButton("Reverse");
        b3 = new JButton("FindVowels");
        l2 = new JLabel("Result:");
        t2 = new JTextField(20);

        f.setSize(375, 200);
        f.setLayout(new FlowLayout());

        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l2);
        f.add(t2);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Check Palindrome
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String str = t1.getText();
                String rev = new StringBuilder(str).reverse().toString();

                if (str.equalsIgnoreCase(rev))
                    t2.setText("Palindrome");
                else
                    t2.setText("Not a Palindrome");
            }
        });

        // Reverse String
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String str = t1.getText();
                String rev = new StringBuilder(str).reverse().toString();
                t2.setText(rev);
            }
        });

        // Find Vowels
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String str = t1.getText();
                String vowels = "";

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if ("aeiouAEIOU".indexOf(ch) != -1) {
                        vowels += ch + " ";
                    }
                }

                t2.setText(vowels);
            }
        });
    }

    public static void main(String[] args) {
        new Q1();
    }
}