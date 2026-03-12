/*
4. Write a Java program using Swing component to create a student registration form with fields:

Text field for Name

Text field for Address

Text field for Email

Text field for Password

Radio button for Gender

Checkbox for Hobbies

Country as dropdown list

Opinion as text area

One button for Submit

Your program should display the student information when the user clicks the submit button.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 {
    JFrame f;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField t1, t2, t3, t4;
    JRadioButton rb1, rb2;
    JComboBox<String> cb1;
    JCheckBox c1, c2, c3, c4;
    JTextArea ta1, ta2;
    JButton b1;
    JScrollPane sp1, sp2;

    public Q4() {
        f = new JFrame("Registration form");
        l1 = new JLabel("Name:");
        l2 = new JLabel("Address:");
        l3 = new JLabel("Email:");
        l4 = new JLabel("Password:");
        l5 = new JLabel("Gender:");
        l6 = new JLabel("Hobbies:");
        l7 = new JLabel("Country:");
        l8 = new JLabel("Opinion:");

        t1 = new JTextField(15);
        t2 = new JTextField(20);
        t3 = new JTextField(25);
        t4 = new JTextField(20);

        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        c1 = new JCheckBox("Reading");
        c2 = new JCheckBox("Playing");
        c3 = new JCheckBox("Coding");
        c4 = new JCheckBox("Others");

        String[] country = { "Choose Your Country", "Nepal", "India", "USA" };
        cb1 = new JComboBox<>(country);

        ta1 = new JTextArea(10, 20);
        sp1 = new JScrollPane(ta1);

        b1 = new JButton("Submit");

        ta2 = new JTextArea(20, 40);
        sp2 = new JScrollPane(ta2);

        f.setSize(1050, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(rb1);
        f.add(rb2);
        f.add(l6);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(l7);
        f.add(cb1);
        f.add(l8);
        f.add(sp1);
        f.add(b1);
        f.add(sp2);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gender = " ";
                if (rb1.isSelected())
                    gender = "Male";
                else if (rb2.isSelected())
                    gender = "Female";
                String hobbies = "";

                if (c1.isSelected())
                    hobbies += c1.getText() + ", ";
                if (c2.isSelected())
                    hobbies += c2.getText() + ", ";
                if (c3.isSelected())
                    hobbies += c3.getText() + ", ";
                if (c4.isSelected())
                    hobbies += c4.getText() + ". ";

                String country = cb1.getSelectedItem().toString();
                if (country == "Choose Your Country") {
                    JOptionPane.showMessageDialog(f, "Please select a country");

                    return;
                }
                ta2.setText(
                        "Name : " + t1.getText() + "\nAddress : " + t2.getText() + "\nEmail : " + t3.getText()
                                + "\nPassword : " + t4.getText() +
                                "\nGender : " + gender + "\nHobbies : " + hobbies + "\nCountry : " + country
                                + "\nOpinion : " + ta1.getText());
            }
        });
    }

    public static void main(String[] args) {
        new Q4();
    }
}