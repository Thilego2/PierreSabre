package histoire;

import personnage.Humain;
import personnage.Commer�ant;

public class histoireTP4 {
	
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof","kombucha",54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		Commer�ant marco = new Commer�ant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
	}
}
