/*
3. Write a Java program to create a login form with ToolTipText and validation, 
    and display the username and password when the login button is clicked, otherwise display an error message.
*/

package Lab4;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Q3 implements ActionListener{
    JFrame f;
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1;
    public Q3(){
        f = new JFrame("Login Form");
        l1= new JLabel("Username");
        l2 = new JLabel("Password");
        t1 = new JTextField(10);
        t1.setToolTipText("abc@example.com");
        t2 = new JTextField(8);
        b1 = new JButton("Login");
        
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(b1);
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        
    }
    public static void main(String[] args) {
        new Q3();
    }
}
