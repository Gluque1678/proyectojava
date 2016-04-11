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
public class compras {
    
    private int compra_id; 
    private double compra_cantidad; 
    private int pro_id;  
    private int cli_id;

    public int getCompra_id() {
        return compra_id;
    }

    public double getCompra_cantidad() {
        return compra_cantidad;
    }

    public int getPro_id() {
        return pro_id;
    }

    public int getCli_id() {
        return cli_id;
    }

    public void setCompra_id(int compra_id) {
        this.compra_id = compra_id;
    }

    public void setCompra_cantidad(double compra_cantidad) {
        this.compra_cantidad = compra_cantidad;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }
    
    
    
    
}
