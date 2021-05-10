package com.maherdev;

import java.util.Scanner;

public class ImageProfil {
    protected String filePath;

    public ImageProfil(String filePath){
        this.filePath = filePath;
    }
    public ImageProfil(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner le lien vers l'image profil :");
        this.filePath = scanner.nextLine();
    }

    private void update(String filePath){
        this.filePath = filePath;
    }

    private void delete(String filePath){
    }

    void show(){
        System.out.println(this.filePath);
    }
}
