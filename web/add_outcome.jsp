<%-- 
    Document   : add_outcome
    Created on : 21 May 2025, 10:25:20 PM
    Author     : moren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Addition Outcome Page</title>
    </head>
    <body>
        <h1>Addition Outcome</h1>
        <%
            int sum = (Integer)request.getAttribute("sum");
            int num1 = (Integer)request.getAttribute("num1");
            int num2 = (Integer)request.getAttribute("num2");
        %>
        <p>
            The sum of <b><%=num1%></b> and <b><%=num2%></b> equals <b><%=sum%></b>
        </p>
        <p>
            <a href="menu.html">Menu</a></br>
            <a href="index.html">Home</a>
        </p>
            
    </body>
</html>
