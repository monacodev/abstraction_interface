package com.ufc.entite;

import com.ufc.interfaces.Epluchable;

public class Orange extends Fruit implements Epluchable {
	
	private String aspectEcorce;


	public Orange(String nom, String couleur, String aspectEcorce) {
		super(nom, couleur);
		this.aspectEcorce = aspectEcorce;
	}

    // GETTER SETTER 
	public String getAspectEcorce() {
		return aspectEcorce;
	}


	public void setAspectEcorce(String aspectEcorce) {
		this.aspectEcorce = aspectEcorce;
	}




	@Override
	public void avoirGout() {
		System.out.println("c'est acide et sucré à la fois");
		
	}




	@Override
	public String toString() {
		return "Orange [aspectEcorce= " + aspectEcorce + super.toString() + "]";
	}
    // estEpluche = true veut est épluché  
	@Override
	public boolean Eplucher(boolean estEpluche) {
		// TODO Auto-generated method stub
		return estEpluche;
	}

	@Override
	public String commentEplucher(String outil) {
		// TODO Auto-generated method stub
		return outil;
	}


    
	
	

}
