package com.marvin.java.option.liste;

import com.marvin.java.option.Option;

public class GPS implements Option {
	
	double prix = 113.5d;
	
	//Méthode permettant de retourner uniquement le prix.
	public double getPrix(){
		
		return prix;
	}
	
	//Méthode permettant d'afficher l'option avec son prix.
	public String formatPrix(){
		StringBuilder str = new StringBuilder();
		str.append("GPS ");
		str.append("("+prix+"€)");
		return str.toString();
	}
		
}
