package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GERMAN
 */
public class Producto {
    
  private int pro_id;
  private String pro_nom;
  private int pro_cant;
  private double precio; 

    public int getPro_id() {
        return pro_id;
    }

    public String getPro_nom() {
        return pro_nom;
    }

    public int getPro_cant() {
        return pro_cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public void setPro_nom(String pro_nom) {
        this.pro_nom = pro_nom;
    }

    public void setPro_cant(int pro_cant) {
        this.pro_cant = pro_cant;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  
   
  
  
  
}
