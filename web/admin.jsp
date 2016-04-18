<%-- 
    Document   : admin
    Created on : 14-abr-2016, 10:36:36
    Author     : hanek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/style2.css">
        <title>Pagina de administrador</title>
    </head>
   
      <body>
            <div class="container">
                <section id="content">
                        <h1>Portal del Administrador</h1>
                            <form action="LoginAdmin" method="POST">
                                <p><input type="text" name="user" id="user" placeholder="Introduce el email"/></p>
                                <p><input type="password" name="pass" id="pass" placeholder="Introduce la contraseña"/></p>
                                <p><input type="submit" name="Entrar" id="Entrar" value="Entrar"/></p>

                            </form>		
                            
                </section>
</div>
</body>
    
        <script src="js/index.js"></script>

    
    
    
  </body>
</html>
