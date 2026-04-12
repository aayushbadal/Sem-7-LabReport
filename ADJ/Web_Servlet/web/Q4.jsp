<%-- 
    Document   : Q4 --> To Calculate Simple Interest
    Created on : Apr 12, 2026, 7:41:40 AM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculate Simple Interest</title>
    </head>
    <body>
        <form action="">
            <fieldset> 
                <legend> Input Form </legend>
                Enter Principal : <br>
                <input type="text" name="pr"/><br><br>
                Enter Time (Year): <br>
                <input type="text" name="ti"/><br><br>
                 Enter Rate of Interest (%): <br>
                 <input type="text" name="ra"/><br><br> 
                <input type="submit" name="submit" value="Calculate Simple Interest"/>
            </fieldset>
        </form>
        <%
            if(request.getParameter("submit") != null)
            {
                int p = Integer.parseInt(request.getParameter("pr"));
                int t = Integer.parseInt(request.getParameter("ti"));
                Double r = Double.parseDouble(request.getParameter("ra"));
                Double si = (p*t*r)/100;
                
                
                out.println("<h2>The Simple Interest of Principle: "+p +", Time: "+t+", And Rate: "+r+" is : "+si+"</h2");
            }
            %>
    </body>
</html>
