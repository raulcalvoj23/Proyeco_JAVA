package modelo;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanek
 */
public class Factura {
    private int id_factura;
    private int id_client;
    private String cantidad_total;
    
    public Factura (int id_factura, int id_client, String cantidad_total) {
        this.id_factura = id_factura;
        this.id_client = id_client;
        this.cantidad_total = cantidad_total;
        
    }
    
    public Factura () {
        
    }

    public int getId_factura() {
        return id_factura;
    }

    public int getId_client() {
        return id_client;
    }

    public String getCantidad_total() {
        return cantidad_total;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setCantidad_total(String cantidad_total) {
        this.cantidad_total = cantidad_total;
    }
    
    
}

