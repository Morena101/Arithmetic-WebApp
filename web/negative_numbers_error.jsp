<%-- 
    Document   : negative_numbers_error
    Created on : 22 May 2025, 3:51:41 PM
    Author     : moren
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Negative Numbers Error Page</title>
    </head>
    <body>
        <h1>Negative numbers error</h1>
        <%
            String errorMsg = (String)request.getAttribute("errorMsg");
        %>
        <p>
            <b>Error message --> <%=errorMsg%></b> </br>
            Please enter a positive.
        </p>
        <p>
            Click <a href="index.html">here</a> to go to the main page.
        </p>
    </body>
</html>
