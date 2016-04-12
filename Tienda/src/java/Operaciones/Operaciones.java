/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import conexiones.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Enric
 */
public class Operaciones {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public void mostrar (ArrayList lista){
        sSQL = "select * from tbl_cliente";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()){
                ClienteDAO ai = new ClienteDAO();
                ai.setCli_id(rs.getInt("Cli_id"));
                ai.setCli_nom(rs.getString("Cli_nom"));
                ai.setCli_edad(rs.getInt("Cli_edad"));
                lista.add(ai);
            }
        }catch(Exception e){
            
        }
    }
    public boolean insertar (ClienteDAO ai){
        sSQL = "insert into `tbl_cliente`('cli_nom','cli_edad') values (?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, ai.getCli_nom());
            pst.setInt(2, ai.getCli_edad());
            
            int n = pst.executeUpdate();
            if (n != 0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
    public boolean editar (ClienteDAO ai){
        sSQL = "update tbl_cliente set cli_nom=?, set cli_edad=?, where id=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, ai.getCli_nom());
            pst.setInt(2, ai.getCli_edad());
            pst.setInt(3, ai.getCli_id());
            
            int n = pst.executeUpdate();
            if (n != 0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
    public boolean eliminar (ClienteDAO ai){
        sSQL = "delete from tbl_cliente where id=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, ai.getCli_id());    
            int n = pst.executeUpdate();
            if (n != 0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
}
