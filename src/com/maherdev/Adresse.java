package com.maherdev;

public class Adresse {
    private int numeroRue;
    private String rue;
    private String ville;
    private int codePostal;
    private String gouvernorat;

    public Adresse(int numeroRue, String rue, String ville, int codePostal, String gouvernorat){
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
