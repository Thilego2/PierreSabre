package personnage;

public class Commer�ant extends Humain{
	
	public Commer�ant(String nom,int argent) {
		super(nom,"th�",argent);
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return getArgent();
	}
	
	public void recevoir(int argent) {
		parler(argent+" sous! Je te remercie g�n�reux donateur!");
	}

}
