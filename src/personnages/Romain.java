package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;


	public Romain(String nom, int force) {
		this.equipements = new Equipement[2];
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

		return (force > 0);
	}

	private boolean invariantsatisfied() {
		return forcepositive();

	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
// public void recevoirCoup(int forceCoup) { 
//	 assert invariantsatisfied();
// force -= forceCoup; 
// if (force > 0) { 
// parler("Aie"); 
// } else { 
// parler("J'abandonne...");
// assert invariantsatisfied();
// } 
// }

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculresistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force>0) {
		
			parler("Aïe");
			
		}
		else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force à diminuer
		assert force < oldForce;
		return equipementEjecte;
	}

	private int calculresistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement !=0){

			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				
			}
			texte = +resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private void equipement(Equipement equipement) {

		if (nbEquipement < equipements.length) {
			equipements[nbEquipement] = equipement;
			nbEquipement++;
			System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement);
		}

	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
		
			} else {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2: {
			System.out.println("Le soldat " + nom + " est deja bien protege !");
			break;

		}
		case 1: {
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possede deja un " + equipement + "!");
				break;
			} else {
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
		Romain romain = new Romain("minus", 6);
		// System.out.println("Equipement: "+Equipement.CASQUE);
		// System.out.println("Equipement: "+Equipement.BOUCLIER);
		romain.equipement(Equipement.CASQUE);
		romain.sEquiper(Equipement.CASQUE);
		romain.equipement(Equipement.BOUCLIER);
		romain.equipement(Equipement.CASQUE);
		romain.sEquiper(Equipement.BOUCLIER);

	}

}