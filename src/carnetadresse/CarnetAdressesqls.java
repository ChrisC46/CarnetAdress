/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetadresse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cdi305
 */
public class CarnetAdressesqls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //on charge le driver en memoire
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Oops:ClassNotFound: "+ ex.getMessage());
        }
        
        Connection connexion = null;
         
        //on se connecte au serveur
         try {
            String url = "jdbc:sqlserver://localhost:1433;" +
         "databaseName=CarnetAdresse;user=sa;password=sa";
            connexion = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.err.println("Oops:SQL: "+ ex.getErrorCode()+"/"+ex.getMessage());
        }
        
                 
         //on ferme la connexion au serveur
        try {
            connexion.close();
        } catch (SQLException ex) {
           System.err.println("Oops:Close: "+ ex.getErrorCode()+"/"+ex.getMessage());
        }
        
    }
    
}
