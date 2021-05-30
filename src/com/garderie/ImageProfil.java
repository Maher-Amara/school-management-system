package com.garderie;

public class ImageProfil extends fileHandler {
    /*
    * this is preaty usless at this point but
    * if your want to do some file manipulation
    * your profile pic mangment code goes here
    */

    public ImageProfil(String filePath){
        super(filePath);
    }

    public ImageProfil(){
        super();
    }

    @Override
    public void update(String newFilePath){
        this.delete();
        this.filePath = newFilePath;
    }

    @Override
    public void delete(){
    }

    @Override
    public void show(){
        // afficher lien image
        System.out.printf("Image profil: %s \n",this.filePath);
    }
}
