package com.marvin.java.vehicule.model;
import com.marvin.java.enums.Marque;
import com.marvin.java.vehicule.Vehicule;

public class Ds3 extends Vehicule {
	
	//Constructeur du vehicule
	public Ds3(){
		super();
		marque = Marque.valueOf("CITROEN");	
	}
	
	//M�thode permettant d'afficher le type de v�hicule.
	public String printVoiture() {
		
		return marque.getNomMarque() + "DS3 ";
		
	}


}
