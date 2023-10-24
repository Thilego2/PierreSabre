package personnage;

public class Yakuza extends Humain{
	private String clan;
	private int réputation = 0;
	
	public Yakuza(String nom,String boisson,int argent,String clan) {
		super(nom,boisson,argent);
		this.clan=clan;
	}
	
	public void extorquer(Commerçant victime) {
		victime.seFaireExtorquer();
		argent+=
	}

}
