//c. JTable

package Lab4;

import javax.swing.*;
import java.awt.*;

public class Q5c {
    JFrame f;
    JTable tb;
    JScrollPane sp;
    public Q5c(){
        f = new JFrame("Table Example");
        String[] colname = {"Roll", "Name", "Semester"};
        String[][] data = {{"101", "Ram", "First"}, {"102", "Hari", "Second"}};
        tb = new JTable(data, colname);
        sp = new JScrollPane(tb);
        
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(sp);
    }
    public static void main(String[] args) {
        new Q5c();
    }
}
