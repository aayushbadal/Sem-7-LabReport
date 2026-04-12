package Lab7;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


// This is create session:
public class Q3b_1 extends HttpServlet {

        public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();   
            
            HttpSession session = req.getSession();
            session.setAttribute("Program", "Bsc_CSIT");
            out.println("<h2>Session Created </h2>");
            out.println("<a href = 'Q3b_2'> Click here to read Session ...</a>");
            
        }

}