package personnage;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
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

}
