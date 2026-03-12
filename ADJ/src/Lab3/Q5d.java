// d. GridBagLayout

import javax.swing.*;
import java.awt.*;

public class Q5d {
    JFrame f;
    JButton b1, b2, b3;

    public Q5d() {
        f = new JFrame("Grid Bag Layout");
        b1 = new JButton("One");
        b2 = new JButton("Two");
        b3 = new JButton("Three");

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(b1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        f.add(b2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        f.add(b3, gbc);
    }

    public static void main(String[] args) {
        new Q5d();
    }
}
