package Lab7;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Q1 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int num = Integer.parseInt(req.getParameter("num"));
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        PrintWriter out = res.getWriter();
        out.println("Sum of digits = " + sum);
    }
}