//d. JTree

package Lab4;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.tree.*;

public class Q5d {
    JFrame f;
    JTree tr;
    DefaultMutableTreeNode n1,n2,n3,n4,n5,n6,n7;

    public Q5d(){
        f = new JFrame("Tree Example");

        n1 = new DefaultMutableTreeNode("HCOE");
        n2 = new DefaultMutableTreeNode("Engineering");
        n3 = new DefaultMutableTreeNode("IT");
        n4 = new DefaultMutableTreeNode("Civil");
        n5 = new DefaultMutableTreeNode("Computer");
        n6 = new DefaultMutableTreeNode("CSIT");
        n7 = new DefaultMutableTreeNode("BCA");

        n1.add(n2); 
        n1.add(n3);
        n2.add(n4); 
        n2.add(n5);
        n3.add(n6); 
        n3.add(n7);

        tr = new JTree(n1);

        f.setLayout(new FlowLayout());
        f.add(tr);

        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q5d();
    }
}