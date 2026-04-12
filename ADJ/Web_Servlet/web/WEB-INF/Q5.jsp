<%-- 
    Document   : Q5 --> To Update And Delete Employee Information whose salary is below 5000
    Created on : Apr 12, 2026, 7:53:31 AM
    Author     : acer
--%>

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Update & Delete Employee</title>
</head>
<body>

<h2>Employees (After Deleting Salary < 5000)</h2>

<%
Connection con = null;

try {
    // Load driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Connect DB
    con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Company", "root", "");

    // DELETE employees with salary < 5000
    PreparedStatement deleteStmt = con.prepareStatement(
        "DELETE FROM Employee WHERE salary < 5000");
    int deleted = deleteStmt.executeUpdate();

    out.println("<b>Deleted Records: " + deleted + "</b><br><br>");

    // UPDATE (example: increase remaining salary by 10%)
    PreparedStatement updateStmt = con.prepareStatement(
        "UPDATE Employee SET salary = salary + (salary * 0.1)");
    int updated = updateStmt.executeUpdate();

    out.println("<b>Updated Records: " + updated + "</b><br><br>");

    // DISPLAY remaining employees
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Employee");

    out.println("<table border='1'>");
    out.println("<tr><th>Eid</th><th>Name</th><th>Address</th><th>Salary</th></tr>");

    while (rs.next()) {
        out.println("<tr>");
        out.println("<td>" + rs.getInt("Eid") + "</td>");
        out.println("<td>" + rs.getString("name") + "</td>");
        out.println("<td>" + rs.getString("address") + "</td>");
        out.println("<td>" + rs.getDouble("salary") + "</td>");
        out.println("</tr>");
    }

    out.println("</table>");

} catch (Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (con != null) con.close();
}
%>

</body>
</html>