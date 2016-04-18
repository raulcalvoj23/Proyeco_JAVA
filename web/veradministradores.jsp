<%-- 
    Document   : veradministradores
    Created on : 15-abr-2016, 12:18:50
    Author     : hanek
--%>

<%@page import="modelo.Consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Administrador"%>
<%@page import="modelo.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <% ArrayList<Administrador> lista = new ArrayList<Administrador>(); 
        
        Consultas con = new Consultas();
        
        con.mostrarAdmin(lista);
        
        %>
    <body>
       <table border="1px">
            <th>Id</th>
            <th>Nombre</th>
            <th>Email</th>
            <th>Password</th>
            
           
        <% 
        
            for(Administrador c1:lista) { 
        
        %>
            
        <tr>
            <td><%out.println(c1.getId_administrador());%></td>
            <td><%out.println(c1.getNom_administrador());%></td>
            <td><%out.println(c1.getEmail_administrador());%></td>
            <td><%out.println(c1.getPassword_administrador());%></td>
            <td><button><a href="EliminarUsers"> Eliminar</a></button> |
                
                <% 
                    boolean enviar = true;
                    if (enviar == true) {
                    String id_administrador = String.valueOf(c1.getId_administrador());
                    request.setAttribute("id_administrador", id_administrador);
                    request.getRequestDispatcher("ModificarAdministrador.jsp").forward(request, response);
                    } else {
                      
                    }
                %>
               
            <button><a href="ModificarAdministrador.jsp">Modificar</a></button></td>
            
            
        </tr>
        
            
            
        <% } %> 
           
        </table>
    </body>
</html>
