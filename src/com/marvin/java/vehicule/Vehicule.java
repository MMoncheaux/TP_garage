package com.marvin.java.vehicule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.marvin.java.enums.Marque;
import com.marvin.java.moteur.Moteur;
import com.marvin.java.option.Option;

public abstract class Vehicule {
	
	private List<Option> listOption = new ArrayList<Option>();
	
	public Moteur moteur;
	
	public Marque marque;
	
	private Option option;
	
	
	//Mutateur moteur.
	public void setMoteurVoiture(Moteur moteur){
		this.moteur = moteur; 
	}
	
	//Accesseur moteur
	public Moteur getMoteurVoiture(){
		return moteur;
	}
	
	
	
	public List<Option> getListOption() {
		return listOption;
	}

	public void setListOption(List<Option> listOption) {
		this.listOption = listOption;
	}

	
	//M�thode permettant d'ajouter une option a la liste option.
	public void addOption(Option option){
		listOption.add(option);
	}
	
	
	//M�thode permettant d'afficher la voiture.
	public String printVoiture() {
		return marque.getNomMarque();
	}
	
	
	//M�thode permettant d'afficher la liste d'option.
	public String printOption(){
		StringBuilder str = new StringBuilder();//Permet de cr�er une String 
		str.append(", [");//On build une string
		for (Iterator<Option> iterator = listOption.iterator(); iterator.hasNext();) {//On cr�er une boucle permettant de naviguer dans la list et d'ajouter des options dans celle ci.
			Option option = iterator.next();
			str.append(option.formatPrix());//On affiche grace au .getPrix() la string correspondant a l'option choisie.
			if(iterator.hasNext()){
				str.append(", ");//si on ajoute une option, on ajoute grace a .append une virgule et un espace.
			}
		}
		str.append("]");
	 	return str.toString();
	}
	
	
	//M�thode permettant d'afficher le prix total du V�hicule
	public String prixTotal(){
		double prixTotal = 0d;
		StringBuilder str = new StringBuilder();
		str.append("\nLa valeur totale du v�hicule est de : ");
		for (int i = 0; i < listOption.size(); i++) {
			prixTotal += listOption.get(i).getPrix();
			
		}
		prixTotal = prixTotal + Moteur.prixMoteur;
		str.append("("+prixTotal+"�)");
		return str.toString() ;
		
	}
	
	
	
	//Accesseur Option permet de retourner une Option.
	public Option getOption() {
		return option;
	}
	
	
	//Mutateur d�finis le nom de l'option.
	public void setOption(Option option) {
		this.option = option;
	}
	
	

	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
}
