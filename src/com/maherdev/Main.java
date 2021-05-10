package com.maherdev;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.mainLoop();

        School school = new School();

        school.addAnimateur();
//        school.addAnimateur();
//
        school.showAnimateurlist();
//
        school.deleteAnimateur(0);

        school.showAnimateurlist();
    }

}