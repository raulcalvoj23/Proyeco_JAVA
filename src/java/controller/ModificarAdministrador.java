/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Administrador;
import modelo.Consultas;

/**
 *
 * @author hanek
 */
@WebServlet(name = "ModificarAdministrador", urlPatterns = {"/ModificarAdministrador"})
public class ModificarAdministrador extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        Consultas con = new Consultas();
        Administrador adm = new Administrador();
        String id_administrador = request.getParameter("id");
        int id_admin = Integer.parseInt(id_administrador);
        adm.setId_administrador(id_admin);
        adm.setNom_administrador("nom_administrador");
        adm.setPassword_administrador("password_administrador");
        
       if (con.modificarAdministrador(adm)) {
           response.sendRedirect("veradministradores.jsp");
       } else {
           response.sendRedirect("ModificarAdministrador.jsp?id_admin="+id_admin);
       }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    

}
