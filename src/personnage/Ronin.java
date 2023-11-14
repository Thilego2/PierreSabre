package personnage;

public class Ronin extends Humain {
	private int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commerçant beneficiaire) {
		parler(beneficiaire.getNom()+" prend ces "+getArgent()/10+" sous.");
		beneficiaire.recevoir(getArgent()/10);
		perdreArgent(getArgent()/10);
	}
}
