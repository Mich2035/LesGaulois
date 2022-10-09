package personnages;

public class Village {
	private static final int nbVillageoisMaximum=30;
	private String nom;
	private Chef[] chefvillage;
	private Gaulois[] villageois;
	private int nbvillageois=0;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois=new Gaulois[nbVillageoisMaximum];
		this.chefvillage=new Chef[nbVillageoisMaximum];
	}
	public void ajouterHabitant(Gaulois gauloisaajouter) {
		if (nbvillageois<nbVillageoisMaximum) {
			villageois[nbvillageois]=gauloisaajouter;
					nbvillageois++;
			
		}
	}
	public void ajouterChef(Chef chefaajouter) {
		if (nbvillageois<nbVillageoisMaximum) {
			chefvillage[nbvillageois]=chefaajouter;
					nbvillageois++;
			
		}
	}
	
	public void trouverHabitant(int numvillageois) {
		System.out.println("je suis le villageois numero"+numvillageois+".");
	}
	//public void setChef(Chef chef) {
		//this.chef = chef;
	//}
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Village village=new Village("Village des Irréductibles",30);
		Gaulois asterix=new Gaulois("asterix",8,1);
		Chef Abaracourcix=new Chef("Abaracourcix",6,1,village);
		village.ajouterHabitant(asterix);
		village.ajouterChef(Abaracourcix);
		//Gaulois gaulois=village.trouverHabitant(30);
		//on obtient l'exception du poinprécédent parce que dans notre tableau Gaulois on atteind pas la case 30 vu qu'on commence à zero.
		
	}

}
