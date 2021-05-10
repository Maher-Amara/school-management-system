package com.maherdev;

import java.util.Date;

public class Animateur extends Person{
    protected static int count = 0; // conteur
    protected int id;


    public Animateur(int cin,
                     String nom,
                     String prenom,
                     int numeroTelephone,
                     Date dateNaissance,
                     Adresse adresse,
                     ImageProfil imageProfil,
                     Person pere) {
        super(cin, nom, prenom, numeroTelephone, dateNaissance, adresse, imageProfil, pere);
        this.id = count++;
    }

    public void update(int cin,
                       String nom,
                       String prenom,
                       int numeroTelephone,
                       Date dateNaissance,
                       Adresse adresse,
                       ImageProfil imageProfil,
                       Person pere) {
        super.update(cin, nom, prenom, numeroTelephone, dateNaissance, adresse, imageProfil, pere);
    }

    public void show(){

    }
}
