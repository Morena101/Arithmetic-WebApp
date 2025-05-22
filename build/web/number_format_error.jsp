<%-- 
    Document   : number_format_error
    Created on : 22 May 2025, 3:31:52 PM
    Author     : moren
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number Format Error Page</title>
    </head>
    <body>
        <h1>Number format error</h1>
        <%
            String errorMsg = exception.getMessage();
        %>
        <p>
            <b>Error message --> <%=errorMsg%></b> </br>
            Please enter a number.
        </p>
        <p>
            Click <a href="index.html">here</a> to go to the main page.
        </p>
    </body>
</html>
