/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import clases.Cliente;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author German
 */
public class Consultas extends Conexion{
    
    //Login Usuarios y Administradores
    
    public boolean Autenticacion(String user,String pass) throws SQLException
    {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String Consulta = "Select * from cliente";
       
        rs = st.executeQuery(Consulta);
        
        while(rs.next())
        {
            if(user.equals(rs.getString("CliUsuario")) && pass.equals(rs.getString("CliPassword")))
               
                return true;
        }
  
        return false; 
        
    }
    
    // public static void main(String[] args) throws SQLException {
     //   Consultas con = new Consultas();
    //     System.out.println(con.Autenticacion("felipe@hotmail.com", "1234"));
    
     // }  Pruevas de consultas poniendole un usuario y contraseña
     
   //Login Usuarios y Administradores
    
    public boolean Autenticacion2(String user,String pass) throws SQLException
    {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String Consulta = "Select * from administradores";
       
        rs = st.executeQuery(Consulta);
        
        while(rs.next())
        {
            if(user.equals(rs.getString("AdminUsuario")) && pass.equals(rs.getString("AdminPassword")))
               
                return true;
        }
  
        return false; 
        
    }
    
     //public static void main(String[] args) throws SQLException {
    // Consultas con = new Consultas();
     //System.out.println(con.Autenticacion("felipe@hotmail.com", "1234"));
    
      //} Pruevas de consultas poniendole un usuario y contraseña


    //registrar clientes
    
    public boolean registrarCliente (Cliente cli) {
        
        String sSQL= "INSERT INTO `Cli_nombre`, `Cli_apellidos`, `Cli_direccion`, `Cli_localidad`, `Cli_provincia`, `Cli_telefono`, `CliUsuario`, `rol_id`, `CliPassword`, `Cli_dni`, `Cli_sexo`, `Cli_comentario`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
       
        try {
            
                PreparedStatement pst = con.prepareStatement(sSQL);
                pst.setString(1, cli.getCli_nombre());
                pst.setString(2, cli.getCli_apellidos());
                pst.setString(3, cli.getCli_dirección()); 
                pst.setString(4, cli.getCli_localidad()); 
                pst.setString(5, cli.getCli_provincia());
                pst.setString(6, cli.getCli_telefono());
                pst.setString(7, cli.getCliUsuario());
                pst.setInt(8,(cli.getRol_id()));
                pst.setString(9, cli.getCliPassword());
                pst.setString(10, cli.getCli_dni());
                pst.setString(11, cli.getCli_sexo());
                pst.setString(12, cli.getCli_comentario());
                pst.setDate(13, (Date) cli.getCli_fechanacimiento());
            
                int n= pst.executeUpdate();
                if (n !=0){
                            return true;    
                 
                }else {         
                      
                        return false; 
  
        
                      }  
                
        }catch (Exception e)
        
        {
    
        return false;
    
        }
}





}
    