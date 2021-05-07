package com.maherdev;

public class ImageProfil {
    protected String filePath;

    public ImageProfil(String filePath){
        this.filePath = filePath;
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
