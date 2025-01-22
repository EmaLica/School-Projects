<%-- 
    Document   : test
    Created on : 21-apr-2023, 23.03.50
    Author     : emanu
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ciao ${me}!</h1>
                <h1>Ciao ${classe}!</h1>
        <ul>
            <%! int contatoreGlobale = 0;%>
            <% int contatoreLocale = 0;%>
            <label>Contatore Globale:</label><%= ++contatoreGlobale%><br>
            <label>Contatore Locale:</label><%= ++contatoreLocale%><br>
            
            
            
            <c:forEach items="${nomi}" var="persone">
                <li>${persone}</li>
                </c:forEach><br>
            <a href="http://localhost:8080/JavaServletPages/Servlet">Ricarica la pagina</a>
        </ul>
    </body>
</html>
