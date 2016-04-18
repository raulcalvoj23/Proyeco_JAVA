<%-- 
    Document   : ModificarUsers
    Created on : 15-abr-2016, 10:46:28
    Author     : hanek
--%>

<%@page import="modelo.Consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <% 
        String id_administrador = request.getParameter("id_administrador");
        int id_admin = Integer.parseInt(id_administrador);
        ArrayList<Administrador> lista = new ArrayList<Administrador>();
        Consultas con = new Consultas();
        con.LeerModificarAdministrador(lista, id_admin);
        
            for(Administrador adm:lista) {
                
                %>
    <body>
        <h1>Hello World!</h1>
        
        <form action="ModificarAdministrador" method="POST">
                <p>Id:</p> 
                <input type="text" name="id" id="id" value="<%out.println(adm.getId_administrador());%>"/></br>
            
                <p>Nombre:</p> 
                <input type="text" name="nombre" id="nombre" value="<%out.println(adm.getNom_administrador());%>"/></br>
                
                <p>Password:</p>
                <p><input type="text" name="apellidos" id="apellidos" value="<%out.println(adm.getPassword_administrador());%>"/></p>
                
                <p>Email:</p>
                <p><input type="text" name="dni" id="dni" value="<%out.println(adm.getEmail_administrador());%>"/></p>
                        
                <p><input type="submit" name="Enviar" id="Enviar" value="Registrate"></p>
                
                <%
                    }
                    %>
            </form>
    </body>
</html>
