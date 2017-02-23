package com.marvin.java.vehicule.model;
import com.marvin.java.enums.Marque;
import com.marvin.java.vehicule.Vehicule;

public class Gti205 extends Vehicule {
	
	//Constructeur du vehicule
	public Gti205(){
		 marque = Marque.valueOf("PEUGEOT");
	}
	
	//M�thode permettant d'afficher le type de v�hicule.
	public String printVoiture() {
		
		return marque.getNomMarque() + "205 GTI ";
		
	}
}
