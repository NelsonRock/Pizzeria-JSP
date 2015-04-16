<%-- 
    Document   : mostrar
    Created on : Jan 31, 2013, 11:17:46 PM
    Author     : family
--%>

<%@page contentType="text/html" import="Clases.*, javax.servlet.http.HttpSession ;" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css" >
            .centrar{
                margin-left: auto;
                margin-right: auto;
            }
        </style>
    </head>
    <body>
        <%! HttpSession sesion; %>
        <% Usuario u = (Usuario)request.getAttribute("usuario");
         String t=(String)request.getAttribute("telefono");
        if(u==null){
            %>
            <div class="centrar"> 
            <h1>Regitrarse</h1>
             <form action="/Pizzeria/SRegistrar" method="POST" >
             <table border="1" cellspacing="1" cellpadding="1">
            
               <thead>
                <tr>
                    <th>Campos</th>
                    <th>Valor</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre" /></td>
                </tr>
                <tr>
                    <td>Direccion</td>
                    <td><input type="text" name="direccion" /></td>
                </tr>
                <tr>
                    <td>Codigo Posta</td>
                    <td><input type="text" name="cpostal" /></td>
                </tr>
                <tr>
                    <td>Telefono</td>
                    <td><input type="text" name="telefono" value="<%=t %>"  /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Registrar" /></td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        </form>
            </div>
        <%
        }
               else{
               sesion=request.getSession(true);
               sesion.setAttribute("usuario", u);
               
        %>
        <h1>Bienvenido</h1>
         <div class="centrar">    
        <form action="/Pizzeria/pedido.jsp" method="POST">
            <table border="1" cellspacing="1" cellpadding="1"><thead>
                <tr>
                    <th>Campos</th>
                    <th>Valor</th>
                </tr>
            </thead>
            <tbody>
   <tr>
                    <td>Nombre</td>
                    <td><input type="text" disabled="true" name="nombre" value="<%=u.getNombre() %>" /></td>
                </tr>
                <tr>
                    <td>Direccion</td>
                    <td><input type="text" name="direccion" value="<%=u.getDireccion() %>" /></td>
                </tr>
                <tr>
                    <td>Codigo Postal</td>
                    <td><input type="text" name="cpostal" value="<%=u.getCpostal() %>" /></td>
                </tr>
                <tr>
                    <td>Telefono</td>
                    <td><input type="text" disabled="true" name="telefono" value="<%=u.getTelefono() %>" /></td>
                </tr>
                  <tr>
                    <td><input type="submit" name="m" value="Modificar" /></td>
                    <td><input type="submit" name="m" value="Pedido" /></td>
                </tr>
            </tbody>
        </table>
            </form>
                </div>
          <%
          }
        %>
    </body>
</html>
