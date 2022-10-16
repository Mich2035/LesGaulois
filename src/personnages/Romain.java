 package personnages;


 public class Romain  { 
 private String nom; 
 private int force;
 private Equipement[] equipements;
 private int nbEquipement=0;
 
 public Romain(String nom, int force) { 
this.equipements=new Equipement[2];
 this.nom = nom; 
 this.force = force; 

 } 
 public String getNom() { 
 return nom; 
 } 
 public int getForce() {
	 return force;
 }
 
 public void parler(String texte) { 
 System.out.println(prendreParole() + "<<" + texte + ">>"); 
 }

 private boolean forcepositive() {

	 return(force>0);
 }
 private boolean invariantsatisfied() {
	 return forcepositive();
	 
 }

 private String prendreParole() { 
 return "Le romain " + nom + " : "; 
 } 
 public void recevoirCoup(int forceCoup) { 
	 assert invariantsatisfied();
 force -= forceCoup; 
 if (force > 0) { 
 parler("Aie"); 
 } else { 
 parler("J'abandonne...");
 assert invariantsatisfied();
 } 
 } 
 private void equipement(Equipement equipement) {
	 
	 if(nbEquipement < equipements.length) {
	 equipements[nbEquipement]=equipement;
	 nbEquipement++;
	 System.out.println("Le soldat "+nom+" s'equipe avec un "+equipement);
	 }
	  
 }
 

public void sEquiper(Equipement equipement) {
	 switch(nbEquipement) {
	 case 2:{
		 System.out.println("Le soldat "+nom+" est deja bien protege !");
		 break;
		 
	 }
	 case 1:{
		 if (equipements[0]==equipement) {
			 System.out.println("Le soladat "+nom+" possede deja un "+equipement+"!");
			 break;
		 }
		 else {
			 equipement(equipement);
			 break;
		 }
	 }
	default: {
		equipement(equipement);
		break;

	}
		
	}
			 
		 }
				 
 
 public static void main(String[] args) { 
		Romain romain=new Romain("minus",6);
		//System.out.println("Equipement: "+Equipement.CASQUE);
		//System.out.println("Equipement: "+Equipement.BOUCLIER);
       romain.equipement(Equipement.CASQUE);
       romain.sEquiper(Equipement.CASQUE);
       romain.equipement(Equipement.BOUCLIER);
       romain.equipement(Equipement.CASQUE);
       romain.sEquiper(Equipement.BOUCLIER);
        
	}

 
 
 
 }