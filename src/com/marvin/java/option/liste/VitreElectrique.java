package com.marvin.java.option.liste;

import com.marvin.java.option.Option;

public class VitreElectrique implements Option {
	
	double prix = 212.35d;
	
	//M�thode permettant de retourner uniquement le prix.
	public double getPrix(){
		
		return prix;
	}
	
	//M�thode permettant d'afficher l'option avec son prix.
	public String formatPrix(){
		StringBuilder str = new StringBuilder();
		str.append("Vitres electriques ");
		str.append("("+prix+"�)");
		return str.toString();
	}

}
