/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author German
 */
public class Consultas extends Conexion{
    
    
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
    
    }
    
    
    
    

