package com.ufc.entite;

public abstract class Fruit {
	// attributs d'instances
	public String nom;
	protected String couleur;
	private boolean isOgm;


	
	// Constructeurs (vide et avec paramètres)
	
	public Fruit(String nom, String couleur) {
		
		this.nom = nom;
		this.couleur = couleur;
	}

   // getter et setter -------------------------------

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
	
	
	// méthodes ---------------------------------------
	
	public abstract void avoirGout();
   // méthode pour décrire mes objets instaciés 
	@Override
	public String toString() {
		return "Fruit [nom=" + nom + ", couleur=" + couleur + "]";
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
	

}
