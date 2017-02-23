package com.marvin.java.option.liste;

import com.marvin.java.option.Option;

public class SiegeChauffant implements Option {
	
	double prix = 569.2d;
	
	//M�thode permettant de retourner uniquement le prix.
	public double getPrix(){
		
		return prix;
	}
	
	//M�thode permettant d'afficher l'option avec son prix.
	public String formatPrix(){
		StringBuilder str = new StringBuilder();
		str.append("Sieges chauffant ");
		str.append("("+prix+"�)");
		return str.toString();
	}

}
