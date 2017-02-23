package com.marvin.java.enums;

public enum Marque {
	RENAULT("Voiture Renault : "),
	PEUGEOT ("Voiture Peugeot : "),
	AUDI ("Voiture Audi : "),
	CITROEN ("Voiture Citroen : ");
	
	private String nameMarque = "";

	//Constructeur 
	Marque(String nameMarque) {
		this.nameMarque = nameMarque;
	}
	
	//Méthode permettant d'appeler la marque choisi pour la voiture.
	public String getNomMarque(){
		return nameMarque;
	}
}



