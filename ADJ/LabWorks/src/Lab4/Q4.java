/*
4. Write a Java program to create a TextArea on a frame.
When clicking on the TextArea, show a popup menu containing different colors 
as menu items and change the background color of the TextArea when the corresponding menu item is clicked.
*/

package Lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 {
    JFrame f;
    JTextArea t;
    JPopupMenu pm;
    JMenuItem red, green, blue, yellow;

    public Q4() {
        f = new JFrame("Popup Color Changer");
        t = new JTextArea(10, 25);

        // Create Popup Menu
        pm = new JPopupMenu();

        red = new JMenuItem("Red");
        green = new JMenuItem("Green");
        blue = new JMenuItem("Blue");
        yellow = new JMenuItem("Yellow");

        // Add items to popup
        pm.add(red);
        pm.add(green);
        pm.add(blue);
        pm.add(yellow);

        // Action Listeners for menu items
        red.addActionListener(e -> t.setBackground(Color.RED));
        green.addActionListener(e -> t.setBackground(Color.GREEN));
        blue.addActionListener(e -> t.setBackground(Color.BLUE));
        yellow.addActionListener(e -> t.setBackground(Color.YELLOW));

        // Mouse Listener to show popup on right-click
        t.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger())
                    pm.show(t, e.getX(), e.getY());
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger())
                    pm.show(t, e.getX(), e.getY());
            }
        });

        f.setLayout(new FlowLayout());
        f.add(t);

        f.setSize(350, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q4();
    }
}