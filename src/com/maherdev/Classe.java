package com.maherdev;

public class Classe {
    // protected int idClasse;
    protected float fraisInscription;
    protected String nom;
    protected Animateur[] animateurs;


    public Classe(String nom,float fraisInscription){
        this.nom = nom;
        this.fraisInscription = fraisInscription;
    }

    public void update(String nom,float fraisInscription){
        this.nom = nom;
        this.fraisInscription = fraisInscription;
    }

    public void update(float fraisInscription){
        this.fraisInscription = fraisInscription;
    }

    public void ajouterAnimateur(Animateur animateur){
        /* ajouter animateur un animateur au tableau des animateurs */
    }



}
