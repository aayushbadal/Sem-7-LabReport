// 3. Write a servlet program to create and read Cookie and session.

package Lab7;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


// This is Create Cookie:
public class Q3a_1 extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String cname = "BSCCSIT";
        String cvalue = "Himalaya";
        Cookie ck = new Cookie(cname, cvalue);
        
        res.addCookie(ck);
        out.println("Cookie Created and Sent ...\n");
        out.println("<a href='Q3a_2'> Click here to read cookie </a>");
    }
}
