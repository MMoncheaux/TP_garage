package com.marvin.java.garage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.marvin.java.vehicule.Vehicule;

public class Garage {
	
	
	public Vehicule vehicule;
	
	File f = new File ("c:/garage.txt");
	
	private List <Vehicule> listVoiture = new ArrayList<Vehicule>();
	
	
	public String garage(){
		StringBuilder str = new StringBuilder();
		str.append("********************\n*");
		str.append( " Garage de Marvin ");
		str.append("*\n********************");
		
		return str.toString();
	}
	
	
	
	public List <Vehicule> getListVoiture() {
		return listVoiture;
	}
	
	
	public void setListVoiture(List <Vehicule> listVoiture) {
		this.listVoiture = listVoiture;
	}
	
	
	
	//Méthode pour ajouter une voiture dans le fichier.
	public void addDansFichier(){
		Writer bw = null;
		try{
		    bw = new BufferedWriter (new FileWriter (f));
				ecritureDansFichier(bw);
		    
		}
		
		catch (FileNotFoundException exception){
			System.out.println("Aucune voiture sauvegardée!");
		}
		
		catch (IOException exception ){
			System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
		}
		finally {
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	//Méthode pour ecrire dans le Fichier, appelé dans la méthode addDansFichier().
	public void ecritureDansFichier(Writer bw) throws IOException{

		for (Iterator<Vehicule> iterator = listVoiture.iterator(); iterator.hasNext();) {
			Vehicule vehicule = (Vehicule) iterator.next();
			StringBuilder str = new StringBuilder();
			
			str.append(vehicule.printVoiture());
			str.append(vehicule.getMoteurVoiture().getMoteur());
			str.append(vehicule.printOption());
			str.append(vehicule.prixTotal());
			str.append("\n");

			bw.write(str.toString());
			
		}
	
	}
	
	
	//Méthode permettant d'afficher le contenu du fichier.
	public String displayFichierGarage(){
		
		StringBuilder str = new StringBuilder();
		
		try{
				InputStream flux=new FileInputStream(f); 
				InputStreamReader lecture=new InputStreamReader(flux);
				BufferedReader buff=new BufferedReader(lecture);
				String ligne;
				while ((ligne=buff.readLine())!=null){
					str.append(ligne);
					str.append("\n");
					
				}
				
				buff.close(); 	
				return str.toString();
			}		
		
			catch (FileNotFoundException exception){
				System.out.println("Aucune voiture sauvegardée!");
			}
			
			catch (IOException exception ){
				System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
			}
		return "";
		
	}
	
}	
	
	

	


