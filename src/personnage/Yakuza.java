package personnage;

public class Yakuza extends Humain{
	private String clan;
	private int r�putation = 0;
	
	public Yakuza(String nom,String boisson,int argent,String clan) {
		super(nom,boisson,argent);
		this.clan=clan;
	}
	
	public void extorquer(Commer�ant victime) {
		victime.seFaireExtorquer();
		argent+=
	}

}
