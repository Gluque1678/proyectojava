<%-- 
    Document   : errorvista
    Created on : 15-abr-2016, 17:36:17
    Author     : GERMAN
--%>

<%
        String error = (String)request.getSession().getAttribute("error");
        
        
        %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ha ocurrido un error: <%=error %></h1>
        <a href="index.jsp"> Volver...</a>
    </body>
</html>
