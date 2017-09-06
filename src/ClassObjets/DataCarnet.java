/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassObjets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cdi305
 */
public class DataCarnet {
    
Connection connexion = null;

    public void chargeDriver() {
        //on charge le driver en memoire
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Oops:ClassNotFound: " + ex.getMessage());
        }

    }

    public void connexionServeur() {
        //on se connecte au serveur
        
        try {
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=CarnetAdresse;user=sa;password=sa";
            connexion = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.err.println("Oops:SQL: " + ex.getErrorCode() + "/" + ex.getMessage());
        }
    }

    public void ajoutData () {
        try {
            //equivalent à nouvelle requete dans SQL = createStatement
            Statement stmt = connexion.createStatement();
            
            String query = "INSERT INTO maTable VALUES (3, 'cc', 3.3)";
            
            int result = stmt.executeUpdate(query);
            System.out.println("result= "+result);
            
        } catch (SQLException ex) {
            System.err.println("Oops : statement: "+ ex.getErrorCode()+"/"+ex.getMessage());
        }
        
    }
    
    public void femetureServeur() {
        //on ferme la connexion au serveur
        try {
            connexion.close();
        } catch (SQLException ex) {
            System.err.println("Oops:Close: " + ex.getErrorCode() + "/" + ex.getMessage());
        }

    }
}
