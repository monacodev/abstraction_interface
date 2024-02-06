package com.ufc.entite;

public abstract class Legume {
	private String nom;
	private String couleur;
	//private boolean isOgm;
	
	
	public Legume(String nom, String couleur) {
		
		this.nom = nom;
		this.couleur = couleur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public abstract void avoirGout();


	@Override
	public String toString() {
		return "Legume [nom=" + nom + ", couleur=" + couleur + "]";
	}
	
	
	
	
	
	
	
	
	


}
