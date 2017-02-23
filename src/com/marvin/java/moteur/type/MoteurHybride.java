package com.marvin.java.moteur.type;
import com.marvin.java.enums.TypeMoteur;
import com.marvin.java.moteur.Moteur;

public class MoteurHybride extends Moteur {
	

	public MoteurHybride(String pPuissance, double pPrix) {
		
		super(pPuissance, pPrix);
		
		nameMoteur = TypeMoteur.valueOf("HYBRIDE");
	}
	
	public  String getNomMoteur(){
		return nameMoteur.getTypeMoteur();	
	}
}
