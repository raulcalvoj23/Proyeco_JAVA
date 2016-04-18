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
public class LineaFactura {
    private int id_lineafactura;
    private int id_producte;
    private int id_factura;
    
    public LineaFactura (int id_lineafactura, int id_producte, int id_factura) {
        this.id_lineafactura = id_lineafactura;
        this.id_producte = id_producte;
        this.id_factura = id_factura;
        
    }
    
    public LineaFactura () {
    
    }

    public int getId_lineafactura() {
        return id_lineafactura;
    }

    public int getId_producte() {
        return id_producte;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_lineafactura(int id_lineafactura) {
        this.id_lineafactura = id_lineafactura;
    }

    public void setId_producte(int id_producte) {
        this.id_producte = id_producte;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
    
    
}
