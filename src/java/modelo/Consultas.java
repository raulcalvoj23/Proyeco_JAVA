package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanek
 */
public class Consultas {
    
    Conexion micon = new Conexion ();
    Connection con = micon.conectar();
    String sSQL = "" ;
    
    public boolean AutenticationCliente (String user, String pass) throws SQLException {
        boolean estado = false;
        
        try {
            sSQL = "SELECT * FROM client WHERE email_client=? AND password_client=?";
            
            PreparedStatement ps = con.prepareStatement(sSQL);
            ps.setString(1, user);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            estado = rs.next();
            
        } catch (Exception e) {
            
            System.out.println(e);
        
        }
             
        return estado;
    }
    
    public boolean AutenticationAdmin (String user, String pass) throws SQLException {
        boolean estado = false;
        
        try {
            sSQL = "SELECT * FROM administrador WHERE email_administrador=? AND password_administrador=?";
            
            PreparedStatement ps = con.prepareStatement(sSQL);
            ps.setString(1, user);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            estado = rs.next();
            
        } catch (Exception e) {
            
            System.out.println(e);
        
        }
             
        return estado;
    }
    
    public void mostrar (ArrayList lista){
        sSQL = "select * from client";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()){
                Client ai = new Client();
                ai.setId_client(rs.getInt("id_client"));
                ai.setNom_client(rs.getString("nom_client"));
                ai.setCognoms_client(rs.getString("cognoms_client"));
                ai.setDni_client(rs.getString("dni_client"));
                ai.setEmail_client(rs.getString("email_client"));
                lista.add(ai);
            }
        }catch(Exception e){
            
        }
    }
    
    public void mostrarAdmin (ArrayList lista){
        sSQL = "select * from administrador";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()){
                Administrador adm = new Administrador();
                adm.setId_administrador(rs.getInt("id_administrador"));
                adm.setNom_administrador(rs.getString("nom_administrador"));
                adm.setPassword_administrador(rs.getString("password_administrador"));
                adm.setEmail_administrador(rs.getString("email_administrador"));
                lista.add(adm);
            }
        }catch(Exception e){
            
        }
    }
    
        public boolean insertar (Client ai){
                sSQL = "insert into `client`(`nom_client`,`cognoms_client`, `dni_client`, `password_client`, `email_client`) values (?,?,?,?,?)";
                try {
                    PreparedStatement pst = con.prepareStatement(sSQL);
                    pst.setString(1, ai.getNom_client());
                    pst.setString(2, ai.getCognoms_client());
                    pst.setString(3, ai.getDni_client());
                    pst.setString(4, ai.getPassword_client());
                    pst.setString(5, ai.getEmail_client());

                    int n = pst.executeUpdate();
                    if (n != 0){
                        return true;
                    }else{
                        return false;
                    }
                }catch(Exception e){
                    return false;
                }
        }    
        
        public boolean editar (Client ai){
        sSQL = "update client set nom_client=?, set cognoms_client=?, set dni_client=?, set password_client=?, set email_client=?, where id_client=?";
        try {
            PreparedStatement pst = con.prepareStatement(sSQL);
            pst.setString(1, ai.getNom_client());
            pst.setString(2, ai.getCognoms_client());
            pst.setString(3, ai.getDni_client());
            pst.setString(4, ai.getPassword_client());
            pst.setString(5, ai.getEmail_client());
            pst.setInt(6, ai.getId_client());
            
            int n = pst.executeUpdate();
            if (n != 0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
        
        public boolean eliminar (Client ai){
        sSQL = "delete from client where id_client=?";
        try {
            PreparedStatement pst = con.prepareStatement(sSQL);
            pst.setInt(1, ai.getId_client());    
            int n = pst.executeUpdate();
            if (n != 0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
        
        public ArrayList LeerModificarAdministrador (ArrayList lista, int id_administrador) {
            sSQL = "select * from administrador where id_administrador="+id_administrador;
            
            try {
                Statement st = con.createStatement();
                ResultSet rs;
                rs = st.executeQuery(sSQL);
                
                while(rs.next()) {
                    Administrador adm = new Administrador();
                    adm.setId_administrador(rs.getInt("id_administrador"));
                    adm.setNom_administrador(rs.getString("nom_administrador"));
                    adm.setEmail_administrador(rs.getString("email_adminsitrador"));
                    adm.setPassword_administrador(rs.getString("password_administrador"));
                    lista.add(adm);
                    
                }
                
                if (lista.size() == 0) {
                    lista.set(0, "No");
                    return lista;
                } else {
                    return lista;
                }
            } catch (Exception e) {
                lista.set(0, "No");
                return lista;
            }
            
            
        }
        
        public boolean modificarAdministrador (Administrador adm) {
            int id = adm.getId_administrador();
            sSQL = "update administrador set nom_administrador = ?, email_administrador = ?, password_administrador = ?";
            try {
                
                PreparedStatement pst = con.prepareStatement(sSQL);
                pst.setString(1, adm.getNom_administrador());
                pst.setString(2, adm.getEmail_administrador());
                pst.setString(3, adm.getPassword_administrador());
                
                int n = pst.executeUpdate();
                if (n != 0) {
                    return true;
                } else {
                    return false;
                }
                
                
            } catch (Exception e) {
                return false;
            }
        }
}
