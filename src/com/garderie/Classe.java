package com.garderie;

public class Classe {
    protected static int count = 0; // conteur
    protected int id;
    protected float fraisInscription;
    protected String nom;
    protected Animateur[] animateurs;


    public Classe(String nom, float fraisInscription){
        this.id = count++; // auto increment
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
