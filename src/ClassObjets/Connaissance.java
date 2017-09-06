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
public class Connaissance {
    
    Console console = new Console ();
    
    private String nom;
    private String prenom;
    private String adresseRue;
    private String codePostal;
    private String ville;
    private String telephone;
    private String email;
    private int typeContact;

    //constructor
    public Connaissance() {
    }

    public Connaissance(String nom, String prenom, String adresseRue, String codePostal, String ville, String telephone, String email, int typeContact) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresseRue = adresseRue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.telephone = telephone;
        this.email = email;
        this.typeContact = typeContact;
    }
    
    
    

    //setters & Getters
    public int getTypeContact() {
        return 1;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseRue() {
        return adresseRue;
    }

    public void setAdresseRue(String adresseRue) {
        this.adresseRue = adresseRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 
    @Override
    public String toString() {
        return "\n\nnom : " + nom + "\nprenom : " + prenom + "\nadresse : " + adresseRue + "\ncodePostal : " + codePostal + "\nville : " + ville + "\ntelephone : " + telephone + "\nemail : " + email;
    }

}
