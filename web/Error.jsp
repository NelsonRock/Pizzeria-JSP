<%-- 
    Document   : Error
    Created on : 13-mar-2013, 21:20:00
    Author     : nelson
--%>

<%@page contentType="text/html" errorPage="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= exception.getMessage() %>
        <%= exception.toString() %>
    </body>
</html>
