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
public class Client {
    private int id_client;
    private String nom_client;
    private String cognoms_client;
    private String dni_client;
    private String password_client;
    private String email_client;
    
    public Client(String nom_client, String cognoms_client, String dni_client, String password_client, String email_client) {
        this.nom_client = nom_client;
        this.cognoms_client = cognoms_client;
        this.dni_client = dni_client;
        this.password_client = password_client;
        this.email_client = email_client;
    }
    
    public Client () {
        
    }

    public int getId_client() {
        return id_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public String getCognoms_client() {
        return cognoms_client;
    }

    public String getDni_client() {
        return dni_client;
    }

    public String getPassword_client() {
        return password_client;
    }

    public String getEmail_client() {
        return email_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public void setCognoms_client(String cognoms_client) {
        this.cognoms_client = cognoms_client;
    }

    public void setDni_client(String dni_client) {
        this.dni_client = dni_client;
    }

    public void setPassword_client(String password_client) {
        this.password_client = password_client;
    }

    public void setEmail_client(String email_client) {
        this.email_client = email_client;
    }
    
    
}
