package Lab7;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


// This is Read Cookie:
public class Q3a_2 extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        Cookie[]ck = req.getCookies();
        for(int i=0; i<ck.length;i++){
            out.println("<h1>Cookie name = "+ck[i].getName()+"<br>Cookie Value = "+ck[i].getValue()+"</h1>");
        }
    }
}
