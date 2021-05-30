package com.garderie;

import java.util.Scanner;

public abstract class fileHandler {
    protected String filePath;

    public fileHandler(String filePath) {
        this.filePath = filePath;
    }

    public fileHandler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner le lien vers l'image profil :");
        this.filePath = scanner.nextLine();
    }

    public abstract void update(String newFilePath);

    public abstract void delete();

    public abstract void show();
}