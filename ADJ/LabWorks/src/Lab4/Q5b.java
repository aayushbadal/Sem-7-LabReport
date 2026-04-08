/*
5. Write a Java program to illustrate:
b. Internal Frames
*/

package Lab4;

import javax.swing.*;
import java.awt.event.*;

public class Q5b extends JFrame implements ActionListener {

    JDesktopPane desktop;
    JButton btn;

    public Q5b() {
        setTitle("Internal Frame Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Desktop Pane
        desktop = new JDesktopPane();
        add(desktop);

        // Button to create internal frame
        btn = new JButton("Open Internal Frame");
        btn.setBounds(150, 20, 200, 30);
        desktop.add(btn);

        btn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Create Internal Frame
        JInternalFrame iframe = new JInternalFrame(
                "My Internal Frame",
                true,  // resizable
                true,  // closable
                true,  // maximizable
                true   // iconifiable
        );

        iframe.setSize(250, 150);
        iframe.setLocation(100, 100);

        // Add content inside internal frame
        iframe.add(new JLabel("Hello inside Internal Frame!"));

        iframe.setVisible(true);
        desktop.add(iframe);
    }

    public static void main(String[] args) {
        new Q5b();
    }
}