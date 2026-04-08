// b. Cached RowSet
package Lab5;

import java.sql.*;
import javax.sql.rowset.*;

public class Q3b {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/HCOE", "root", "");

        String sql = "SELECT * FROM Student";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        // Create CachedRowSet
        RowSetFactory rsf = RowSetProvider.newFactory();
        CachedRowSet crs = rsf.createCachedRowSet();

        crs.populate(rs);  // Fill data into CachedRowSet
        con.close();       // Connection closed

        System.out.println("Roll\t\tName\t\tSemester");

        // Move cursor to 2nd row
        crs.absolute(2);

        System.out.println(
                crs.getInt(1) + "\t\t" +
                crs.getString(2) + "\t\t" +
                crs.getString(3)
        );
    }
}