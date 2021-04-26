package GestionClasse;

import GestionActivite.Cours;
import GestionEleve.Eleve;

public class Classe {

	public int numero;
	public String nom;
	Eleve [] List_E;
	Cours [] List_C;
	public Classe(int numero, String nom, Eleve[] list_E, Cours[] list_C) {
		super();
		this.numero = numero;
		this.nom = nom;
		List_E = list_E;
		List_C = list_C;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Eleve[] getList_E() {
		return List_E;
	}
	public void setList_E(Eleve[] list_E) {
		List_E = list_E;
	}
	public Cours[] getList_C() {
		return List_C;
	}
	public void setList_C(Cours[] list_C) {
		List_C = list_C;
	}
	
	
	
}
