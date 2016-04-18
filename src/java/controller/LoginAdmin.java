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
import modelo.Consultas;

/**
 *
 * @author hanek
 */
@WebServlet(name = "LoginAdmin", urlPatterns = {"/LoginAdmin"})
public class LoginAdmin extends HttpServlet {

    
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
               
        Consultas con = new Consultas();
        
           try {
            if(con.AutenticationAdmin(user, pass)) {
                
                response.sendRedirect("main.jsp");
          
            } else {
                
                response.sendRedirect("index.jsp");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    

}
