package com.maherdev;

import java.util.Date;

public class Eleve extends Person{
    protected String niveauScolaire;


    public Eleve(String nom, String prenom, Adresse adresse, Date dateNaissance, ImageProfil imageProfil,String niveauScolaire, Person mere, Person pere){
        super(nom, prenom, adresse, dateNaissance, imageProfil, mere, pere);
        this.niveauScolaire = niveauScolaire;
    }

    public void update(String nom, String prenom, Adresse adresse, Date dateNaissance, ImageProfil imageProfil,String niveauScolaire, Person mere, Person pere){
        super.update(nom, prenom, adresse, dateNaissance, imageProfil, mere, pere);
        this.niveauScolaire = niveauScolaire;
    }

    public void show(){
        System.out.printf("Nom : %s", this.nom);
        System.out.printf("Prénom : %s", this.prenom);
        System.out.printf("Prénom du pére : %s", this.pere.prenom);
        System.out.printf("Prénom du grand-père : %s", this.pere.pere.prenom);
        System.out.printf("Nom prenom mere : %s %s", this.mere.prenom,this.mere.nom);
        System.out.printf("DumeroTelephone du pére : %s", this.pere.numeroTelephone);
        System.out.printf("Date du naissance : %s", this.dateNaissance);
        this.adresse.show();
        this.imageProfil.show();
    }
}
