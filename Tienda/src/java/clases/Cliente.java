/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

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
    private String Cli_dni;
    private String Cli_sexo;
    private String Cli_comentario;
    private Date Cli_fechanacimiento;

    public int getCli_id() {
        return Cli_id;
    }

    public void setCli_id(int Cli_id) {
        this.Cli_id = Cli_id;
    }

    public String getCli_nombre() {
        return Cli_nombre;
    }

    public void setCli_nombre(String Cli_nombre) {
        this.Cli_nombre = Cli_nombre;
    }

    public String getCli_apellidos() {
        return Cli_apellidos;
    }

    public void setCli_apellidos(String Cli_apellidos) {
        this.Cli_apellidos = Cli_apellidos;
    }

    public String getCli_dirección() {
        return Cli_dirección;
    }

    public Date getCli_fechanacimiento() {
        return Cli_fechanacimiento;
    }
    
    public void setCli_dirección(String Cli_dirección) {
        this.Cli_dirección = Cli_dirección;
    }

    public String getCli_localidad() {
        return Cli_localidad;
    }

    public void setCli_localidad(String Cli_localidad) {
        this.Cli_localidad = Cli_localidad;
    }

    public String getCli_provincia() {
        return Cli_provincia;
    }

    public void setCli_provincia(String Cli_provincia) {
        this.Cli_provincia = Cli_provincia;
    }

    public String getCli_telefono() {
        return Cli_telefono;
    }

    public void setCli_telefono(String Cli_telefono) {
        this.Cli_telefono = Cli_telefono;
    }

    public String getCliUsuario() {
        return CliUsuario;
    }

    public void setCliUsuario(String CliUsuario) {
        this.CliUsuario = CliUsuario;
    }

    public String getCliPassword() {
        return CliPassword;
    }

    public void setCliPassword(String CliPassword) {
        this.CliPassword = CliPassword;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getCli_dni() {
        return Cli_dni;
    }

    public void setCli_dni(String Cli_dni) {
        this.Cli_dni = Cli_dni;
    }

    public String getCli_sexo() {
        return Cli_sexo;
    }

    public void setCli_sexo(String Cli_sexo) {
        this.Cli_sexo = Cli_sexo;
    }

    public String getCli_comentario() {
        return Cli_comentario;
    }

    public void setCli_comentario(String Cli_comentario) {
        this.Cli_comentario = Cli_comentario;
    }

    public void setCli_fechanacimiento(Date Cli_fechanacimiento) {
        this.Cli_fechanacimiento = Cli_fechanacimiento;
    }

   
}
