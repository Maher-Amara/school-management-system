package com.maherdev;

public class Main {

    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.mainLoop();
        Person personne1 = new Person("Asma","Gacem");
        Person personne2 = new Person("Maher","Amara");
        Person personne3 = new Person("Nesrine","Ncibi");

        System.out.println(personne1.id);
        System.out.println(personne2.id);
        System.out.println(personne3.id);
    }
}