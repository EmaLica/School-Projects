<%-- 
    Document   : creaCookie
    Created on : 21-apr-2023, 23.26.10
    Author     : emanu
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crea Cookie</title>
    </head>
    <body>
        <%! Cookie newCookie = new Cookie("biscotto", "123412"); %>
        <% newCookie.setMaxAge(3600);
        response.addCookie(newCookie);
        %>
        <h1>Ho creato un cookie, vallo a vedere!</h1> <br> <a href="leggiCookie.jsp">guarda</a>
    </body>
</html>
