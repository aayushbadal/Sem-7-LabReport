package Lab7;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


// This is Read Session:
public class Q3b_2 extends HttpServlet {

        public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            
            HttpSession session = req.getSession();
            String sval = (String)session.getAttribute("Program");
            out.println("<h2>Session Value = "+sval+"</h2>");
        }
}
