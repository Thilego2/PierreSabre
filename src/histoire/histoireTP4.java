package histoire;

import personnage.Humain;
import personnage.Ronin;
import personnage.Commercant;
import personnage.Yakuza;

public class histoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		Commercant marco = new Commercant("Marco",20);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		Ronin roro = new Ronin("Roro","shochu",60);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		yaku.direBonjour();
		yaku.extorquer(marco);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);


		
//		marco.parler(marco.getArgent());
//		yaku.parler(yaku.getArgent());
//		roro.parler(roro.getArgent());
	}
}
