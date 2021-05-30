package com.garderie;

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
    @Override
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

    @Override
    public void show(){
        System.out.printf("animateur ID: %s\n",this.id);
        super.show();
        System.out.printf("Prenom pere: %s\n",this.pere.prenom);
        System.out.printf("CIN: %s\n",this.cin);
        System.out.printf("Numero telephone: %s\n",this.numeroTelephone);
        System.out.printf("Date naissance: %s\n",this.dateNaissance);
        this.adresse.show();
        this.imageProfil.show();
    }
}
