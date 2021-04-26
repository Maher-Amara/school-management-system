package GestionEleve;

public class Adresse {

	public int numero,codep;
	public String rue,ville,gouvenorat;
	
	
	public Adresse(int numero, int codep, String rue, String ville, String gouvenorat) {
		super();
		this.numero = numero;
		this.codep = codep;
		this.rue = rue;
		this.ville = ville;
		this.gouvenorat = gouvenorat;
	}


	public int getNumero() {
		return numero;
	}


	public int getCodep() {
		return codep;
	}


	public String getRue() {
		return rue;
	}


	public String getVille() {
		return ville;
	}


	public String getGouvenorat() {
		return gouvenorat;
	}
	
	
	
	
	
}
