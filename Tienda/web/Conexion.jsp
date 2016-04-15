

<%@page import="java.lang.System.out"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
import="java.sql.Connection"
import="java.sql.DriverManager" 
import="java.sql.Resultset"
import="java.sql.Statement"
import="java.sql.SQLException"
   %>    

<%
    
   Connection conex=null;
   Statement sql=null;
   try {
       class.forName("com.msql.jdbc.Driver");
       conex=(Connection)DriverManager.getConnection("jdbc:mysql/127.0.0.1/botigavirtual","root","");
       sql = conex.createStatement();
       out.print("Conexion Establecida");
   } catch(Exception e) {
       
       
       out.print("ERROR EN LA CONEXION + e");
   
   }
    
   %>  