/*
5. Write a java program to create servlet using following ways:
a. By implementing Servlet Interface
*/
package Lab6;

import java.io.*;
import javax.servlet.*;
public class Q5a implements Servlet {
ServletConfig config = null;
    public void init(ServletConfig config) throws ServletException{
        this.config = config;
    }
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1> This is the first way to Create servlet.</h1>");
    }
    public void destroy(){
        System.out.println("Destroy method is invoked");
    }
    public ServletConfig getServletConfig(){
        return config;
    }
    public String getServletInfo(){
        return "Copyright 2026";
    }
}