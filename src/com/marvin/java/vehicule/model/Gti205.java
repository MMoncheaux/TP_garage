package com.marvin.java.vehicule.model;
import com.marvin.java.enums.Marque;
import com.marvin.java.vehicule.Vehicule;

public class Gti205 extends Vehicule {
	
	//Constructeur du vehicule
	public Gti205(){
		 marque = Marque.valueOf("PEUGEOT");
	}
	
	//Méthode permettant d'afficher le type de véhicule.
	public String printVoiture() {
		
		return marque.getNomMarque() + "205 GTI ";
		
	}
}
