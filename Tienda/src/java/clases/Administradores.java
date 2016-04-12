/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author GERMAN
 */
public class Administradores {
    
    private int Admin_id;
    private String Admin_nombre;
    private String AdminUsuario;
    private int rol_id;
    private String AdminPassword;

    public int getAdmin_id() {
        return Admin_id;
    }

    public String getAdmin_nombre() {
        return Admin_nombre;
    }

    public String getAdminUsuario() {
        return AdminUsuario;
    }

    public int getRol_id() {
        return rol_id;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdmin_id(int Admin_id) {
        this.Admin_id = Admin_id;
    }

    public void setAdmin_nombre(String Admin_nombre) {
        this.Admin_nombre = Admin_nombre;
    }

    public void setAdminUsuario(String AdminUsuario) {
        this.AdminUsuario = AdminUsuario;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }
    
    
    
    
    
    
    
    
    
    
}