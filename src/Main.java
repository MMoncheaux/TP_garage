import com.marvin.java.garage.Garage;
import com.marvin.java.moteur.type.MoteurDiesel;
import com.marvin.java.moteur.type.MoteurElectrique;
import com.marvin.java.moteur.type.MoteurEssence;
import com.marvin.java.moteur.type.MoteurHybride;
import com.marvin.java.option.liste.BarreDeToit;
import com.marvin.java.option.liste.GPS;
import com.marvin.java.option.liste.SiegeChauffant;
import com.marvin.java.option.liste.VitreElectrique;
import com.marvin.java.vehicule.Vehicule;
import com.marvin.java.vehicule.model.A4;
import com.marvin.java.vehicule.model.Ds3;
import com.marvin.java.vehicule.model.Gti205;
import com.marvin.java.vehicule.model.Megane;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage();
		
		System.out.println(garage.garage());
		System.out.println(garage.displayFichierGarage());
		
		Vehicule a4 = new A4();
		a4.setMoteurVoiture(new MoteurDiesel("130 chevaux", 34899d));
		a4.addOption(new SiegeChauffant());
		garage.getListVoiture().add(a4);
		
		
		
		Vehicule ds3 = new Ds3();
		ds3.setMoteurVoiture(new MoteurElectrique("110 chevaux", 16799d));
		ds3.addOption(new GPS());
		garage.getListVoiture().add(ds3);
		
		Vehicule gti205 = new Gti205();
		gti205.setMoteurVoiture(new MoteurEssence("90 chevaux", 8999d));
		gti205.addOption(new BarreDeToit());
		garage.getListVoiture().add(gti205);
		
		Vehicule megane = new Megane();
		megane.setMoteurVoiture(new MoteurHybride("Moteur essence/electrique 75 chevaux", 23499d));
		megane.addOption(new GPS());
		megane.addOption(new VitreElectrique());
		megane.addOption(new SiegeChauffant());
		garage.getListVoiture().add(megane);
		
		
		garage.addDansFichier();

	}
}
