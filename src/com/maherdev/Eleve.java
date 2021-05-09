package com.maherdev;

import java.util.Date;

public class Eleve extends Person{
    protected Classe classe;

    public Eleve(String nom, String prenom, Adresse adresse, Date dateNaissance, ImageProfil imageProfil,Classe classe, Person pere, Person mere){
        super(nom, prenom, adresse, dateNaissance, imageProfil, mere, pere);
        this.classe = classe;
    }

    public void update(String nom, String prenom, Adresse adresse, Date dateNaissance, ImageProfil imageProfil,Classe classe, Person mere, Person pere){
        super.update(nom, prenom, adresse, dateNaissance, imageProfil, mere, pere);
        this.classe = classe;
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

    public void facturer(){
        /*
        * facture mensuel a payer
        * sellon les activiter quil partisipe
        * et son niveau classe
        * */
    }
}
