package GestionActivite;

import GestionAnimateur.Animateur;

public class Cours {
	
	public int code;
	public String desg;
	public Animateur animres;
	
	
	public Cours(int code, String desg, Animateur animres) {
		super();
		this.code = code;
		this.desg = desg;
		this.animres = animres;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getDesg() {
		return desg;
	}


	public void setDesg(String desg) {
		this.desg = desg;
	}


	public Animateur getAnimres() {
		return animres;
	}


	public void setAnimres(Animateur animres) {
		this.animres = animres;
	}
	
	

}
