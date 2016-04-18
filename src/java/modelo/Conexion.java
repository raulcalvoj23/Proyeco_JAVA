package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enric
 */
public class Conexion {    
    public Conexion(){
    };
    public Connection conectar() {
        Connection con=null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/botiga_virtual","root","");
        } catch (ClassNotFoundException  e) {
            JOptionPane.showConfirmDialog(null, e);
        } catch (SQLException  e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return con;
    }

}
