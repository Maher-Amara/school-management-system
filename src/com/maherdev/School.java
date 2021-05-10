package com.maherdev;

import jdk.jshell.spi.ExecutionControlProvider;

import java.util.Date;
import java.util.Scanner;

public class School {
    int nombreClasseMax = 50;
    int nombreElevesMax = 1000;
    int nombreActiviteMax = 100;
    int nombreAnimateurMax = 100;
    Classe[] listeClasses = new Classe[nombreClasseMax];
    Eleve[] listeEleves = new Eleve[nombreElevesMax];
    Activite[] listeActivites = new Activite[nombreActiviteMax];
    Animateur[] listeAnimateurs = new Animateur[nombreAnimateurMax];

    public School(){

    }

    public void ajouterEleve(){

    }
    public void ajouterEleveClasse(){

    }
    public void ajouterEleveActivite(){

    }
    public void updateEleve(){

    }
    public void updateEleveClasse(){

    }
    public void updateEleveActivite(){

    }

    public void addAnimateur() {
        /*
        * 1) recuperer les donnes de l'animateur
        * 2) creation d'un objet animateur
        * 3) ajout de l'animateur a la liste des animateurs
        *
        * NOTE : id animateur correspond a sa position dans la liste
        * pour eviter la recherche et par quansequance economiser les ressources
        *
        */
        int cin;
        String nom;
        String prenom;
        int numeroTelephone;
        Date dateNaissance;
        Adresse adresse;
        Scanner scanner = new Scanner(System.in);


        System.out.println("donner nom animaterur :");
        nom = scanner.nextLine();

        System.out.println("donner prenom animaterur :");
        prenom = scanner.nextLine();

        while (true){
            try {
                System.out.println("donner numero cin animaterur :");
                cin = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le numero cin doit etre entier");
            }
        }

        while (true){
            try {
                System.out.println("donner numero telephone animaterur :");
                numeroTelephone = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le numero de thelephone doit etre entier");
            }
        }

        while (true){
            try {
                System.out.println("donner date naissance animaterur (JJ/MM/YYYY):");
                String stringDate = scanner.nextLine();
                dateNaissance = new Date(stringDate);
                break;
            } catch (Exception e){
                System.out.println("Error: format non compatible");
            }
        }

        System.out.println("donner prenom du pere:");
        String prenomPere = scanner.nextLine();
        Person pere = new Person(nom,prenomPere);

        adresse = new Adresse(); // create Adresse from user input

        ImageProfil imageProfil = new ImageProfil(); // create get image from user input


        // creation de l'instance animateur
        Animateur animateur = new Animateur(cin, nom, prenom, numeroTelephone, dateNaissance, adresse, imageProfil, pere);

        // ajouter animateur a la liste des animateurs
        if (animateur.id == this.nombreAnimateurMax){
            System.out.println("nombre maximal des animateurs atteint");
        }else{
            this.listeAnimateurs[animateur.id] = animateur;
            System.out.printf("Animateur %s %s ajouter avec success ID: %s \n",animateur.nom,animateur.prenom,animateur.id);
        }

    }

    public void updateAnimateur(int idAnimateur) {
        /*
        * 1) recuperer les donnes de l'animateur
        * 2) creation d'un objet animateur
        * 3) ajout de l'animateur a la liste des animateurs
        *
        * NOTE : id animateur correspond a sa position dans la liste
        * pour eviter la recherche et par quansequance economiser les ressources
        *
        */
        int cin;
        String nom;
        String prenom;
        int numeroTelephone;
        Date dateNaissance;
        Adresse adresse;
        Scanner scanner = new Scanner(System.in);


        System.out.println("donner nom animaterur :");
        nom = scanner.nextLine();

        System.out.println("donner prenom animaterur :");
        prenom = scanner.nextLine();

        while (true){
            try {
                System.out.println("donner numero cin animaterur :");
                cin = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le numero cin doit etre entier");
            }
        }

        while (true){
            try {
                System.out.println("donner numero telephone animaterur :");
                numeroTelephone = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le numero de thelephone doit etre entier");
            }
        }

        while (true){
            try {
                System.out.println("donner date naissance animaterur (JJ/MM/YYYY):");
                String stringDate = scanner.nextLine();
                dateNaissance = new Date(stringDate);
                break;
            } catch (Exception e){
                System.out.println("Error: format non compatible");
            }
        }

        System.out.println("donner prenom du pere:");
        String prenomPere = scanner.nextLine();
        Person pere = new Person(nom,prenomPere);

        adresse = new Adresse(); // create Adresse from user input

        ImageProfil imageProfil = new ImageProfil(); // create get image from user input


        // mise a jours animateur
        Animateur animateur = listeAnimateurs[idAnimateur];

        animateur.update(cin, nom, prenom, numeroTelephone, dateNaissance, adresse, imageProfil, pere);

    }

    public boolean deleteAnimateur(int idAnimateur) {
        // check if object exists
        if (this.listeAnimateurs[idAnimateur] == null){
            return false;
        }else{
            // replace the object with null
            // Note: JVM garbage collector will delete it from ram automatically once we delete it's access point
            // voir : https://www.jmdoudoux.fr/java/dej/chap-gestion_memoire.htm#gestion_memoire-1
            this.listeAnimateurs[idAnimateur] = null;
            return true;
        }
    }

    public void showAnimateurlist() {
        System.out.println("Liste  Animateurs :\n");
        System.out.println("ID - nom prenom");
        for (Animateur animateur:this.listeAnimateurs) {
            try{
                System.out.printf("%s - %s %s \n",animateur.id,animateur.nom,animateur.prenom);
            }catch (Exception ignored){}
        }
        System.out.println("");

    }
}
