/*
2. Write a Java program to create Menu and MenuItem with Accelerator and Mnemonics.
Handle the appropriate event when a menu item is clicked.
*/

package Lab4;

import javax.swing.*;
import java.awt.event.*;

public class Q2 implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu m1, m2;
    JMenuItem i1, i2;
    JCheckBoxMenuItem cb1;
    JRadioButtonMenuItem r1, r2;

    public Q2() {
        f = new JFrame("MenuExample");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        i1 = new JMenuItem("New", KeyEvent.VK_N);
        i2 = new JMenuItem("Open");
        i2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.ALT_DOWN_MASK));
        cb1 = new JCheckBoxMenuItem("Copy");
        r1 = new JRadioButtonMenuItem("Paste");
        r2 = new JRadioButtonMenuItem("Select");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        m1.add(i1);
        m1.add(i2);
        m2.add(cb1);
        m2.add(r1);
        m2.add(r2);

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        i1.addActionListener(this);
        i2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "New")
            JOptionPane.showMessageDialog(f, "New Menu item is Clicked.");
        if (e.getActionCommand() == "Open")
            JOptionPane.showMessageDialog(f, "Open Menu item is Clicked.");
    }

    public static void main(String[] args) {
        new Q2();
    }
}
