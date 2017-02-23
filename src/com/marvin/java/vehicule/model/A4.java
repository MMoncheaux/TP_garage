package com.marvin.java.vehicule.model;

import com.marvin.java.enums.Marque;
import com.marvin.java.vehicule.Vehicule;

public class A4 extends Vehicule {
	
	//Constructeur du vehicule
	public A4() {
		super();
		marque = Marque.valueOf("AUDI");
	}
	
	
	//Méthode permettant d'afficher le type de véhicule.
	public String printVoiture() {	
		
		return marque.getNomMarque() + "A4 ";	
	}
}
