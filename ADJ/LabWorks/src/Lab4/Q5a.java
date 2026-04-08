/*
5. Write a Java program to illustrate the following Swing components:

a. JFileChooser
*/

package Lab4;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class Q5a implements ActionListener {

     JFrame f;
     
    JButton openBtn;
    JTextField tf;

    public Q5a() {
        f= new JFrame("JFileChooser Example");
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        // Button
        openBtn = new JButton("Open File");
        f.add(openBtn);

        // TextField to display selected file path
        tf = new JTextField();
        f.add(tf);

        // Add ActionListener
        openBtn.addActionListener(this);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Create JFileChooser
        JFileChooser fc = new JFileChooser();

        // Open dialog
        int result = fc.showOpenDialog(f);

        // Check if user selected a file
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            tf.setText(file.getAbsolutePath());
        } else {
            tf.setText("No file selected");
        }
    }

    public static void main(String[] args) {
        new Q5a();
    }
}
