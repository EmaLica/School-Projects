<%-- 
    Document   : leggiCookie
    Created on : 21-apr-2023, 23.28.45
    Author     : emanu
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Leggi Cookie</title>
    </head>
    <body>
        <h1>Ecco il cookie!</h1>
        <%! Cookie mioCookie = null;%>
        <%! int indice = 0; %>
        <%! Cookie[] cookiesUtente;%>
        <% cookiesUtente = request.getCookies();
            mioCookie = cookiesUtente[0];
            out.println("Valore dei cookie: " + mioCookie.getValue());
            mioCookie = cookiesUtente[1];
            out.println("Valore dei cookie: " + mioCookie.getValue());
        %>
    </body>
</html>
