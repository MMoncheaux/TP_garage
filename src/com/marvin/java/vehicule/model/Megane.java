package com.marvin.java.vehicule.model;
import com.marvin.java.enums.Marque;
import com.marvin.java.vehicule.Vehicule;

public class Megane extends Vehicule {
	
	//Constructeur du vehicule
	public Megane() {
		super();
		marque = Marque.valueOf("RENAULT");
	}
	
	//Méthode permettant d'afficher le type de véhicule.
	public String printVoiture() {
		
		return marque.getNomMarque() + "Mégane ";
		
	}

}
