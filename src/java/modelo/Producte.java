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
public class Producte {
    private int id_producte;
    private String nom_producte;
    private String descripcio_producte;
    private int preu_producte;
   
    public Producte (int id_producte, String nom_producte, String descripcio_producte, int preu_producte) {
        this.id_producte = id_producte;
        this.nom_producte = nom_producte;
        this.descripcio_producte = descripcio_producte;
        this.preu_producte = preu_producte;
               
    }
    
    public Producte () {
        
    }

    public int getId_producte() {
        return id_producte;
    }

    public String getNom_producte() {
        return nom_producte;
    }

    public String getDescripcio_producte() {
        return descripcio_producte;
    }

    public int getPreu_producte() {
        return preu_producte;
    }

    public void setId_producte(int id_producte) {
        this.id_producte = id_producte;
    }

    public void setNom_producte(String nom_producte) {
        this.nom_producte = nom_producte;
    }

    public void setDescripcio_producte(String descripcio_producte) {
        this.descripcio_producte = descripcio_producte;
    }

    public void setPreu_producte(int preu_producte) {
        this.preu_producte = preu_producte;
    }
    
    
}

