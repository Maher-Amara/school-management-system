package com.maherdev;


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

    public School(int n){
        // this is a different constructer used mainly for debuging purpses
        // it's pre configured with fiew element to work with
        listeAnimateurs[0] = new Animateur(
                123456,
                "Amara",
                "Maher",
                26254253,
                new Date("03/10/1997"),
                new Adresse(34,"Houssine Bou Zayene","Kalaa Sghira", 4021, "Sousse"),
                new ImageProfil("assets/imageProfil.png"),
                new Person("Amara","Mohamed Naceur")
                );
        listeAnimateurs[1] = new Animateur(
                123457,
                "Amara",
                "Housseme",
                26254253,
                new Date("02/10/2000"),
                new Adresse(34,"Houssine Bou Zayene","Kalaa Sghira", 4021, "Sousse"),
                new ImageProfil("assets/imageProfil1.png"),
                new Person("Amara","Mohamed Naceur")
                );
        listeAnimateurs[2] = new Animateur(
                123458,
                "Amara",
                "Moez",
                26254253,
                new Date("03/10/1995"),
                new Adresse(34,"Houssine Bou Zayene","Kalaa Sghira", 4021, "Sousse"),
                new ImageProfil("assets/imageProfil2.png"),
                new Person("Amara","Mohamed Naceur")
                );
    }

    // Gestion animateur
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
        Person pere = new Person(nom,prenomPere); // create Person

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
    public boolean showAnimateur(int idAnimateur) {
        /*
         * 1) recuperer l'animateur de la liste des animateurs
         * 2) afficher animateur
         *
         * NOTE : id animateur correspond a sa position dans la liste
         * pour eviter la recherche et par conséquence economiser les ressources
         */
        Animateur animateur = this.listeAnimateurs[idAnimateur];
        if (animateur == null) {
            return false;
        }else{
            animateur.show();
            return true;
        }
    }
    public boolean updateAnimateur(int idAnimateur) {
        /*
        * 1) recuperer l'animateur de la liste des animateurs
        * 2) recuperer les donnes de l'animateur
        * 3) mise a jours de l'animateur
        *
        * NOTE : id animateur correspond a sa position dans la liste
        * pour eviter la recherche et par conséquence economiser les ressources
        */

        int cin;
        String nom;
        String prenom;
        int numeroTelephone;
        Date dateNaissance;
        Adresse adresse;
        Scanner scanner = new Scanner(System.in);

        Animateur animateur = listeAnimateurs[idAnimateur];

        // check if object exists
        if (animateur == null){
            return false;
        }else {
            System.out.println("donner nom animaterur :");
            nom = scanner.nextLine();

            System.out.println("donner prenom animaterur :");
            prenom = scanner.nextLine();

            while (true) {
                try {
                    System.out.println("donner numero cin animaterur :");
                    cin = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Error: le numero cin doit etre entier");
                }
            }

            while (true) {
                try {
                    System.out.println("donner numero telephone animaterur :");
                    numeroTelephone = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Error: le numero de thelephone doit etre entier");
                }
            }

            while (true) {
                try {
                    System.out.println("donner date naissance animaterur (JJ/MM/YYYY):");
                    String stringDate = scanner.nextLine();
                    dateNaissance = new Date(stringDate);
                    break;
                } catch (Exception e) {
                    System.out.println("Error: format non compatible");
                }
            }

            System.out.println("donner prenom du pere:");
            String prenomPere = scanner.nextLine();
            Person pere = new Person(nom, prenomPere);

            adresse = new Adresse(); // create Adresse from user input

            ImageProfil imageProfil = new ImageProfil(); // create get image from user input

            // mise a jours animateur
            animateur.update(cin, nom, prenom, numeroTelephone, dateNaissance, adresse, imageProfil, pere);
            return true;
        }
    }
    public boolean deleteAnimateur(int idAnimateur) {
        /*
         * 1) recuperer l'animateur de la liste des animateurs
         * 2) suprimer animateur
         *
         * NOTE : id animateur correspond a sa position dans la liste
         * pour eviter la recherche et par conséquence economiser les ressources
         */

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
        for (Animateur animateur:this.listeAnimateurs) {
            try{
                System.out.printf("%s - %s %s \n",animateur.id,animateur.nom,animateur.prenom);
            }catch (Exception ignored){}
        }
        System.out.println("");

    }

    // Gestion eleves
    public void addEleve() {
        /*
         * 1) recuperer les donnes de l'Eleve
         * 2) creation d'un objet Eleve
         * 3) ajout de l'Eleve a la liste des Eleves
         *
         * NOTE : id Eleve correspond a sa position dans la liste
         * pour eviter la recherche et par quansequance economiser les ressources
         */
        int cin;
        String nom;
        String prenom;
        int numeroTelephone;
        Date dateNaissance;
        Adresse adresse;
        Scanner scanner = new Scanner(System.in);


        System.out.println("donner nom eleve :");
        nom = scanner.nextLine();

        System.out.println("donner prenom eleve :");
        prenom = scanner.nextLine();

        System.out.println("donner prenom du pere :");
        String prenomPere = scanner.nextLine();

        System.out.println("donner prenom du grand-pere :");
        String prenomGrandPere = scanner.nextLine();

        System.out.println("donner nom du mere :");
        String nomMere = scanner.nextLine();

        System.out.println("donner prenom du mere :");
        String prenomMere = scanner.nextLine();

        while (true){
            try {
                System.out.println("donner numero cin du pere :");
                cin = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le numero cin doit etre entier");
            }
        }

        while (true){
            try {
                System.out.println("donner numero telephone du pere :");
                numeroTelephone = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le numero de thelephone doit etre entier");
            }
        }

        while (true){
            try {
                System.out.println("donner date naissance eleve (JJ/MM/YYYY):");
                String stringDate = scanner.nextLine();
                dateNaissance = new Date(stringDate);
                break;
            } catch (Exception e){
                System.out.println("Error: format non compatible");
            }
        }

        Person mere = new Person(nomMere,prenomMere);
        Person gradPere = new Person(nom,prenomGrandPere);
        Person pere = new Person(cin,nom, prenomPere, numeroTelephone, gradPere);
        adresse = new Adresse(); // create Adresse from user input
        ImageProfil imageProfil = new ImageProfil(); // create get image from user input


        // creation de l'instance animateur
        Eleve eleve = new Eleve(nom, prenom,adresse, dateNaissance, imageProfil,pere, mere);

        // ajouter animateur a la liste des animateurs
        if (eleve.id == this.nombreElevesMax){
            System.out.println("nombre maximal des Eleves atteint");
        }else{
            this.listeEleves[eleve.id] = eleve;
            System.out.printf("Eleve %s %s ajouter avec success ID: %s \n",eleve.nom,eleve.prenom,eleve.id);
        }
    }
    public boolean showEleve(int idEleve) {
        /*
         * 1) recuperer l'animateur de la liste des animateurs
         * 2) afficher animateur
         *
         * NOTE : id animateur correspond a sa position dans la liste
         * pour eviter la recherche et par conséquence economiser les ressources
         */
        Eleve eleve = this.listeEleves[idEleve];
        if (eleve == null) {
            return false;
        }else{
            eleve.show();
            return true;
        }
    }
    public boolean updateEleve(int idEleve) {
        /*
         * 1) recuperer l'animateur de la liste des animateurs
         * 2) recuperer les donnes de l'animateur
         * 3) mise a jours de l'animateur
         *
         * NOTE : id animateur correspond a sa position dans la liste
         * pour eviter la recherche et par conséquence economiser les ressources
         */

        int cin;
        String nom;
        String prenom;
        int numeroTelephone;
        Date dateNaissance;
        Adresse adresse;
        Scanner scanner = new Scanner(System.in);

        Animateur animateur = listeAnimateurs[idEleve];

        // check if object exists
        if (animateur == null){
            return false;
        }else {
            System.out.println("donner nom animaterur :");
            nom = scanner.nextLine();

            System.out.println("donner prenom animaterur :");
            prenom = scanner.nextLine();

            while (true) {
                try {
                    System.out.println("donner numero cin animaterur :");
                    cin = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Error: le numero cin doit etre entier");
                }
            }

            while (true) {
                try {
                    System.out.println("donner numero telephone animaterur :");
                    numeroTelephone = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Error: le numero de thelephone doit etre entier");
                }
            }

            while (true) {
                try {
                    System.out.println("donner date naissance animaterur (JJ/MM/YYYY):");
                    String stringDate = scanner.nextLine();
                    dateNaissance = new Date(stringDate);
                    break;
                } catch (Exception e) {
                    System.out.println("Error: format non compatible");
                }
            }

            System.out.println("donner prenom du pere:");
            String prenomPere = scanner.nextLine();
            Person pere = new Person(nom, prenomPere);

            adresse = new Adresse(); // create Adresse from user input

            ImageProfil imageProfil = new ImageProfil(); // create get image from user input

            // mise a jours animateur
            animateur.update(cin, nom, prenom, numeroTelephone, dateNaissance, adresse, imageProfil, pere);
            return true;
        }
    }
    public boolean deleteEleve(int idEleve) {
        /*
         * 1) recuperer l'animateur de la liste des animateurs
         * 2) suprimer animateur
         *
         * NOTE : id animateur correspond a sa position dans la liste
         * pour eviter la recherche et par conséquence economiser les ressources
         */

        // check if object exists
        if (this.listeAnimateurs[idEleve] == null){
            return false;
        }else{
            // replace the object with null
            // Note: JVM garbage collector will delete it from ram automatically once we delete it's access point
            // voir : https://www.jmdoudoux.fr/java/dej/chap-gestion_memoire.htm#gestion_memoire-1
            this.listeAnimateurs[idEleve] = null;
            return true;
        }
    }
    public void showElevelist() {
        System.out.println("Liste  Animateurs :\n");
        for (Animateur animateur:this.listeAnimateurs) {
            try{
                System.out.printf("%s - %s %s \n",animateur.id,animateur.nom,animateur.prenom);
            }catch (Exception ignored){}
        }
        System.out.println("");

    }
    public void addEleveClasse() {
    }
    public void addEleveActivite() {
    }
    public void factureEleve() {
    }

    // Gestion classes
    public void addClass() {
        /*
         * 1) recuperer les donnes de l'Eleve
         * 2) creation d'un objet Eleve
         * 3) ajout de l'Eleve a la liste des Eleves
         *
         * NOTE : id Eleve correspond a sa position dans la liste
         * pour eviter la recherche et par quansequance economiser les ressources
         */
        int cin;
        String nom;
        String prenom;
        int numeroTelephone;
        Date dateNaissance;
        Adresse adresse;
        Scanner scanner = new Scanner(System.in);


        System.out.println("donner nom eleve :");
        nom = scanner.nextLine();

        System.out.println("donner prenom eleve :");
        prenom = scanner.nextLine();

        System.out.println("donner prenom du pere :");
        String prenomPere = scanner.nextLine();

        System.out.println("donner prenom du grand-pere :");
        String prenomGrandPere = scanner.nextLine();

        System.out.println("donner nom du mere :");
        String nomMere = scanner.nextLine();

        System.out.println("donner prenom du mere :");
        String prenomMere = scanner.nextLine();

        while (true){
            try {
                System.out.println("donner numero cin du pere :");
                cin = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le numero cin doit etre entier");
            }
        }

        while (true){
            try {
                System.out.println("donner numero telephone du pere :");
                numeroTelephone = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error: le numero de thelephone doit etre entier");
            }
        }

        while (true){
            try {
                System.out.println("donner date naissance eleve (JJ/MM/YYYY):");
                String stringDate = scanner.nextLine();
                dateNaissance = new Date(stringDate);
                break;
            } catch (Exception e){
                System.out.println("Error: format non compatible");
            }
        }

        Person mere = new Person(nomMere,prenomMere);
        Person gradPere = new Person(nom,prenomGrandPere);
        Person pere = new Person(cin,nom, prenomPere, numeroTelephone, gradPere);
        adresse = new Adresse(); // create Adresse from user input
        ImageProfil imageProfil = new ImageProfil(); // create get image from user input


        // creation de l'instance animateur
        Eleve eleve = new Eleve(nom, prenom,adresse, dateNaissance, imageProfil,pere, mere);

        // ajouter animateur a la liste des animateurs
        if (eleve.id == this.nombreElevesMax){
            System.out.println("nombre maximal des Eleves atteint");
        }else{
            this.listeEleves[eleve.id] = eleve;
            System.out.printf("Eleve %s %s ajouter avec success ID: %s \n",eleve.nom,eleve.prenom,eleve.id);
        }
    }
    public boolean showClass(int idClass) {
        return false;
    }
    public boolean updateClass(int idClass) {
        return false;
    }
    public boolean deleteClass(int idClass) {
        return false;
    }
    public void showClasslist() {
        System.out.println("Liste Class :\n");
        for (Classe classe:this.listeClasses) {
            try{
                System.out.printf("%s - %s %s \n",classe.id,classe.nom);
            }catch (Exception ignored){}
        }
        System.out.println("");

    }

    // Gestion activite
    public void addActivite() {}
    public boolean showActivite(int idActivite) {
        return false;
    }
    public boolean updateActivite(int idActivite) {
        return false;
    }
    public boolean deleteActivite(int idActivite) {
        return false;
    }
    public void showActivitelist() {
        System.out.println("Liste Class :\n");
        for (Activite activite:this.listeActivites) {
            try{
                System.out.printf("%s - %s %s \n",activite.id,activite.designation);
            }catch (Exception ignored){}
        }
        System.out.println("");
    }
}
