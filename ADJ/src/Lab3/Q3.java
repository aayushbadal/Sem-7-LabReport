/*
3. Write a Java program using Swing component to find Area and Perimeter of a Rectangle.
Use text fields for inputs and outputs.
Your program should display the result when the user clicks a button.
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Q3 {
    JFrame f;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;

    public Q3() {
        f = new JFrame("Area+Peri Calculator");
        l1 = new JLabel("Length");
        l2 = new JLabel("Breadth");
        l3 = new JLabel("Result:");
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);
        b1 = new JButton("Area");
        b2 = new JButton("Perimeter");

        f.setSize(400, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(l3);
        f.add(t3);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int l = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int a = l * b;
                l3.setText("Area: ");
                t3.setText("" + a);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int l = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int p = 2 * (l + b);
                l3.setText("Perimeter:");
                t3.setText("" + p);
            }
        });
    }

    public static void main(String[] args) {
        new Q3();
    }
}
