package com.marvin.java.vehicule.model;
import com.marvin.java.enums.Marque;
import com.marvin.java.vehicule.Vehicule;

public class Ds3 extends Vehicule {
	
	//Constructeur du vehicule
	public Ds3(){
		super();
		marque = Marque.valueOf("CITROEN");	
	}
	
	//Méthode permettant d'afficher le type de véhicule.
	public String printVoiture() {
		
		return marque.getNomMarque() + "DS3 ";
		
	}


}
