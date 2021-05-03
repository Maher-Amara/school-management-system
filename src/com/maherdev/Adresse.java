package com.maherdev;

public class Adresse {
    protected int numeroRue;
    protected String rue;
    protected String ville;
    protected int codePostal;
    protected String gouvernorat;

    public Adresse(int numeroRue, String rue, String ville, int codePostal, String gouvernorat){
        this.numeroRue = numeroRue;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.gouvernorat = gouvernorat;
    }
    public void update(int numeroRue, String rue, String ville, int codePostal, String gouvernorat){
        this.numeroRue = numeroRue;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.gouvernorat = gouvernorat;
    }
    public void show(){
        System.out.printf(
                "%s, rue %s %s %s, %s%n",
                this.numeroRue, this.rue, this.codePostal, this.ville, this.gouvernorat
        );
    }
}
