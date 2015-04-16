<%-- 
    Document   : pedido
    Created on : 06-feb-2013, 9:27:19
    Author     : rcerrato
--%>

<%@page import="BDPizzas.BDUsuarios"%>
<%@page contentType="text/html" import="Clases.*, javax.servlet.http.HttpSession, bbdd.*;" session="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenidos a Pedidos</h1>
        <div>
            <form action="/Pizzeria/SPedido" method="POST">
            <table boder="1">
                <tr>
                    <td>Tipo de pizza</td>
                    <td colspan="2"><select name="pizza" >
                            <option value="g">Grande - 10€</option>    
                            <option value="m">Mediana - 7€</option>   
                            <option value="p">Pequeña - 4€</option>   
                        </select></td>
                        <td>Cantidad</td><td><input type="text" size="2" name="c" /></td>
                </tr>
            </table>
                <input type="submit" name="pedido" value="Pedir" />
            </form>
        </div>
        
    </body>
</html>
