/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassObjets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author christophecuaz
 */
public class Console {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public int choixSwitch() throws IOException {
        String choixUtil = br.readLine();
        int choixUtilisateur = Integer.valueOf(choixUtil);
        return choixUtilisateur;
    }

    public String nomAfficher() throws IOException {
        System.out.println("###########################################");
        System.out.println("## Entrez le nom du contact que vous     ##");
        System.out.println("## souhaitez afficher :                  ##");
        System.out.println("###########################################");
        String nomAfficher = br.readLine();
        return nomAfficher;
    }

    public String nom() throws IOException {
        System.out.println("Veuillez entrer le nom");
        String nom = br.readLine();
        return nom;
    }

    public String prenom() throws IOException {
        System.out.println("Veuillez entrer le prenom");
        String prenom = br.readLine();
        return prenom;
    }

    public String telephone() throws IOException {
        System.out.println("Veuillez entrer le telphone");
        String telephone = br.readLine();
        return telephone;
    }

    public String adresse() throws IOException {
        System.out.println("Veuillez entrer l'adresse (numéro et nom de la rue)");
        String adresse = br.readLine();
        return adresse;
    }

    public String codePostal() throws IOException {
        System.out.println("Veuillez entrer le code postal");
        String codePostal = br.readLine();
        return codePostal;
    }

    public String ville() throws IOException {
        System.out.println("Veuillez entre la ville");
        String ville = br.readLine();
        return ville;
    }

    public String mail() throws IOException {
        System.out.println("Veuillez entrer l'adresse mail");
        String mail = br.readLine();
        return mail;
    }

    public String telephonePortable() throws IOException {
        System.out.println("Veuillez entre le telephone portable");
        String telephonePortable = br.readLine();
        return telephonePortable;
    }

    public String dateNaissance() throws IOException {
        System.out.println("Veuillez entrer la date de naissance");
        String dateNaissance = br.readLine();
        return dateNaissance;
    }
    
    public void menuAccueil() {
        System.out.println("#################################");
        System.out.println("##  Votre carnet d'adresse :   ##");
        System.out.println("##  Que souhaitez vous faire ? ##");
        System.out.println("##  1-Affichage des contact    ##");
        System.out.println("##  2-Ajouter un contact       ##");
        System.out.println("##  3-Modifier un contact      ##");
        System.out.println("##  4-Supprimer un contact     ##");
        System.out.println("#################################");
    }
    
    public void nomInconnu() {
        System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
        System.out.println("§ Ce nom n'est pas dans le carnet d'adresse §");
        System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
    }
    
    
//    public void activCarnet() {
//        System.out.println("#################################");
//        System.out.println("##     Activation du Carnet    ##");
//        System.out.println("#################################");
//    }
    
    public void infoMinimum() {
        System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
        System.out.println("§ Veuillez entrer au minimum le nom, prénom et telephone §");
        System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
    }
    
    public void choixValide() {
        System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
        System.out.println("§ Veuillez faire un choix valide §");
        System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
    }
    
     public void afficherContact() {
        System.out.println("#############################################");
        System.out.println("## Afficher un contacts                    ##");
        System.out.println("## 1 - Afficher un contact                 ##");
        System.out.println("## 2 - Afficher carnet par nom             ##");
        System.out.println("## 3 - afficher carnet par code postal     ##");
        System.out.println("## 4 - Afficher carnet par type de contact ##");
        System.out.println("#############################################");
    }
     
     public void choixModification () {
        System.out.println("####################################");
        System.out.println("## Que souhaitez vous modifier ?  ##");
        System.out.println("####################################");
    }
     
     public void supprContact() {
        System.out.println("#############################################");
        System.out.println("##          Supprimer un contact           ##");
        System.out.println("## Quel contact souhaitez vous supprimer ? ##");
        System.out.println("#############################################");
    }
     
     public void modifContact() {
        System.out.println("##############################################################");
        System.out.println("##                  Modifier un contact                     ##");
        System.out.println("## indiquer le nom du contact souhaitez que vous modifier ? ##");
        System.out.println("##############################################################");
    }
     
     public void menuModifContact() {
        System.out.println("##################################");
        System.out.println("## 0 - Activer carnet d'adresse ##");
        System.out.println("## 1 - inserer connaissance     ##");
        System.out.println("## 2 - inserer amis             ##");
        System.out.println("## 3 - inserer famille          ##");
        System.out.println("##################################");
    }
     
      public void choixFamille () {
        
        System.out.println("###################################");
        System.out.println("## 1 - le nom                    ##");
        System.out.println("## 2 - le prénom                 ##");
        System.out.println("## 3 - le telephone              ##");
        System.out.println("## 4 - l'adresse                 ##");
        System.out.println("## 5 - le code postal            ##");
        System.out.println("## 6 - la ville                  ##");
        System.out.println("## 7 - l'adresse mail            ##");
        System.out.println("## 8 - le telephone portable     ##");
        System.out.println("## 9 - la date de naissance      ##");
        System.out.println("###################################");
    }
     
        public void choixAmis () {
        
        System.out.println("###################################");
        System.out.println("## 1 - le nom                    ##");
        System.out.println("## 2 - le prénom                 ##");
        System.out.println("## 3 - le telephone              ##");
        System.out.println("## 4 - l'adresse                 ##");
        System.out.println("## 5 - le code postal            ##");
        System.out.println("## 6 - la ville                  ##");
        System.out.println("## 7 - l'adresse mail            ##");
        System.out.println("## 8 - le telephone portable     ##");
        System.out.println("###################################");
    }
    
    public void choixConnaissance () {
       
        System.out.println("###################################");
        System.out.println("## 1 - le nom                    ##");
        System.out.println("## 2 - le prénom                 ##");
        System.out.println("## 3 - le telephone              ##");
        System.out.println("## 4 - l'adresse                 ##");
        System.out.println("## 5 - le code postal            ##");
        System.out.println("## 6 - la ville                  ##");
        System.out.println("## 7 - l'adresse mail            ##");
        System.out.println("###################################");
    }
     
     
     
}



