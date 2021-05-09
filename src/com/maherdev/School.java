package com.maherdev;

public class School {
    Classe[] listeClasses;

    public School(){

    }

    public void facture(Eleve eleve){
        /*
        * frais mensuel d'inscription au activités selon niveau scolaire selon les activités suivies
        */
        float total = 750.5f;

        String niveau = eleve.niveauScolaire;
        System.out.println("************ Facture ************");
        System.out.printf("Total : %s",total);

    }
}
