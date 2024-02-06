package com.ufc.entite;

import com.ufc.interfaces.Epluchable;

public  class Aubergine extends Legume implements Epluchable
{

	public Aubergine(String nom, String couleur) {
		super(nom, couleur);
		// TODO Auto-generated constructor stub
	}

	public  void avoirGout() {
		System.out.println("un gout herbacé");
	}

	@Override
	public boolean Eplucher(boolean estEpluche) {
		// TODO Auto-generated method stub
		return estEpluche;
	}

	@Override
	public String commentEplucher(String outil) {
		return outil;
		
	}

}
