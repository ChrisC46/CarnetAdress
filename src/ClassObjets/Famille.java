/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassObjets;

/**
 *
 * @author CDI305
 */
public class Famille extends Amis {

    Console console2 = new Console();

    private String dateNaissance;

    //constructor
    public Famille() {
    }

    public Famille(String nom, String prenom, String adresseRue, String codePostal, String ville, String telephone, String email, int typeContact, String dateNaissance, String telephoneMobile) {
        super(nom, prenom, adresseRue, codePostal, ville, telephone, email, typeContact, telephoneMobile);
        this.dateNaissance = dateNaissance;
    }

    @Override
    public int getTypeContact() {
        return 3;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

   

    @Override
    public String toString() {
        return super.toString() + "\ndateNaissance : " + dateNaissance;
    }

}
