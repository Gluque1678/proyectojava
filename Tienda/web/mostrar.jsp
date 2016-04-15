

    <%@page import="java.util.ArrayList"%>
    <%@page import="LoginServlets.Cliente"%>
    <%@page contentType="text/html" pageEnconding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar</title>
    </head>
    <body>
        <h1>mostrar</h1>
        <% ArrayList<Cliente> lista=(ArrayList<Cliente>)request.getAttribute("milista");
        for(Cliente cliente:lista){
            
            out.println(cliente.getCli_nombre());}
                               
         %>                               
    </body>
</html>
