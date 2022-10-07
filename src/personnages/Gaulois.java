package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	public int getEffetPotion() {
		return effetPotion;
	}
	public Gaulois(String nom, int force, int effetPotion) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	private String prendreParole()
	{
		return "le gaulois"+nom +" :";
	}
 
public void parler(String texte) {
	System.out.println(prendreParole() +"<<" +texte+">>");
}

public void frapper(Romain romain) { 
System.out.println(nom + " envoie un grand coup dans la machoire de "+ romain.getNom()); 
romain.recevoirCoup((force / 3)*effetPotion); }

public void boirePotion(int forcePotion) {
	Druide panoramix=new Druide("panoramix",5,10);
	effetPotion=forcePotion;

	parler(" Merci " +panoramix.getNom()+" je sens que ma force est "+effetPotion+" fois decuplee");

}


public static void main(String[] args) { 
	Romain romain=new Romain("minus",8);
	Gaulois asterix;
	asterix=new Gaulois("asterix",8,1);
	System.out.println(asterix.getNom());
	asterix.prendreParole();
	asterix.parler("Bonjour à tous");
	asterix.frapper(romain);
	asterix.boirePotion(7);
}


} 


