<%-- 
    Document   : settaCose
    Created on : 22-apr-2023, 0.04.51
    Author     : emanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Setta Cose</title>
    </head>
    <body>
        <h1>Ho settato!</h1>
        <%! String colore = "rosso"; %>
        <%! String squadra = "napoli"; %>
        <%! String cibo = "pizza";%>
        <% request.setAttribute("colore", colore);
            request.setAttribute("squadra", squadra);
            request.setAttribute("cibo", cibo);
             request.getRequestDispatcher("vediCose.jsp").forward(request, response);
        %>
        <a href="vediCose.jsp">Clicca per vedere</a>
    </body>
</html>
