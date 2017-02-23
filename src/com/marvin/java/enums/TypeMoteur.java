package com.marvin.java.enums;

public enum TypeMoteur {
	DIESEL ("moteur DIESEL"),
	ESSENCE ("moteur ESSENCE"),
	HYBRIDE ("moteur HYBRIDE"),
	ELECTRIQUE ("moteur ELECTRIQUE");

	public String nameMoteur = "";
	//constructeur
	TypeMoteur(String nameMoteur){
		this.nameMoteur = nameMoteur;
	}
	
	//M�thode permettant d'appeler le type de moteur choisi.
	public String getTypeMoteur(){
		return nameMoteur;
	}


	
	
}
