<%-- 
    Document   : divide_outcome
    Created on : 21 May 2025, 10:51:53 PM
    Author     : moren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Division Outcome Page</title>
    </head>
    <body>
        <h1>Division Outcome</h1>
        <%
            double divident = (Double)request.getAttribute("divident");
            int num1 = (Integer)request.getAttribute("num1");
            int num2 = (Integer)request.getAttribute("num2");
        %>
        <p>
            The division of <b><%=num1%></b> and <b><%=num2%></b> equals <b><%=divident%></b>
        </p>
        <p>
            <a href="menu.html">Menu</a></br>
            <a href="index.html">Home</a>
        </p>
            
    </body>
</html>
