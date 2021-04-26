package GestionAnimateur;

import GestionEleve.Adresse;
import GestionEleve.Date;

public class Animateur {
	public int cin,telp;
	public Date dn;
	public Adresse adresse;
	public String nom,prenom;
	
	
	public Animateur(int cin, int telp, Date dn, Adresse adresse, String nom, String prenom) {
		super();
		this.cin = cin;
		this.telp = telp;
		this.dn = dn;
		this.adresse = adresse;
		this.nom = nom;
		this.prenom = prenom;
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public int getTelp() {
		return telp;
	}


	public void setTelp(int telp) {
		this.telp = telp;
	}


	public Date getDn() {
		return dn;
	}


	public void setDn(Date dn) {
		this.dn = dn;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

}
