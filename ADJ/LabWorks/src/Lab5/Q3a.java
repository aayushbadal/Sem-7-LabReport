// 3. Write a java program to illistrate the concept of 
// a.ResultSet Scrollable and Updatable.
package Lab5;
import java.sql.*;
public class Q3a {
    public static void main(String[] args)throws Exception {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/HCOE", "root", "");
       
       String sql = "select * from Student";
       Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
       ResultSet rs = st.executeQuery(sql);
        System.out.println("Roll\t\tName\t\tSemester");
        rs.absolute(3);
        System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
        con.close();
    }
}
