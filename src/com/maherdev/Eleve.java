package com.maherdev;

import java.util.Date;

public class Eleve extends Person{
    protected static int count = 0; // conteur
    protected int id;

    protected Classe classe;
    protected Activite[] listeActivites;

    public Eleve(String nom,
                 String prenom,
                 Adresse adresse,
                 Date dateNaissance,
                 ImageProfil imageProfil,
                 Person pere,
                 Person mere){
        super(nom, prenom, adresse, dateNaissance, imageProfil, mere, pere);
        this.id = count++;
    }

    public void update(String nom, String prenom, Adresse adresse, Date dateNaissance, ImageProfil imageProfil, Person mere, Person pere){
        super.update(nom, prenom, adresse, dateNaissance, imageProfil, mere, pere);
    }

    public void show(){
        System.out.printf("Nom :\t%s \n", this.nom);
        System.out.printf("Prénom :\t%s\n", this.prenom);
        System.out.printf("Prénom du pére :\t%s\n", this.pere.prenom);
        System.out.printf("Prénom du grand-père :\t %s\n", this.pere.pere.prenom);
        System.out.printf("Nom prenom mere :\t %s %s\n", this.mere.prenom,this.mere.nom);
        System.out.printf("Numero telephone du pére :\t%s\n", this.pere.numeroTelephone);
        System.out.printf("Date du naissance :\t%s\n", this.dateNaissance);
        System.out.print("Adresse : ");
        this.adresse.show();
        System.out.print("Image profil :\t");
        this.imageProfil.show();
    }

    public void ajouterActivite(Activite activite){
    }

    public void setClasse(Classe classe){
        // modifier et ajouter
        this.classe = classe;
    }

    public void facture(){
        /*
         * frais mensuel d'inscription au activités selon niveau scolaire selon les activités suivies
         */
        float total = 750.5f;

        // recherche sur les activité
        System.out.println("************ Facture ************");
        System.out.printf("\nNom et Prenom : %s %s \n", this.nom, this.prenom);

        System.out.printf(" %s : %s",this.classe.nom, this.classe.fraisInscription);

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
