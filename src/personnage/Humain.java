package personnage;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance=0;
	protected String[] memoire;
	
	public Humain(String nom,String boisson,int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		memoire = new String[30];
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson+".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boisson+"! GLOUPS!");
	}
	
	public void acheter(String bien,int prix) {
		if(argent >= prix) {
			parler("J'ai "+argent+" sous en poche. "
					+ "Je vais pouvoir m'offrir "+bien+" � "
					+prix+" sous");
			argent-=prix;
		}
		else {
			parler("Je n'ai plus que  "+argent+" sous en poche. "
					+ "Je ne peux m�me pas m'offrir "+bien+" � "
					+prix+" sous");
		}
		
	}
	
	protected void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	protected void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void faireConnaissance(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	
	private void memoriser(Humain humain) {
		memoire[nbConnaissance]=humain.getNom();
		nbConnaissance++;
		if (nbConnaissance==30) { nbConnaissance=0; }
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont : ");
		for (int i=0;i<nbConnaissance;i++) {
			parler(memoire[i]+", ");
		}
	}
}
