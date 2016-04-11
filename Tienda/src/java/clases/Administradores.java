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
    private String Admin_email;
    private int rol_id;
    private String Admin_password;

    public int getAdmin_id() {
        return Admin_id;
    }

    public String getAdmin_nombre() {
        return Admin_nombre;
    }

    public String getAdmin_email() {
        return Admin_email;
    }

    public int getRol_id() {
        return rol_id;
    }

    public String getAdmin_password() {
        return Admin_password;
    }

    public void setAdmin_id(int Admin_id) {
        this.Admin_id = Admin_id;
    }

    public void setAdmin_nombre(String Admin_nombre) {
        this.Admin_nombre = Admin_nombre;
    }

    public void setAdmin_email(String Admin_email) {
        this.Admin_email = Admin_email;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public void setAdmin_password(String Admin_password) {
        this.Admin_password = Admin_password;
    }
    
    
    
    
}
