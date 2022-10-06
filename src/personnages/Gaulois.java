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
System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom()); 
romain.recevoirCoup(force / 3); }


//public static void main(String[] args) { 
//	Gaulois asterix;
//	asterix=new Gaulois("asterix",8,1);
//	System.out.println(asterix.getNom());
//	asterix.prendreParole("Le gaulois asterix");
//	asterix.parler("Bonjour à tous");
//	asterix.frapper()
// 

} 


