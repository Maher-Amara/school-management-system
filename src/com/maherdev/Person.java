package com.maherdev;

import java.util.Date;

public class Person {
    protected static int count = 0; // conteur
    protected int id;
    protected int cin;
    protected String nom;
    protected String prenom;
    protected Person pere;
    protected Person mere;
    protected int numeroTelephone;
    protected Adresse adresse;
    protected ImageProfil imageProfil;
    protected Date dateNaissance;


    public Person(String nom,String prenom){
        // this is a student grand father or mother or animateur father
        this.id = ++count;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Person(int cin, String nom, String prenom, int numeroTelephone, Person pere){
        // this is a student father
        this.id = ++count;
        this.nom = nom;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.pere = pere;
    }

    public Person(String nom, String prenom, Adresse adresse, Date dateNaissance, ImageProfil imageProfil, Person mere, Person pere){
        // this is a student
        this.id = ++count;
        this.nom = nom;
        this.nom = nom;
        this.prenom = prenom;
        this.imageProfil = imageProfil;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.pere = pere;
        this.mere = mere;
    }

    public Person(int cin, String nom, String prenom, int numeroTelephone, Date dateNaissance, Adresse adresse, ImageProfil imageProfil, Person pere){
        // this is a student father
        this.id = ++count;
        this.nom = nom;
        this.cin = cin;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.imageProfil = imageProfil;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.pere = pere;
    }

    public void update(String nom,String prenom){
        // this is a student grand father or mother or animateur father
        this.nom = nom;
        this.prenom = prenom;
    }

    public void update(int cin, String nom, String prenom, int numeroTelephone, Person pere){
        // this is a student father
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.pere = pere;
    }

    public void update(String nom, String prenom, Adresse adresse, Date dateNaissance, ImageProfil imageProfil, Person mere, Person pere){
        // this is a student
        this.nom = nom;
        this.prenom = prenom;
        this.imageProfil = imageProfil;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.pere = pere;
        this.mere = mere;
    }

    public void update(int cin, String nom, String prenom, int numeroTelephone, Date dateNaissance, Adresse adresse, ImageProfil imageProfil, Person pere){
        // this is a student father
        this.cin = cin;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.imageProfil = imageProfil;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.pere = pere;
    }
}
