<%-- 
    Document   : entrar
    Created on : 15/10/2018, 09:38:43 PM
    Author     : jonap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <center>  <h4>   &nbsp;&nbsp; Diseño &nbsp; &nbsp;&nbsp; <h4/> <center/>
    <hr/>
    </head>
    </head>
    <body>
          <center>
            <h2> Iniciar session </h2>
            <form action="pract" method="POST" >
            <br>
                <i> Usuario </i>
                <input type="text" name="user" placeholder="Juan_perez...">
            <br><br>
                <i> Contraseña </i>
                <input  type ="password" name="pswd" placeholder="PASSWORD">
                    <br><br>
            <input type="submit" value="O K" > 
            </form>
        </center>
    </body>
</html>
