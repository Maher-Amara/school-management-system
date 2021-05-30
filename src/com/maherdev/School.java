package com.maherdev;


import java.util.Date;
import java.util.Scanner;

public class School {
    private int nombreClasseMax = 50;
    private int nombreElevesMax = 1000;
    private int nombreActiviteMax = 100;
    private int nombreAnimateurMax = 100;
    private Classe[] listeClasses = new Classe[nombreClasseMax];
    private Eleve[] listeEleves = new Eleve[nombreElevesMax];
    private Activite[] listeActivites = new Activite[nombreActiviteMax];
    private Animateur[] listeAnimateurs = new Animateur[nombreAnimateurMax];

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

        listeActivites[0] = new Activite(
                123458,
                listeAnimateurs[0],
                "Formation photoshop",
                123.4f
        );
        listeActivites[1] = new Activite(
                123458,
                listeAnimateurs[0],
                "Formation JavaEE",
                600f
        );
        listeActivites[2] = new Activite(
                123458,
                listeAnimateurs[0],
                "Formation Python Data Science",
                450f
        );
        listeEleves[0] = new Eleve(
                "maher",
                "amara",
                new Adresse(34,"Houssine Bou Zayene","Kalaa Sghira", 4021, "Sousse"),
                new Date("03/10/1997"),
                new ImageProfil("assets/imageProfil.png"),
                new Person(1234678,
                        "amara",
                        "med naceur",
                        26254253,
                        new Person("Amara","youssef")
                ),
                new Person("jannette","guith")
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
        * pour eviter la recherche et par conséquence economiser les ressources
        *
        */
        System.out.println("donner nom animaterur :");
        String nom = Person.nom();

        System.out.println("donner prenom animaterur :");
        String prenom = Person.nom();

        System.out.println("donner numero cin animaterur :");
        int cin = Person.cin();

        System.out.println("donner numero telephone animaterur :");
        int numeroTelephone = Person.tel();

        System.out.println("donner date naissance animaterur (JJ/MM/YYYY):");
        Date dateNaissance = Person.date();

        System.out.println("donner prenom du pere:");
        String prenomPere = Person.nom();
        Person pere = new Person(nom,prenomPere); // create Person

        Adresse adresse = new Adresse(); // create Adresse from user input
        ImageProfil imageProfil = new ImageProfil(); // create get image from user input

        // creation de l'instance animateur
        Animateur animateur = new Animateur(cin, nom, prenom, numeroTelephone, dateNaissance, adresse, imageProfil, pere);

        // ajouter animateur a la liste des animateurs
        if (animateur.id == this.nombreAnimateurMax){
            System.out.println("Nombre maximal des animateurs atteint");
        }else{
            this.listeAnimateurs[animateur.id] = animateur;
            System.out.printf("Animateur %s %s ajouter avec success ID: %s \n",animateur.nom,animateur.prenom,animateur.id);
        }
    }
    public boolean showAnimateur(int idAnimateur) {
        /*
         * 1) recuperer l'animateur de la liste des animateurs
         * 2) afficher animateur
         * 3) retourne si l'istance cherchée est trouvée ou non
         * NOTE : id animateur correspond a sa position dans la liste
         * pour eviter la recherche et par conséquence economiser les ressources
         */

        // check if object exists
        if (idAnimateur >= nombreAnimateurMax){
            return false;
        }
        Animateur animateur = this.listeAnimateurs[idAnimateur];
        if (animateur == null) {
            // Istance pas existante
            return false;
        }else{
            // Istanse trouvée -> afficher animateur
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

        // check if object exists
        if (idAnimateur >= nombreAnimateurMax){
            return false;
        }
        Animateur animateur = listeAnimateurs[idAnimateur];
        if (animateur == null){
            return false;
        }
        else {
            System.out.println("donner nom animaterur :");
            String nom = Person.nom();

            System.out.println("donner prenom animaterur :");
            String prenom = Person.nom();

            System.out.println("donner numero cin animaterur :");
            int cin = Person.cin();

            System.out.println("donner numero telephone animaterur :");
            int numeroTelephone = Person.tel();

            System.out.println("donner date naissance animaterur (JJ/MM/YYYY):");
            Date dateNaissance = Person.date();

            System.out.println("donner prenom du pere:");
            String prenomPere = Person.nom();
            Person pere = new Person(nom, prenomPere);

            Adresse adresse = new Adresse(); // create Adresse from user input

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
        if (idAnimateur >= nombreAnimateurMax){
            return false;
        }
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
            if(animateur != null){
                System.out.printf("%s - %s %s \n",animateur.id,animateur.nom,animateur.prenom);
            }
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
         * pour eviter la recherche et par conséquence economiser les ressources
         */

        System.out.println("donner nom eleve :");
        String nom = Person.nom();

        System.out.println("donner prenom eleve :");
        String prenom = Person.nom();

        System.out.println("donner prenom du pere :");
        String prenomPere = Person.nom();

        System.out.println("donner prenom du grand-pere :");
        String prenomGrandPere = Person.nom();

        System.out.println("donner nom du mere :");
        String nomMere = Person.nom();

        System.out.println("donner prenom du mere :");
        String prenomMere = Person.nom();

        System.out.println("donner numero cin du pere :");
        int cin = Person.cin();

        System.out.println("donner numero telephone du pere :");
        int numeroTelephone = Person.tel();

        System.out.println("donner date naissance eleve (JJ/MM/YYYY):");
        Date dateNaissance = Person.date();

        Person mere = new Person(nomMere,prenomMere);
        Person gradPere = new Person(nom,prenomGrandPere);

        Person pere = new Person(cin,nom, prenomPere, numeroTelephone, gradPere);

        Adresse adresse = new Adresse(); // create Adresse from user input

        ImageProfil imageProfil = new ImageProfil(); // create get image from user input

        // creation de l'instance eleve
        Eleve eleve = new Eleve(nom, prenom,adresse, dateNaissance, imageProfil,pere, mere);

        // ajouter eleve a la liste des eleves
        if (eleve.id >= this.nombreElevesMax){
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

        // check if object exists
        if (idEleve >= this.nombreElevesMax){
            return false;
        }
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


        Eleve eleve = listeEleves[idEleve];

        // check if object exists
        if (idEleve >= this.nombreElevesMax){
            return false;
        }
        if (eleve == null){
            return false;
        }else {
            System.out.println("donner nom eleve :");
            String nom = Person.nom();

            System.out.println("donner prenom eleve :");
            String prenom = Person.nom();

            System.out.println("donner prenom du pere :");
            String prenomPere = Person.nom();

            System.out.println("donner prenom du grand-pere :");
            String prenomGrandPere = Person.nom();

            System.out.println("donner nom du mere :");
            String nomMere = Person.nom();

            System.out.println("donner prenom du mere :");
            String prenomMere = Person.nom();

            System.out.println("donner numero cin du pere :");
            int cin = Person.cin();

            System.out.println("donner numero telephone du pere :");
            int numeroTelephone = Person.tel();

            System.out.println("donner date naissance eleve (JJ/MM/YYYY):");
            Date dateNaissance = Person.date();

            Person mere = new Person(nomMere,prenomMere);
            Person gradPere = new Person(nom,prenomGrandPere);

            Person pere = new Person(cin,nom, prenomPere, numeroTelephone, gradPere);

            Adresse adresse = new Adresse(); // create Adresse from user input

            ImageProfil imageProfil = new ImageProfil(); // create get image from user input

            // creation de l'instance eleve
            eleve.update(nom, prenom,adresse, dateNaissance, imageProfil,pere, mere);

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
        if (this.listeEleves[idEleve] == null){
            return false;
        }else{
            // replace the object with null
            // Note: JVM garbage collector will delete it from ram automatically once we delete it's access point
            // voir : https://www.jmdoudoux.fr/java/dej/chap-gestion_memoire.htm#gestion_memoire-1
            this.listeEleves[idEleve] = null;
            return true;
        }
    }
    public void showElevelist() {
        System.out.println("Liste  Eleves :\n");
        for (Eleve eleve:this.listeEleves) {
            if(eleve != null)
                System.out.printf("%s - %s %s \n",eleve.id,eleve.nom,eleve.prenom);
            }
        System.out.println("");
    }

    public void addEleveClasse(int idEleve,int idClasse) {
        // recuperer eleve
        Eleve eleve = this.listeEleves[idEleve];

        // check if object exists
        if (eleve == null){
            System.out.println("eleve Introuvable");
        }else if(this.listeClasses[idClasse] == null){
            System.out.println("Classe Introuvable");
        }else{
            eleve.setClasse(idClasse);
            System.out.println("Eleve assigne au classe avec success");
        }
    }

    public void addEleveActivite(int idEleve, int idActivite) {
        //recuperer eleve
        Eleve eleve = this.listeEleves[idEleve];

        if(eleve == null){ // tester si l'eleve existe
            System.out.printf("L'eleve d'ID : %s est introuvable",idEleve);
        }else if(this.listeActivites[idActivite] == null){ //tester si l'activité existe
            System.out.printf("L'activite d'ID : %s introuvable",idActivite);
        }else{
            // ajouter activité eleve
            if(eleve.ajouterActivite(idActivite)){
                System.out.printf("l'eleve %s est inscri a cette activité avec success",idEleve);
            }else{
                System.out.printf("l'eleve %s est deja inscri a l'activité %s", idEleve, idActivite);
            }
        }
    }
    public void deleteEleveActivite(int idEleve, int idActivite){
        //recuperer eleve
        Eleve eleve = this.listeEleves[idEleve];

        if(eleve == null){ // tester si l'eleve existe
            System.out.printf("L'eleve d'ID : %s est introuvable",idEleve);
        }else if(this.listeActivites[idActivite] == null){ //tester si l'activité existe
            System.out.printf("L'activite d'ID : %s introuvable",idActivite);
        }else{
            // ajouter activité eleve
            if(eleve.deleteActivite(idActivite)){
                System.out.printf("L'activité %s de l'eleve %s est suprimé avec success",idEleve);
            }else{
                System.out.printf("Erreur : l'eleve %s n'est pas deja inscri a l'activité %s", idEleve, idActivite);
            }
        }
    }
    public void showEleveActivite(int idEleve){
        // recuperer eleve
        Eleve eleve = listeEleves[idEleve];

        // tester si l'eleve existe
        if ( eleve == null){
            System.out.printf("l'eleve d'id : %s n'est pas existent", idEleve);
        }else{
            // tester si la liste des activité de l'eleve est vide ou pas
            if(eleve.listeActivites.isEmpty()){
                System.out.printf("L'eleve d'id: %s n'est pas inscri a aucune activité. ",eleve.id);
            }else{
                // afficher tous les activité de la liste activité
                for(int activiteID:eleve.listeActivites){
                    this.listeActivites[activiteID].show();
                }
            }
        }
    }
    public void factureEleve(int idEleve) {
        //recuperation de l'eleve
        Eleve eleve = listeEleves[idEleve];

        // tester si l'eleve existe
        if (eleve == null){
            System.out.printf("l'eleve d'id : %s n'est pas existent", idEleve);
        }else{
            //facturer eleve
            this.factureEleve(eleve);
        }
    }
    private void factureEleve(Eleve eleve){
        /*
         * frais mensuel d'inscription au activités selon niveau scolaire selon les activités suivies
         */
        float total = 0f;

        // recherche sur les activité
        System.out.println("************ Facture ************");
        System.out.printf("\nNom et Prenom : %s %s \n", eleve.nom, eleve.prenom);

        // recuperer la classe de l'eleve
        Classe classe = this.listeClasses[eleve.idClasse];

        try {
            total += classe.fraisInscription; // compter les frais d'inscription de classe
            System.out.printf("Classe %s : %s", classe.nom, classe.fraisInscription);
        } catch (Exception ignore) {}
        System.out.println("\n activités :");
        System.out.println("--------------------------------------");
        for(int idActivite:eleve.listeActivites){
            Activite activite = this.listeActivites[idActivite];

            total += activite.fraisInscription; // compter les frais d'inscription d' activité'

            System.out.printf("activite %s : %s DT \n",activite.designation,activite.fraisInscription);
        }
        System.out.println("--------------------------------------");
        System.out.printf("Total : %s DT",total);

    }

    // Gestion classes
    public void addClass() {
        /*
         * 1) recuperer les donnes de l'Eleve
         * 2) creation d'un objet Eleve
         * 3) ajout de l'Eleve a la liste des Eleves
         *
         * NOTE : id Eleve correspond a sa position dans la liste
         * pour eviter la recherche et par conséquence economiser les ressources
         */
        int cin;
        String nom;
        String prenom;
        int numeroTelephone;
        Date dateNaissance;
        Adresse adresse;
        Scanner scanner = new Scanner(System.in);


        System.out.println("donner nom eleve :");
        nom = Person.nom();

        System.out.println("donner prenom eleve :");
        prenom = Person.nom();

        System.out.println("donner prenom du pere :");
        String prenomPere = Person.nom();

        System.out.println("donner prenom du grand-pere :");
        String prenomGrandPere = Person.nom();

        System.out.println("donner nom du mere :");
        String nomMere = Person.nom();

        System.out.println("donner prenom du mere :");
        String prenomMere = Person.nom();

        System.out.println("donner numero CIN du pere :");
        cin = Person.cin();

        while (true){
            try {
                System.out.println("donner numero telephone du pere :");

                int input = Integer.parseInt(scanner.nextLine());
                if (input < 10000000 || input > 99999999){
                    System.out.print("Error: numero telephone doit avoir 8 chiffres !");
                }else {
                    numeroTelephone = input;
                    break;
                }
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
        System.out.println("Liste Activites :\n");
        for (Activite activite:this.listeActivites) {
            try{
                System.out.printf("%s - %s\n",activite.id,activite.designation);
            }catch (Exception ignored){}
        }
        System.out.println("");
    }
}
