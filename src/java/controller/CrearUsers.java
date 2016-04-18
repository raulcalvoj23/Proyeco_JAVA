/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Client;
import modelo.Consultas;

/**
 *
 * @author hanek
 */
@WebServlet(name = "CrearUsers", urlPatterns = {"/CrearUsers"})
public class CrearUsers extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            
            Consultas con = new Consultas();
        
                Client ai = new Client();

                ai.setNom_client(request.getParameter("nombre"));
                ai.setCognoms_client(request.getParameter("apellidos"));
                ai.setDni_client(request.getParameter("dni"));
                ai.setPassword_client(request.getParameter("pass"));
                ai.setEmail_client(request.getParameter("email"));


                if(con.insertar(ai)) {

                    response.sendRedirect("main.jsp");

                } else {

                    response.sendRedirect("No se ha podido crear correctamente");
                }
            
        } catch (Exception e) {
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    

}
