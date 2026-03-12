
// b. BorderLayout
import javax.swing.*;
import java.awt.*;

public class Q5b {
    JFrame f;
    JButton b1, b2, b3, b4, b5;

    public Q5b() {
        f = new JFrame("FlowLayout");
        b1 = new JButton("One");
        b2 = new JButton("Two");
        b3 = new JButton("Three");
        b4 = new JButton("Four");
        b5 = new JButton("Five");

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new BorderLayout());

        f.add(b1, BorderLayout.EAST);
        f.add(b2, BorderLayout.WEST);
        f.add(b3, BorderLayout.SOUTH);
        f.add(b4, BorderLayout.NORTH);
        f.add(b5, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Q5b();
    }
}
