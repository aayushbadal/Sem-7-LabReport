package Lab7;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; 
public class Q2 extends HttpServlet {
   
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        try{
            int eid = Integer.parseInt(req.getParameter("eid"));  
            String name = req.getParameter("name");
            String addr = req.getParameter("addr");
            Double sal = Double.parseDouble(req.getParameter("sal"));
            //Database Connectivity
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Company","root","");
            
            String sql="insert into Employee values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, eid);
            ps.setString(2, name);
            ps.setString(3,addr);
            ps.setDouble(4,sal);
            
            int row = ps.executeUpdate();
            if(row>0)
                out.println("<h1> Insert Data Successfully </h1>");
            else
                out.println("<h1>Error in Insertion </h1>");
            
            // Display:
            Statement st = con.createStatement();
            String dsql="select * from Employee";
            ResultSet rs =st.executeQuery(dsql);
            out.println("<table border=\"1px solid black\">\n" +
"                        <tr>\n" +
"                            <th>Student Roll</th>\n" +
"                            <th>Student Name</th>\n" +
"                            <th>Student Semester</th>\n" +
"                        </tr>");
            
                            while(rs.next()){
                                out.println("<tr>");
                                out.println("<td>"+rs.getInt(1)+"</td>");
                                out.println("<td>"+rs.getString(2)+"</td>");
                                out.println("<td>"+rs.getString(3)+"</td>");
                                out.println("</tr>");
                            }
                    out.println("</table>");
            con.close();
        }catch(Exception ex){}
    }
}
