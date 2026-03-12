
/*
5. Write a Java program using Swing component to demonstrate the concept of the following Layout Managers:
a. FlowLayout
*/
import javax.swing.*;
import java.awt.*;

public class Q5a {
    JFrame f;
    JButton b1, b2, b3, b4;

    public Q5a() {
        f = new JFrame("FlowLayout");
        b1 = new JButton("One");
        b2 = new JButton("Two");
        b3 = new JButton("Three");
        b4 = new JButton("Four");

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
    }

    public static void main(String[] args) {
        new Q5a();
    }
}
