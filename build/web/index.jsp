<%-- 
    Document   : index
    Created on : Jan 28, 2013, 2:00:27 PM
    Author     : family
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pizzeria</h1>
        <form name="telefono" action="/Pizzeria/SValidar" method="POST">
           Telefono: <input type="text" name="telefono" size="10" />
           <input type="submit" value="Entrar" name="Enviar" />
        </form>
    </body>
</html>
