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
public class Administrador {
    private int id_administrador;
    private String email_administrador;
    private String password_administrador;
    private String nom_administrador;
    
    public Administrador (int id_administrador, String email_administrador, String password_administrador, String nom_administrador) {
        this.id_administrador = id_administrador;
        this.email_administrador = email_administrador;
        this.password_administrador = password_administrador;
        this.nom_administrador = nom_administrador;
                
    }
    
    public Administrador () {
        
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public String getEmail_administrador() {
        return email_administrador;
    }

    public String getPassword_administrador() {
        return password_administrador;
    }

    public String getNom_administrador() {
        return nom_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public void setEmail_administrador(String email_administrador) {
        this.email_administrador = email_administrador;
    }

    public void setPassword_administrador(String password_administrador) {
        this.password_administrador = password_administrador;
    }

    public void setNom_administrador(String nom_administrador) {
        this.nom_administrador = nom_administrador;
    }
    
    
}
