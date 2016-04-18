<%-- 
    Document   : main
    Created on : 13-abr-2016, 10:37:39
    Author     : hanek
--%>


<%@page import="modelo.Administrador"%>
<%@page import="modelo.Consultas"%>
<%@page import="modelo.Client"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Esto son los usuarios que hay</h1>
        
        <% ArrayList<Client> lista = new ArrayList<Client>(); 
        
        Consultas con = new Consultas();
        
        con.mostrar(lista);
        
        %>
        
         
        
        <table border="1px">
            <th>Id</th>
            <th>Nombre</th>
            <th>Apellidos</th>
            <th>DNI</th>
            <th>Email</th>
            <th>Operaciones</th>
           
        <% 
        
            for(Client c1:lista) { 
        
        %>
            
        <tr>
            <td><%out.println(c1.getId_client());%></td>
            <td><%out.println(c1.getNom_client());%></td>
            <td><%out.println(c1.getCognoms_client());%></td>
            <td><%out.println(c1.getDni_client());%></td>
            <td><%out.println(c1.getEmail_client());%></td>
            <td><button><a href="EliminarUsers"> Eliminar</a></button> | 
            <button><a href="ModificarUsers"> Modificar</a></button></td>
            
            
        </tr>
        
            
            
        <% } %> 
           
        </table>
        
        <button><a href="crearusers.jsp">Crear Usuarios</a></button>
        <button><a href="veradministradores.jsp">Ver administradores</a></button>
        
    </body>
</html>
