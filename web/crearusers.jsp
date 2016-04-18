<%-- 
    Document   : registrate
    Created on : 12-abr-2016, 8:48:21
    Author     : hanek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina del administrador</title>
    </head>
    <body>
        <h1>Crea a tus clientes</h1>
        
         <form action="CrearUsers" method="POST">
                <p>Nombre:</p> 
                <input type="text" name="nombre" id="nombre"/></br>
                
                <p>Apellidos:</p>
                <p><input type="text" name="apellidos" id="apellidos"/></p>
                
                <p>Dni:</p>
                <p><input type="text" name="dni" id="dni"/></p>
                
                <p>Password:</p>
                <p><input type="password" name="pass" id="pass"/></p>
                
                <p>Email:</p>
                <p><input type="text" name="email" id="email"/></p>
                
                <p><input type="submit" name="Enviar" id="Enviar" value="Registrate"></p>
                
                
            </form>
        
        <button><a href="index.jsp">Volver</button
    </body>
</html>
