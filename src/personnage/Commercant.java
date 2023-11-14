package personnage;

public class Commercant extends Humain{
	private int perte;
	
	public Commercant(String nom,int argent) {
		super(nom,"th�",argent);
	}
	
	public int seFaireExtorquer() {
		perte = getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		perdreArgent(perte);
		return perte;
	}
	
	public void recevoir(int argent) {
		parler(argent+" sous! Je te remercie g�n�reux donateur!");
		gagnerArgent(argent);
	}

}
