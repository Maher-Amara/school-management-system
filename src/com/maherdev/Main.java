package com.maherdev;

import java.io.InputStream;
import java.util.*;

public class Main {

    protected static void showMenuAnimateur(){
        System.out.println("************** Menu Gestion Animateur **************\n");
    }

    protected static void showMenuEleves(){
        System.out.println("************** Menu Gestion Elèves **************\n");
    }

    protected static void showMenuClasses(){
        System.out.println("************** Menu Gestion Classes **************\n");
    }

    protected static void showMenuCours(){
        System.out.println("************** Menu Gestion Cours **************\n");
    }

    protected static void exit(){
        System.out.println("Good Bye");
        System.exit(0);
    }

    protected static void showMenuPrincipal(){
        // Menu Principal
        System.out.println("************** Menu Principal **************\n");
        System.out.println("1. Gestion Animateur ");
        System.out.println("2. Gestion Elèves ");
        System.out.println("3. Gestion Classes ");
        System.out.println("4. Gestion Cours");
        System.out.println("0. Exit");
        System.out.println("Entrer votre choix :");
    }
    public static void menuPrincipal() {
        //variable declaration
        int choix;

        // afficer menu principal
        showMenuPrincipal();

        // read user input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // cast input String to int and returns error message if not possible
        try {
            choix = Integer.parseInt(input);
        }catch(Exception e){
            System.out.println("ERREUR: seules les valeurs entier sont acceptées");
            choix = 6;
        }

        // arbre de choix
        switch(choix) {
            case 0:
                exit();
                break;
            case 1:
                showMenuAnimateur();
                break;
            case 2:
                showMenuEleves();
                break;
            case 3:
                showMenuClasses();
                break;
            case 4:
                showMenuCours();
                break;
            default:
                System.out.println("veiller entrer un numero entre 0 et 4");
        }
    }

    public static void main(String[] args) {
        // boucler a l'infini
        while (true) {
            menuPrincipal();
        }
    }
}
