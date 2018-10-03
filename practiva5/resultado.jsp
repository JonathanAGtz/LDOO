<%-- 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style type="text/css">
  body {    color: white;    background-color: black }
        </style>
        <br>
    <center>
        <% 
            String nombre = request.getParameter("nombre");
            String pApe = request.getParameter("pApe");
            String sApe = request.getParameter("sApe");
            String fn = request.getParameter("fn");
            String correo = request.getParameter("correo");
            String pswd = request.getParameter("pswd");
        %>
        <h1> Informacion del usuario </h1>
        <br>
        <br><br>
        El nombre es:
        <%
            out.println(nombre);
            out.println(pApe);
            out.println(sApe);
        %>
        <br>
        La fecha de naciemiento es:
        <%
            out.println( fn  );
        %>
        <br>
        El correo es:
        <%
            out.println( correo  );
        %>
        <br>
        Tu contraseña es:
        <%
            out.println(pswd  );
        %>
    </center>
    </body>
</html>
