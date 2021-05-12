package com.maherdev;

import java.util.Scanner;

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
    public Adresse(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.println("donner numero de rue :");
                this.numeroRue = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le numero de rue doit etre entier");
            }
        }

        System.out.println("donner rue :");
        this.rue = scanner.nextLine();

        System.out.println("donner ville :");
        this.ville = scanner.nextLine();

        while (true){
            try {
                System.out.println("donner code postal :");
                this.codePostal = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le code postal doit etre entier");
            }
        }

        System.out.println("donner gouvernorat :");
        this.gouvernorat = scanner.nextLine();

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
                "Adress: %s, rue %s %s %s, %s%n",
                this.numeroRue, this.rue, this.codePostal, this.ville, this.gouvernorat
        );
    }
}
