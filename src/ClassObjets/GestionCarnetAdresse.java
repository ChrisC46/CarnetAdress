/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassObjets;

import Tris.TrisCodePostal;
import Tris.TrisNom;
import Tris.TrisType;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author CDI305
 */
public class GestionCarnetAdresse {

    public GestionCarnetAdresse() {
    }

    private Vector<Connaissance> monCarnetAdresse = new Vector();

    // Nouveaux Contact
    Connaissance connaissance1 = new Connaissance("Theblues", "Agathe", "15 rue de la Musique", "78360", "Montesson", "0144556699", "agathe.theblues@gmail.com", 1);
    Connaissance connaissance2 = new Connaissance("Renee", "Jean", "1 rue pas la", "56100", "Ailleur", "0144556633", "Renee.email@gmail.com", 1);
    Amis amis1 = new Amis("Bebert", "Robert", "6 rue le bon", "75004", "Paris", "01365544785", "bebert@gmail.com", 2, "0655996321");
    Amis amis2 = new Amis("Meurdesoif", "Jean", "20 rue de la Soif", "75010", "Paris", "0166666666", "jeanmeurdesoif@gmail.com", 2, "064561561");
    Famille famille1 = new Famille("Betise", "GrosseConnerie", "6 rue des conneries", "75010", "Paris", "0102659698", "anepasfaire@gmail.com", 3, "0756968796", "15/09/1963");

    //appel de la console
    
    Console console = new Console();

    
    // methode general pour faire fonctionner le carnet d'adresse
    public void gestionContact() throws IOException {

        console.menuAccueil();
        switch (console.choixSwitch()) {
            case 1:
                afficherUnContact();
                gestionContact();
                break;

            case 2:
                ajouterContact();
                gestionContact();
                break;

            case 3:
                modifierContact();
                gestionContact();
                break;

            case 4:
                supprimerUnContact();
                gestionContact();
                break;

            default:
                console.choixValide();
                break;

        }

    }

    //methode pour afficher un contact
    public void afficherUnContact() throws IOException {

        console.afficherContact();

        switch (console.choixSwitch()) {
            case 1:
                String nomAfficher = console.nomAfficher();
                int index = 0;
                int indexRecherche = -1;
                Iterator<Connaissance> itConnaissance = monCarnetAdresse.iterator();
                while (itConnaissance.hasNext()) {
                    if (itConnaissance.next().getNom().equalsIgnoreCase(nomAfficher)) {
                        indexRecherche = index;
                    }
                    index = index + 1;
                }
                if (indexRecherche != -1) {
                    System.out.println(monCarnetAdresse.get(indexRecherche));
                } else {
                    console.nomInconnu();
                }
                break;
            case 2:
                trisCarnetNom();
                break;
            case 3:
                trisCarnetCodePostal();
                break;
            case 4:
                trisCarnetType();
                break;
            default:
                console.choixValide();
                break;
        }

    }

    //methode pour ajouter un contact
    public void ajouterContact() throws IOException {

        console.menuModifContact();

        switch (console.choixSwitch()) {

//            case 0:
//                console.activCarnet();
//                monCarnetAdresse.add(connaissance1);
//                monCarnetAdresse.add(connaissance2);
//                monCarnetAdresse.add(amis1);
//                monCarnetAdresse.add(amis2);
//                monCarnetAdresse.add(famille1);
//                gestionContact();
//                break;

            case 1:
                creerContactConnaissance();
                gestionContact();
                break;
            case 2:
                creerContactAmis();
                gestionContact();
                break;
            case 3:
                creerContactFamille();
                gestionContact();
                break;

            default:
                console.choixValide();
                gestionContact();
                break;
        }
    }

    // methode creer contact Connaissance
    public void creerContactConnaissance() throws IOException {
        Connaissance connais1 = new Connaissance();
        connais1.setNom(console.nom());
        connais1.setPrenom(console.prenom());
        connais1.setTelephone(console.telephone());
        if ((connais1.getNom().isEmpty())
                || (connais1.getPrenom().isEmpty())
                || (connais1.getTelephone().isEmpty())) {
            console.infoMinimum();
        }
            connais1.setAdresseRue(console.adresse());
            connais1.setCodePostal(console.codePostal());
            connais1.setVille(console.ville());
            connais1.setEmail(console.mail());

       
            monCarnetAdresse.add(connais1);
        }
    
    // methode creer contact Amis
    public void creerContactAmis() throws IOException {
        Amis newAmis = new Amis();
        newAmis.setNom(console.nom());
        newAmis.setPrenom(console.prenom());
        newAmis.setTelephone(console.telephone());
        if ((newAmis.getNom().isEmpty())
                || (newAmis.getPrenom().isEmpty())
                || (newAmis.getTelephone().isEmpty())) {
            console.infoMinimum();
        }
            newAmis.setAdresseRue(console.adresse());
            newAmis.setCodePostal(console.codePostal());
            newAmis.setVille(console.ville());
            newAmis.setEmail(console.mail());
            newAmis.setTelephoneMobile(console.telephonePortable());

      
            monCarnetAdresse.add(newAmis);
        }
    
