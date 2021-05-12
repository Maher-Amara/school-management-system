package com.maherdev;

import java.util.Scanner;

public class Menu {
    School school;

    public Menu(){
        // initiation de l'ecole
        this.school = new School(1);
    }

    protected int getUserChoice(){
        int Choice;

        System.out.println("Entrer votre choix :");

        // read user input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // cast input String to int and returns error message if not possible
        try {
            Choice = Integer.parseInt(input);
        }catch(Exception e){
            System.out.println("ERREUR: seules les valeurs entier sont acceptées");
            Choice = -1;
        }
        return Choice;
    }

    protected void showMenuAnimateur(){
        System.out.println("************** Menu Gestion Animateur **************\n");
        System.out.println("1. Ajouter animateur");
        System.out.println("2. Afficher animateur");
        System.out.println("3. Mettre a jours animateur");
        System.out.println("4. Supprimer  animateur");
        System.out.println("5. Lister animateurs");
        System.out.println("0. Retour menu principal");
    }

    protected void animateur() {
        //variable declaration
        Scanner scanner = new Scanner(System.in);
        int id;
        int Choice;

        // afficer menu animateur
        this.showMenuAnimateur();

        // recuperer le choix de l'utilisateur
        Choice = this.getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                this.menuPrincipal();
                break;
            case 1:
                school.addAnimateur();
                break;
            case 2:
                System.out.print("donner ID animateur :");
                id = Integer.parseInt(scanner.nextLine());
                if (!(school.showAnimateur(id))){
                    System.out.printf("Error : Animateur id %s not found \n",id);
                }
                break;
            case 3:
                System.out.print("donner ID animateur :");
                id = Integer.parseInt(scanner.nextLine());
                if (school.updateAnimateur(id)){
                    System.out.printf("Animateur id %s mise a jours avec success\n",id);
                }else{
                    System.out.printf("Error : Animateur id %s not found \n",id);
                }
                break;
            case 4:
                System.out.print("donner ID animateur :");
                id = Integer.parseInt(scanner.nextLine());
                if (school.deleteAnimateur(id)){
                    System.out.printf("Animateur id %s suprimé avec success\n",id);
                }else{
                    System.out.printf("Error : Animateur id %s not found \n",id);
                }
                break;
            case 5:
                school.showAnimateurlist();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 5");
        }
    }

    protected void showMenuEleves(){
        System.out.println("************** Menu Gestion Elèves **************\n");
        System.out.println("1. Ajouter eleve");
        System.out.println("2. Mettre a jours eleve");
        System.out.println("3. Supprimer eleve");
        System.out.println("4. Lister eleves");
        System.out.println("0. Retour menu principal");
    }

    protected void eleves() {
        //variable declaration
        int Choice;

        // afficer menu eleves
        this.showMenuEleves();

        // recuperer le choix de l'utilisateur
        Choice = this.getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                this.menuPrincipal();
                break;
            case 1:
                this.showMenuAnimateur();
                break;
            case 2:
                this.showMenuEleves();
                break;
            case 3:
                this.showMenuClasses();
                break;
            case 4:
                this.showMenuCours();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 4");
        }
    }

    protected void showMenuClasses(){
        System.out.println("************** Menu Gestion Classes **************\n");
        System.out.println("1. Ajouter classe");
        System.out.println("2. Mettre a jours classe");
        System.out.println("3. Supprimer classe");
        System.out.println("4. Lister classes");
        System.out.println("0. Retour menu principal");
    }

    protected void classes() {
        //variable declaration
        int Choice;

        // afficer menu classes
        this.showMenuClasses();

        // recuperer le choix de l'utilisateur
        Choice = this.getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                this.menuPrincipal();
                break;
            case 1:
                this.showMenuAnimateur();
                break;
            case 2:
                this.showMenuEleves();
                break;
            case 3:
                this.showMenuClasses();
                break;
            case 4:
                this.showMenuCours();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 4");
        }
    }

    protected void showMenuCours(){
        System.out.println("************** Menu Gestion Cours **************\n");
        System.out.println("1. Ajouter cour");
        System.out.println("2. Mettre a jours cour");
        System.out.println("3. Supprimer cour");
        System.out.println("4. Lister cours");
        System.out.println("0. Retour menu principal");
    }

    protected void cours() {
        //variable declaration
        int Choice;

        // afficer menu cours
        this.showMenuCours();

        // recuperer le choix de l'utilisateur
        Choice = this.getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                this.menuPrincipal();
                break;
            case 1:
                this.showMenuAnimateur();
                break;
            case 2:
                this.showMenuEleves();
                break;
            case 3:
                this.showMenuClasses();
                break;
            case 4:
                this.showMenuCours();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 4");
        }
    }

    protected void exit(){
        //fermer le programme

        System.out.println("Good Bye");
        System.exit(0);
    }

    protected void showMenuPrincipal(){
        // afficher Menu Principal
        System.out.println("\n************** Menu Principal **************\n");
        System.out.println("1. Gestion Animateur ");
        System.out.println("2. Gestion Elèves ");
        System.out.println("3. Gestion Classes ");
        System.out.println("4. Gestion Cours");
        System.out.println("0. Exit");
    }

    protected void menuPrincipal(){
        //variable declaration
        int Choice;

        // afficer menu principal
        this.showMenuPrincipal();

        // recuperer le choix de l'utilisateur
        Choice = getUserChoice();

        // arbre de choix
        switch(Choice) {
            case 0:
                this.exit();
                break;
            case 1:
                this.animateur();
                break;
            case 2:
                this.eleves();
                break;
            case 3:
                this.classes();
                break;
            case 4:
                this.cours();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 4");
        }
    }

    public void mainLoop(){
        // boucler a l'infini
        while (true) {
            this.menuPrincipal();
        }
    }
}
