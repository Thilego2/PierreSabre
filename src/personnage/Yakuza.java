package personnage;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 4;
	
	public int getReputation() {
		return reputation;
	}
	
	public Yakuza(String nom,String boisson,int argent,String clan) {
		super(nom,boisson,argent);
		this.clan=clan;
	}
	
	public void extorquer(Commer�ant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom()+", si tu tiens � la vie donne moi ta bourse !");
		gagnerArgent(victime.getArgent());
		victime.seFaireExtorquer();
		reputation++;
		parler("J'ai piqu� les "+victime.getArgent()+" sous de "+victime.getNom()+", ce qui me fait " 
				+getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	public void gagner(int argent) {
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+" ? Je l'ai d�pouill� de ses "+argent+" sous.");
		gagnerArgent(argent);
	}
	
	public void perdre() {
		parler("J�ai perdu mon duel et mes "+getArgent()+" sous, snif... J'ai d�shonor� le clan de "+clan+".");
		perdreArgent(getArgent());
	}

}
