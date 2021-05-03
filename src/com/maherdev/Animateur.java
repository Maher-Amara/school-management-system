package com.maherdev;

import java.util.Date;

public class Animateur extends Person{
    public Animateur(int cin, String nom, String prenom, int numeroTelephone, Date dateNaissance, Adresse adresse, ImageProfil imageProfil, Person pere) {
        super(cin, nom, prenom, numeroTelephone, dateNaissance, adresse, imageProfil, pere);
    }
}
