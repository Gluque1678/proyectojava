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
public class Cliente {
    
    private int Cli_id;
    private String Cli_nombre;
    private String Cli_apellidos;
    private String Cli_dirección;
    private String Cli_localidad;
    private String Cli_provincia;
    private String Cli_telefono;
    private String CliUsuario;
    private String CliPassword;
    private int rol_id;

    public int getCli_id() {
        return Cli_id;
    }

    public String getCli_nombre() {
        return Cli_nombre;
    }

    public String getCli_apellidos() {
        return Cli_apellidos;
    }

    public String getCli_dirección() {
        return Cli_dirección;
    }

    public String getCli_localidad() {
        return Cli_localidad;
    }

    public String getCli_provincia() {
        return Cli_provincia;
    }

    public String getCli_telefono() {
        return Cli_telefono;
    }

    public String getCliUsuario() {
        return CliUsuario;
    }

    public String getCliPassword() {
        return CliPassword;
    }

    

    public int getRol_id() {
        return rol_id;
    }

    public void setCli_id(int Cli_id) {
        this.Cli_id = Cli_id;
    }

    public void setCli_nombre(String Cli_nombre) {
        this.Cli_nombre = Cli_nombre;
    }

    public void setCli_apellidos(String Cli_apellidos) {
        this.Cli_apellidos = Cli_apellidos;
    }

    public void setCli_dirección(String Cli_dirección) {
        this.Cli_dirección = Cli_dirección;
    }

    public void setCli_localidad(String Cli_localidad) {
        this.Cli_localidad = Cli_localidad;
    }

    public void setCli_provincia(String Cli_provincia) {
        this.Cli_provincia = Cli_provincia;
    }

    public void setCli_telefono(String Cli_telefono) {
        this.Cli_telefono = Cli_telefono;
    }

    public void setCliUsuario(String CliUsuario) {
        this.CliUsuario = CliUsuario;
    }

    public void setCliPassword(String CliPassword) {
        this.CliPassword = CliPassword;
    }

    

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }
    

   
    
    
}
