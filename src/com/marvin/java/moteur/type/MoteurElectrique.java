package com.marvin.java.moteur.type;
import com.marvin.java.enums.TypeMoteur;
import com.marvin.java.moteur.Moteur;

public class MoteurElectrique extends Moteur {
	

	public MoteurElectrique(String pPuissance, double pPrix) {
		
		super(pPuissance, pPrix);
		
		nameMoteur = TypeMoteur.valueOf("ELECTRIQUE");
	}
	
	public  String getNomMoteur(){
		return nameMoteur.getTypeMoteur();

	}
}
