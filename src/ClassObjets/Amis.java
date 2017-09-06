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
public class Amis extends Connaissance {
    
    Console console1 = new Console ();

    private String telephoneMobile;
//constructor
    public Amis() {
    }

    public Amis( String nom, String prenom, String adresseRue, String codePostal, String ville, String telephone, String email, int typeContact,String telephoneMobile) {
        super(nom, prenom, adresseRue, codePostal, ville, telephone, email, typeContact);
        this.telephoneMobile = telephoneMobile;
    }

    @Override
    public int getTypeContact() {
        return 2; 
    }
    
    
    public String getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

   

    @Override
    public String toString() {
        return super.toString() + "\ntelephoneMobile : " + telephoneMobile;
    }

}
