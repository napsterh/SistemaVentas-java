/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class Controlador extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch(accion){
            case "Principal":
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
                break;
            case "Producto":
                request.getRequestDispatcher("Producto.jsp").forward(request, response);
                break;
            case "Clientes":
                request.getRequestDispatcher("Clientes.jsp").forward(request, response);
                break;
            case "Empleado":
                request.getRequestDispatcher("Empleado.jsp").forward(request, response);
                break;
            case "RegistrarVenta":
                request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
