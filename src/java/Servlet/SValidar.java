/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import BDPizzas.BDUsuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import bbdd.BaseDatos;
import java.sql.*;
import Clases.*;
import java.util.*;

/**
 *
 * @author family
 */
@WebServlet(name = "SValidar", urlPatterns = {"/SValidar"})
public class SValidar extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rd;
            try{ 
           HttpSession sesion;;
           BaseDatos mibase=new BaseDatos("jdbc:odbc:pizza","sun.jdbc.odbc.JdbcOdbcDriver"); 
           String e=mibase.abrir();
            if(!e.equals("")) {
                    String cadena="No puedo abrir base de datos";
                }
            else {
                    String telefono=request.getParameter("telefono");
                    Usuario u = BDUsuarios.buscar(telefono, mibase);
                    mibase.cerrar();
                    request.setAttribute("usuario", u);
                    request.setAttribute("telefono", telefono);
            }
            mibase.cerrar();
            
            
        } finally {        
                rd=request.getRequestDispatcher("/mostrar.jsp");
                rd.forward(request,response); out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
