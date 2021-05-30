package com.maherdev;

import java.util.Date;
import java.util.Scanner;

public class Person {
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
        this.nom = nom;
        this.prenom = prenom;
    }

    public Person(int cin, String nom, String prenom, int numeroTelephone, Person pere){
        // this is a student father
        this.nom = nom;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.pere = pere;
    }

    public Person(String nom, String prenom, Adresse adresse, Date dateNaissance, ImageProfil imageProfil, Person pere, Person mere){
        // this is a student
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

    public void update(String nom, String prenom, Adresse adresse, Date dateNaissance, ImageProfil imageProfil, Person pere, Person mere){
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

    public void show(){
        System.out.printf("Nom: %s\n",this.nom);
        System.out.printf("Prenom: %s\n",this.prenom);
    }

    public static String nom(){
        /*
        * name input controle
        * required
        * more than 3 caracters
        * alphabetic
        * has at most one space
        */
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nom : ");
            String input = scanner.nextLine();
            if (input.equals("") || input.isEmpty()){
                System.out.println("ERROR : nom est requis");
            } else if(input.length() < 3){
                System.out.println("ERROR : nom doit contenir plus que 3 caracteres");
            }else if (!(input.matches("^[a-zA-Z]*$") || input.matches("^[a-zA-Z]* [a-zA-Z]*$"))){
                System.out.println("ERROR : nom doit contenir que des quaracteres alphabetiques");
            }else{
                // lower case
                return input.toLowerCase();
            }
        }
    }

    public static int cin(){
        /*
         * CIN input controle
         * required
         * 7 to 8 caracters
         * numeric
         */
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("CIN :");
            String input = scanner.nextLine();

            if (input.equals("") || input.isEmpty()){
                System.out.println("ERROR : CIN est requis");
            }else{
                try {
                    // trys to cast string to int
                    // if it raises an error that means it's not numerical
                    int cin = Integer.parseInt(input);
                    if (cin < 1000000){
                        System.out.print("Error: CIN doit avoir au moins 7 chiffres !");
                    }else if(cin > 99999999){
                        System.out.print("Error: CIN doit avoir au plus 8 chiffres !");
                    }else {
                        return cin;
                    }
                } catch (Exception e){
                    System.out.println("Error: le numero cin doit etre entier");
                }
            }
        }
    }

    public static int tel(){
        /*
         * Tel input controle
         * required
         * 8 caracters
         * numeric
         */
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Tel :");
            String input = scanner.nextLine();

            if (input.equals("") || input.isEmpty()){
                System.out.println("ERROR : Tel est requis");
            }else{
                try {
                    // trys to cast string to int
                    // if it raises an error that means it's not numerical
                    int tel = Integer.parseInt(input);
                    if (tel < 10000000 || tel > 99999999){
                        System.out.print("Error: Tel doit avoir 8 chiffres !");
                    }else {
                        return tel;
                    }
                } catch (Exception e){
                    System.out.println("Error: le numero du teliphone doit etre entier");
                }
            }
        }
    }

    public static Date date(){
        /*
         * date input controle
         * required
         * 7 to 8 caracters
         * format JJ/MM/YYYY
         */
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Date : ");
            try {
                String stringDate = scanner.nextLine();
                return(new Date(stringDate));
            } catch (Exception e){
                System.out.println("Error: format non compatible");
            }
        }
    }
}
