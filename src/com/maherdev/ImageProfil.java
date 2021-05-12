package com.maherdev;

import java.util.Scanner;

public class ImageProfil {
    /*
    * this is preaty usless at this point but
    * if your want to do some file manipulation
    * your profile pic mangment code goes here
    */
    protected String filePath;

    public ImageProfil(String filePath){
        this.filePath = filePath;
    }
    public ImageProfil(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner le lien vers l'image profil :");
        this.filePath = scanner.nextLine();
    }

    private void update(String newFilePath){
        this.delete();
        this.filePath = newFilePath;
    }

    private void delete(){
    }

    void show(){
        System.out.printf("Image profil: %s \n",this.filePath);
    }
}
