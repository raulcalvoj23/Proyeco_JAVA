<%-- 
    Document   : index
    Created on : 11-abr-2016, 13:42:10
    Author     : hanek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Logueate</title>
    </head>
   <body>

    <div id="wrap">
  <div id="regbar">
    <div id="navthing">
      <h2><a href="#" id="loginform">Login</a> | <a href="registrate.jsp">Register</a> | <a href="admin.jsp">Administrador</a></h2>
    <div class="login">
      <div class="arrow-up"></div>
      <div class="formholder">
        <div class="randompad">
           <fieldset>
               
               <form action="Login" method="POST">
             <label name="user">Email</label>
             <input type="email" name="user" id="user" value="example@example.com" />
             <label name="pass">Password</label>
             <input type="password" name="pass" id="pass"/>
             <input type="submit" value="Entrar" />
               </form>
           </fieldset>
        </div>
      </div>
    </div>
    </div>
  </div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

    
    
    
  </body>
        
</html>
