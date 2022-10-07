package personnages;

import java.util.*;

public class Druide  { 
	private int forcePotion=1;;
	private String nom; 
	private int effetPotionMin; 
	private int effetPotionMax; 
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) { 
		this.nom = nom; 
		this.effetPotionMin = effetPotionMin; 
		this.effetPotionMax = effetPotionMax; 
		parler("Bonjour,  je  suis  le  druide  "  +  nom  +  "  et  ma  potion  peut  aller d'une force " + effetPotionMin + " à "+ effetPotionMax + "."); 
	} 
	
	public String getNom() { 
	return nom; 
	} 
	
	public void parler(String texte) { 
	System.out.println(prendreParole() + "<< " + texte + ">>"); 
	} 
	
	private String prendreParole() { 
	return "Le druide " + nom + " : "; 
	} 
	
	public void preparerPotion() {
		
		Random jva=new Random();
		forcePotion=jva.nextInt((effetPotionMin+effetPotionMax)-effetPotionMin);
		if (forcePotion>7) {
			parler("J'ai preparé une super potion de force");
		} else {
			parler("Je n'ai pas trouver tous les ingredients,ma potion est seulement de force "+forcePotion+".");

		}
	}
	public  void booster(Gaulois test) {
		if (test.getNom().equalsIgnoreCase("Obelix")) {
			parler("Non, Obelix!...Tu n'auras pas de potion magique!");
			
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix;
		asterix=new Gaulois("Obelix",8,1);
		Druide panoramix=new Druide("panoramix",5,10);
		panoramix.preparerPotion();
		panoramix.booster(asterix);
	}


} 