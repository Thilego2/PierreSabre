package histoire;

import personnage.Humain;
import personnage.Ronin;
import personnage.Commerçant;
import personnage.Yakuza;

public class histoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commerçant marco = new Commerçant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		Ronin roro = new Ronin("Roro","shochu",60);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
	}
}
