package com.garderie;

import java.util.Date;
import java.util.ArrayList;

public class Eleve extends Person{
    protected static int count = 0; // conteur
    protected int id;

    protected int idClasse = -1;

    protected ArrayList<Integer> listeActivites = new ArrayList<Integer>();

    public Eleve(String nom,
                 String prenom,
                 Adresse adresse,
                 Date dateNaissance,
                 ImageProfil imageProfil,
                 Person pere,
                 Person mere){
        super(nom, prenom, adresse, dateNaissance, imageProfil, pere, mere);
        this.id = count++;
    }

    @Override
    public void update(String nom,
                       String prenom,
                       Adresse adresse,
                       Date dateNaissance,
                       ImageProfil imageProfil,
                       Person pere,
                       Person mere){
        super.update(nom, prenom, adresse, dateNaissance, imageProfil, mere, pere);
    }

    @Override
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

    public boolean ajouterActivite(int activiteID){
        // tester si l'eleve est inscri a cette activité
        if(listeActivites.contains(activiteID)){
            return false;
        }else{
            this.listeActivites.add(activiteID);
            return true;
        }
    }

    public boolean deleteActivite(int activiteID){
        // tester si l'eleve est inscri a cette activité
        if(listeActivites.contains(activiteID)){
            this.listeActivites.remove(activiteID);
            return true;
        }else{
            return false;
        }
    }

    public void setClasse(int idClasse){
        // modifier et ajouter
        this.idClasse = idClasse;
    }
}