    // methode creer contact Famille
    public void creerContactFamille() throws IOException {
        Famille newFamille = new Famille();
        newFamille.setNom(console.nom());
        newFamille.setPrenom(console.prenom());
        newFamille.setTelephone(console.telephone());
        if ((newFamille.getNom().isEmpty())
                || (newFamille.getPrenom().isEmpty())
                || (newFamille.getTelephone().isEmpty())) {
            console.infoMinimum();
        }
        newFamille.setAdresseRue(console.adresse());
        newFamille.setCodePostal(console.codePostal());
        newFamille.setVille(console.ville());
        newFamille.setEmail(console.mail());
        newFamille.setTelephoneMobile(console.telephonePortable());
        newFamille.setDateNaissance(console.dateNaissance());

    monCarnetAdresse.add(newFamille);
    
    }

    //methode pour modifier
    public void modifierContact() throws IOException {

        console.modifContact();
        String nomAfficher = console.nomAfficher();
        int index = 0;
        int indexRecherche = -1;
        Iterator<Connaissance> itConnaissance = monCarnetAdresse.iterator();
        while (itConnaissance.hasNext()) {
            if (itConnaissance.next().getNom().equalsIgnoreCase(nomAfficher)) {
                indexRecherche = index;
            }
            index = index + 1;
        }

        if (indexRecherche != -1) {
            console.choixModification();
            if (monCarnetAdresse.get(indexRecherche).getTypeContact() == 3) {
                console.choixFamille();
            } else if (monCarnetAdresse.get(indexRecherche).getTypeContact() == 2) {
                console.choixAmis();
            } else if (monCarnetAdresse.get(indexRecherche).getTypeContact() == 1) {
                console.choixFamille();
            } else {
                console.nomInconnu();
            }

            switch (console.choixSwitch()) {
                case 1:
                    monCarnetAdresse.get(indexRecherche).setNom(console.nom());
                    break;
                case 2:
                    monCarnetAdresse.get(indexRecherche).setPrenom(console.prenom());
                    break;
                case 3:
                    monCarnetAdresse.get(indexRecherche).setTelephone(console.telephone());
                    break;
                case 4:
                    monCarnetAdresse.get(indexRecherche).setAdresseRue(console.adresse());
                    break;
                case 5:
                    monCarnetAdresse.get(indexRecherche).setCodePostal(console.codePostal());
                    break;
                case 6:
                    monCarnetAdresse.get(indexRecherche).setVille(console.ville());
                    break;
                case 7:
                    monCarnetAdresse.get(indexRecherche).setEmail(console.mail());
                    break;
                case 8:
                    if (monCarnetAdresse.get(indexRecherche).getTypeContact() == 2) {
                        ((Amis) monCarnetAdresse.get(indexRecherche)).setTelephoneMobile(console.telephonePortable());
                    }
                    break;
                case 9:
                    if (monCarnetAdresse.get(indexRecherche).getTypeContact() == 3) {
                        ((Famille) monCarnetAdresse.get(indexRecherche)).setDateNaissance(console.dateNaissance());
                    }
                    break;
                default:
                    console.choixValide();
                    break;

            }
        }

    }
    
     //methode pour supprimer un contact
    public void supprimerUnContact() throws IOException {

        console.supprContact();
        String nomAfficher = console.nomAfficher();
        int index = 0;
        int indexRecherche = -1;
        Iterator<Connaissance> itConnaissance = monCarnetAdresse.iterator();
        while (itConnaissance.hasNext()) {
            if (itConnaissance.next().getNom().equalsIgnoreCase(nomAfficher)) {
                indexRecherche = index;
            }
            index = index + 1;
        }
        if (indexRecherche != -1) {
            monCarnetAdresse.remove(indexRecherche);
            System.out.println("la fiche de " + nomAfficher + " est supprimée");
        } else {
            console.nomInconnu();
        }
    }

    //methode de tris par nom
    public void trisCarnetNom() {
        TrisNom trisNom1 = new TrisNom();
        Collections.sort(monCarnetAdresse, trisNom1);
        for (Connaissance uneConnaissance : monCarnetAdresse) {
            System.out.println(uneConnaissance);
        }
    }

    //methode de tris par code postal
    public void trisCarnetCodePostal() {
        TrisCodePostal trisCodePostal1 = new TrisCodePostal();
        Collections.sort(monCarnetAdresse, trisCodePostal1);
        for (Connaissance uneConnaissance : monCarnetAdresse) {
            System.out.println(uneConnaissance);
        }
    }

    //methode de tris par type
    public void trisCarnetType() {
        TrisType trisType1 = new TrisType();
        Collections.sort(monCarnetAdresse, trisType1);
        for (Connaissance uneConnaissance : monCarnetAdresse) {
            System.out.println(uneConnaissance);
        }

    }
    
}

    
    