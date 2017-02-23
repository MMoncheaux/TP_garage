package com.marvin.java.moteur;

import com.marvin.java.enums.TypeMoteur;

public abstract class Moteur{
	
	public TypeMoteur nameMoteur;

	public  double prix;
	
	String puissanceMoteur;
	
	public static  double prixMoteur;
	
	
	//Méthode permettant d'afficher le moteur.
	public String getMoteur(){
		StringBuilder strMoteur = new StringBuilder();
		strMoteur.append(getNomMoteur()+" "+ puissanceMoteur+" ("+ prixMoteur+"€"+")");
		return strMoteur.toString();
	}

	//CONSTRUCTEUR
	public Moteur(String pPuissance, double pPrix){
		 puissanceMoteur = pPuissance;
		 prixMoteur = pPrix;
		
 	}
	
	
	public String getNomMoteur(){
		return nameMoteur.getTypeMoteur();
	}
	
	
	
	
	//ACCESSEUR
	public String getPuissance(){
		return puissanceMoteur;
	}
	
	public double getPrixMoteur(){
		return prixMoteur;
	}
	
	//MUTATEURS
	public void setPuissance(String pPuissance){
		puissanceMoteur = pPuissance;
	}
	
	public void setPrixMoteur(double pPrix){
		prixMoteur = pPrix;
	}
	
	
	

}
	