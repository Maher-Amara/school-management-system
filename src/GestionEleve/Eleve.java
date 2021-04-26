package GestionEleve;

public class Eleve {
	public int mat;
	public String nom,prenom,prenomp,prenomgp,nomm,prenomm,niveau;
	public int cinp,telp;
	public Date dn;
	public Adresse adresse;
	
	
	
	
	
	public Eleve(int mat, String nom, String prenom, String prenomp, String prenomgp, String nomm, String prenomm,
			String niveau, int cinp, int telp, Date dn, Adresse adresse) {
		super();
		this.mat = mat;
		this.nom = nom;
		this.prenom = prenom;
		this.prenomp = prenomp;
		this.prenomgp = prenomgp;
		this.nomm = nomm;
		this.prenomm = prenomm;
		this.niveau = niveau;
		this.cinp = cinp;
		this.telp = telp;
		this.dn = dn;
		this.adresse = adresse;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
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
	public String getPrenomp() {
		return prenomp;
	}
	public void setPrenomp(String prenomp) {
		this.prenomp = prenomp;
	}
	public String getPrenomgp() {
		return prenomgp;
	}
	public void setPrenomgp(String prenomgp) {
		this.prenomgp = prenomgp;
	}
	public String getNomm() {
		return nomm;
	}
	public void setNomm(String nomm) {
		this.nomm = nomm;
	}
	public String getPrenomm() {
		return prenomm;
	}
	public void setPrenomm(String prenomm) {
		this.prenomm = prenomm;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public int getCinp() {
		return cinp;
	}
	public void setCinp(int cinp) {
		this.cinp = cinp;
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
	

}
