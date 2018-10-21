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
    <a aligt="left"  href="index.html"><img src="imagen/regresar.png" width="80" height="52" > </a>
        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
        <a  href="registrar.html"><img src="imagen/registrar.png" width="80" height="52" >   </a>
    <hr/>
    <style type="text/css">
  body {    color: white;    background-color:mediumseagreen }
        </style>
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
            <%
            String user =  "obo";
                %>
                <i> Contraseña </i>
                <input  type ="password" name="pswd" placeholder="¿?">
                    <br><br>
                    <%
                        String pswd = "servlet1" ;
                        %>
            <input type="submit" value="O K" > 
            </form>
        </center>
    </body>
</html>
