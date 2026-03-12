//Lab3 : Swing Components and EventHandling

/*
1. Write a program using swing components to add and subtract two numbers.
 Use textfield for input and output. Your program should display the result when the user press button. 
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Q1 {
    JFrame f;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;

    public Q1() {
        f = new JFrame("Calculator");
        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel("Result:");
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");

        f.setSize(500, 500);
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
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int a = n1 + n2;
                l3.setText("Addition: ");
                t3.setText("" + a);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int s = n1 - n2;
                l3.setText("Subtraction:");
                t3.setText("" + s);
            }
        });
    }

    public static void main(String[] args) {
        new Q1();
    }
}
