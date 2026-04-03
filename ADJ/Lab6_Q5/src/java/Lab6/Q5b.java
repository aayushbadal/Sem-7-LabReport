// b. By Extending GenericServlet Class
package Lab6;
import java.io.*;
import javax.servlet.*;
public class Q5b extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1> This is second way to create Servlet (Extending Generic Servlet). </h1>");
    }
}
