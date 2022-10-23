package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion=1;
	private int force;
	private int nbtrophees;
	private Equipement[] trophees=new Equipement[100] ;
	
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

	public void faireUneDonation(Musee mus) {
		if (trophees!=null) {
			parler("Je donne au musee tous mes trophees:");
		}
		
	}
//	private String prendreParole()
//	{
//		return "le gaulois"+nom +" :";
//	}
// 
private String prendreParole() {

	return "Le gaulois " + nom + " : ";
		}
public void parler(String texte) {
	System.out.println(prendreParole() +"<<" +texte+">>");
}

//public void frapper(Romain romain) { 
//System.out.println(nom + " envoie un grand coup dans la machoire de "+ romain.getNom()); 
//romain.recevoirCoup((force / 3)*effetPotion); }

public void frapper(Romain romain) {
	System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	Equipement trophees2[] = romain.recevoirCoup((force / 3) *
	effetPotion);
	for (int i = 0; trophees != null && i < trophees.length; i++,
	nbtrophees++) {
		this.trophees[nbtrophees] = trophees[i];
	}
	
}
public void boirePotion(int forcePotion) {
	Druide panoramix=new Druide("panoramix",5,10);
	effetPotion=forcePotion;

	parler(" Merci " +panoramix.getNom()+" je sens que ma force est "+effetPotion+" fois decuplee");

}


public static void main(String[] args) { 
	Romain romain=new Romain("minus",8);
	Gaulois asterix;
	Equipement[] trophee=new Equipement [200];
	asterix=new Gaulois("asterix",8,1);
	Musee mus=new Musee(trophee);
	System.out.println(asterix.getNom());
	asterix.prendreParole();
	asterix.parler("Bonjour à tous");
	asterix.frapper(romain);
	asterix.boirePotion(7);
	asterix.faireUneDonation(mus);

	mus.donnerTrophees(asterix,Equipement.BOUCLIER);
	mus.donnerTrophees(asterix,Equipement.CASQUE);

	
}


}
