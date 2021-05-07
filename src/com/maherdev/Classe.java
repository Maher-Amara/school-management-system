package com.maherdev;

public class Classe {
    protected int idClasse;
    protected String nom;
    protected Eleve[] eleves = new Eleve[40]; // composition
    protected int nambreEleves = 0;
    protected Activite[] activites;
    protected Animateur[] animateurs;


    public Classe(){
    }

    public void ajouterEleve(Eleve eleve){
        if (this.nambreEleves == 40){
            System.out.printf("laclasse %s est chagée",this.nom);
        }else if (testExistance(eleve)){
            System.out.printf("l'eleve %s est deja enregistré dans la classe %s",eleve.nom + " " + eleve.prenom,this.nom);
        }else{
            // ajouter eleve dans la sette classe
        }
    }

    public void afficherEleves(){
        for (Eleve eleve: this.eleves) {
            eleve.show();
        }
    }
    protected boolean testExistance(Eleve nouveauEleve){
        for (Eleve eleve:this.eleves){
            if (nouveauEleve.equals(eleve)){
                return true;
            }
        }
        return false;
    }

}
