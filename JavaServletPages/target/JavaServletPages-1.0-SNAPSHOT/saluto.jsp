<%-- 
    Document   : saluto.jsp
    Created on : 22-apr-2023, 0.17.23
    Author     : emanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saluto</title>
    </head>
    <body>
        <% String nome = request.getParameter("nome"); %>
        <% String cognome = request.getParameter("cognome"); %>
        <h1>Ciao <%= nome %><%= cognome %></h1>
    </body>
</html>
