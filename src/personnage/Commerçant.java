package personnage;

public class Commer�ant extends Humain{
	private int perte;
	
	public Commer�ant(String nom,int argent) {
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
