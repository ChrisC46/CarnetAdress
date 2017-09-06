/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetadresse;

import ClassObjets.GestionCarnetAdresse;
import java.io.IOException;

/**
 *
 * @author CDI305
 */
public class CarnetAdresseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        GestionCarnetAdresse monCarnet = new GestionCarnetAdresse();

        monCarnet.gestionContact();

    }

}
