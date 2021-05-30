package com.garderie;

public class Activite {
    protected static int count = 0; // conteur
    protected int id;
    protected int code;
    protected Animateur animateur;
    protected String designation;
    protected float fraisInscription;

    public Activite(int code, Animateur animateur, String designation, float fraisInscription){
        this.id = count++; // auto increment
        this.code = code;
        this.animateur = animateur;
        this.designation = designation;
        this.fraisInscription = fraisInscription;
    }

    public void update(int code, Animateur animateur, String designation, float fraisInscription){
        this.code = code;
        this.animateur = animateur;
        this.designation = designation;
        this.fraisInscription = fraisInscription;
    }

    public void show(){
        System.out.printf("designation : %s\n", this.designation);
        System.out.printf("code activite : %s\n", this.code);
        System.out.printf("animateur : %s\n", this.animateur);
        System.out.printf("fraisInscription : %s\n", this.fraisInscription);
    }
}
