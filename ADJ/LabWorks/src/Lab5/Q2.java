//2. Create a GUI based Java Application to perform CRUD operation on database
package Lab5;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;

public class Q2 implements ActionListener {

    JFrame f;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3;
    JTable tb;
    DefaultTableModel model;
    JScrollPane sp;

    public Q2() {

        f = new JFrame("CRUD in GUI App");

        l1 = new JLabel("EID");
        l2 = new JLabel("Name");
        l3 = new JLabel("Address");
        l4 = new JLabel("Salary");

        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        t4 = new JTextField(15);

        b1 = new JButton("Insert");
        b2 = new JButton("Update");
        b3 = new JButton("Delete");

        model = new DefaultTableModel();
        model.addColumn("EID");
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("Salary");

        tb = new JTable(model);
        sp = new JScrollPane(tb);

        f.setLayout(new FlowLayout());

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(t4);

        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.add(sp);

        f.setSize(700, 700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // Row click → load data into textfields
        tb.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = tb.getSelectedRow();

                t1.setText(model.getValueAt(row, 0).toString());
                t2.setText(model.getValueAt(row, 1).toString());
                t3.setText(model.getValueAt(row, 2).toString());
                t4.setText(model.getValueAt(row, 3).toString());

                // Prevent changing primary key during update
                t1.setEditable(false);
            }
        });

        loadTable();
    }

    // Load data into JTable
    public void loadTable() {
        try {
            model.setRowCount(0);

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/Company", "root", "");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Employee");

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4)
                });
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {

        // INSERT
        if (e.getSource() == b1) {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost/Company", "root", "");

                String sql = "INSERT INTO Employee VALUES (?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, Integer.parseInt(t1.getText()));
                ps.setString(2, t2.getText());
                ps.setString(3, t3.getText());
                ps.setDouble(4, Double.parseDouble(t4.getText()));

                int row = ps.executeUpdate();

                if (row > 0)
                    JOptionPane.showMessageDialog(f, "Inserted Successfully");

                con.close();
                loadTable();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        // UPDATE
        if (e.getSource() == b2) {

            int selectedRow = tb.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(f, "Please select a row to update!");
                return;
            }

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost/Company", "root", "");

                String sql = "UPDATE Employee SET Name=?, Address=?, Salary=? WHERE EID=?";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, t2.getText());
                ps.setString(2, t3.getText());
                ps.setDouble(3, Double.parseDouble(t4.getText()));
                ps.setInt(4, Integer.parseInt(t1.getText()));

                int row = ps.executeUpdate();

                if (row > 0)
                    JOptionPane.showMessageDialog(f, "Updated Successfully");

                con.close();
                loadTable();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        // DELETE
        if (e.getSource() == b3) {

            int selectedRow = tb.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(f, "Please select a row to delete!");
                return;
            }

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost/Company", "root", "");

                String sql = "DELETE FROM Employee WHERE EID=?";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, Integer.parseInt(t1.getText()));

                int row = ps.executeUpdate();

                if (row > 0)
                    JOptionPane.showMessageDialog(f, "Deleted Successfully");

                con.close();
                loadTable();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");

        t1.setEditable(true); // enable again after operation
    }

    public static void main(String[] args) {
        new Q2();
    }
}