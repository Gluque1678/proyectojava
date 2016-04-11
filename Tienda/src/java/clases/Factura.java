package clases;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GERMAN
 */
public class Factura {
    
    private int factura_id;
    private java.util.Date factura_fecha;
    private int cli_id;
    private double facturatotal;

    public int getFactura_id() {
        return factura_id;
    }

    public Date getFactura_fecha() {
        return factura_fecha;
    }

    public int getCli_id() {
        return cli_id;
    }

    public double getFacturatotal() {
        return facturatotal;
    }

    public void setFactura_id(int factura_id) {
        this.factura_id = factura_id;
    }

    public void setFactura_fecha(Date factura_fecha) {
        this.factura_fecha = factura_fecha;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public void setFacturatotal(double facturatotal) {
        this.facturatotal = facturatotal;
    }
    
    
    
    
    
}
