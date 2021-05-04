package com.maherdev;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainLoop();
    }
    
    public static void testEleve(){
        Adresse myAdress = new Adresse(34,"houssine bou zayen","kalaa sghira",4021,"sousse");
        ImageProfil imageProfil = new ImageProfil("C:\\Users\\Hp\\Desktop\\3 Info\\java project\\school-management-system\\profile-pic.jpg");
        Date dateNessance = new Date("03/10/1997");
        Person grandPere = new Person("Amara","youssef");
        Person pere = new Person(12836976,"Amara","mohamed naceur",97595451,grandPere);
        Person mere = new Person("guith","jannette");
        String niveuScolaire = "3 INFO";

        Eleve maher = new Eleve("Amara","maher", myAdress, dateNessance, imageProfil,"3 INFO", pere, mere);
        maher.show();
    }
}