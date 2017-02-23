package com.marvin.java.moteur.type;
import com.marvin.java.enums.TypeMoteur;
import com.marvin.java.moteur.Moteur;


public class MoteurDiesel extends Moteur {
	
	public MoteurDiesel(String pPuissance, double pPrix) {
		
		super(pPuissance, pPrix);
		
		nameMoteur = TypeMoteur.valueOf("DIESEL");
	}
	 
	 
	public  String getNomMoteur(){
		return nameMoteur.getTypeMoteur();	
	}

}
