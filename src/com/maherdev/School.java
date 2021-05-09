package com.maherdev;

public class School {
    Classe[] listeClasses;
    Eleve[] listeEleves;
    Activite[] listeActivites;
    Animateur[] listeAnimateur;

    public School(){

    }
    public void ajouterEleve(){

    }
    public void ajouterEleveClasse(){

    }
    public void ajouterEleveActivite(){

    }
    public void updateEleve(){

    }
    public void updateEleveClasse(){

    }
    public void updateEleveActivite(){

    }
    public void facture(Eleve eleve){
        /*
        * frais mensuel d'inscription au activités selon niveau scolaire selon les activités suivies
        */
        float total = 750.5f;

        // recherche sur les activité
        System.out.println("************ Facture ************");
        System.out.printf("\nNom et Prenom : %s %s \n",eleve.nom,eleve.prenom);

        System.out.printf(" %s : 1234.450 DT",eleve.niveauScolaire);

        System.out.println("\n activités :");
        System.out.println("--------------------------------------");
        System.out.printf("activité 1 : 1234.450 DT");
        System.out.printf("activité 2 : 1234.450 DT");
        System.out.printf("activité 3 : 1234.450 DT");
        System.out.printf("activité 4 : 1234.450 DT");
        System.out.println("--------------------------------------");
        System.out.printf("Total : %s",total);

    }
}
