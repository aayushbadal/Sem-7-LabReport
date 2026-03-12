/*
2. Write a GUI application to calculate simple interest.
Use three text fields for input and fourth text field for output.
Your program should display: Simple Interest if the user presses the mouse, Compound Interest if the user releases the mouse
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Q2 extends MouseAdapter {
    JFrame f;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    public Q2() {
        f = new JFrame("Interest");
        l1 = new JLabel("Principle");
        l2 = new JLabel("Rate");
        l3 = new JLabel("Time");
        l4 = new JLabel("Interest");
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);
        t4 = new JTextField(20);
        b1 = new JButton("Interest");

        f.setSize(400, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(l4);
        f.add(t4);

        b1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                double p = Double.parseDouble(t1.getText());
                double r = Double.parseDouble(t2.getText());
                double t = Double.parseDouble(t3.getText());
                double si = (p * t * r) / 100;
                l4.setText("SI");
                t4.setText("" + si);
            }
        });
        b1.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                double p = Double.parseDouble(t1.getText());
                double r = Double.parseDouble(t2.getText());
                double t = Double.parseDouble(t3.getText());
                double ci = p * (Math.pow((1 + (r / 100)), t)) - p;
                l4.setText("CI");
                t4.setText("" + ci);
            }
        });
    }

    public static void main(String[] args) {
        new Q2();
    }
}