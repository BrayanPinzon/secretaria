<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="destino.jsp">

        </form> 
        <%@page import="a.Principal" %>
        <%
            int codigo = Integer.parseInt("codigo");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String sexo = request.getParameter("sexo");
            String direccion = request.getParameter("direccion");
            String lugar = request.getParameter("lugar");
            String motivo = request.getParameter("motivo");
            String medico = request.getParameter("medico");
            String fecha = request.getParameter("fecha");
            a.Principal b = new Principal();
        %>
    </body>
</html>
