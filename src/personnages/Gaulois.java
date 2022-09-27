package personnages;

import java.util.Iterator;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	//TODO 
	public Gaulois(String nom, int force, int effetPotion) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	

	

}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	private string prendreParole()
	{
		return "le gaulois"+nom +" :";
	}
 
public void parler(String texte) {
	system.out.println(prendreparole() +"<<" +texte+">>");
}
public static void name() {
	
}

}