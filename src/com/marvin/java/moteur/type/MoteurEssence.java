package com.marvin.java.moteur.type;
import com.marvin.java.enums.TypeMoteur;
import com.marvin.java.moteur.Moteur;

public class MoteurEssence extends Moteur {	
	
	
	public MoteurEssence(String pPuissance, double pPrix) {
			
		super(pPuissance, pPrix);
			
		nameMoteur = TypeMoteur.valueOf("ESSENCE");
	}
	
	public  String getNomMoteur(){
		return nameMoteur.getTypeMoteur();
	}
}