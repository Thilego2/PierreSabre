package personnage;

public class Ronin extends Humain {
	private int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		parler(beneficiaire.getNom()+" prend ces "+getArgent()/10+" sous.");
		beneficiaire.recevoir(getArgent()/10);
		perdreArgent(getArgent()/10);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (honneur >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa !");
			gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur--;
		}
	}
}
