package com.ufc.test;

import java.util.ArrayList;
import java.util.Vector;

import com.ufc.entite.Aubergine;
import com.ufc.entite.Legume;
import com.ufc.entite.Tomate;

public class TestLegume {

	public static void main(String[] args) {
		
		Aubergine aubergine = new Aubergine("Aubergine du texas","blanc tacheté");
        System.out.println(aubergine);
        
        boolean etatEpluch= aubergine.Eplucher(true);
        
        System.out.println(etatEpluch);
        
        Aubergine auberginette = new Aubergine("auberginette de Picardie","marron");
	    
        Tomate tomateCoeur = new Tomate("tomate coeur de boeuf","rouge"); 
        
       
        Legume [] legumes = new Legume[5];	
        
        legumes[0] = tomateCoeur;
        
        ArrayList<Legume> legumes1 = new ArrayList<>();
        
        legumes1.add(tomateCoeur);
        
        legumes1.add(auberginette);
        
        System.out.println("------------------------------------------------------");
        
        for (Legume legume : legumes1) {
			System.out.println(legume);
		}
        
        System.out.println("------------------------------------------------------");
        
        Vector<Legume> legumes2 = new Vector<>();
        
        legumes2.add(tomateCoeur);
        legumes2.add(aubergine);
        
        
        System.out.println(" la boucle de mon vecteur");
        for (Legume legume : legumes2) {
        	
        	System.out.println(legume);
			
		} 
        
	
	}

}
