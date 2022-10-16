package personnages;

public class Village {
	private static final int nbVillageoisMaximum=30;
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbvillageois=0;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois=new Gaulois[nbVillageoisMaximum];
		
	}
	public void ajouterHabitant(Gaulois gauloisaajouter) {
		if (nbvillageois<nbVillageoisMaximum) {
			villageois[nbvillageois]=gauloisaajouter;
					nbvillageois++;
			
		}
	}
	
	
	public Gaulois trouverHabitant(int numvillageois) {
		return villageois[numvillageois];
	
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public void afficherVillageois() {
		String info="Dand le village du chef "+chef.getNom()+" vivent les légendaires gaulois ";
		System.out.println(info);
		for(int i=0;i<nbvillageois;i++)
			System.out.println("-"+villageois[i].getNom());
	}
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Village village=new Village("Village des Irréductibles",30);
		Gaulois asterix=new Gaulois("asterix",8,1);
		Gaulois obelix=new Gaulois("Obelix",25,1);
		Chef Abaracourcix=new Chef("Abaracourcix",6,1,village);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.setChef(Abaracourcix);
		
		//Gaulois gaulois=village.trouverHabitant(30);
		//on obtient l'exception du point précédent parce que dans notre tableau Gaulois on atteind pas la case 30 vu qu'on commence à zero.
		Gaulois gaulois=village.trouverHabitant(0);
		System.out.println(gaulois);
		//null
		//Etant donné que mon tableau Gaulois n'a qu'une seule valeur présentement et se trouve dans la case 0
		//La case 1 sera par défaut initialisé à null car on nsait pas ce qui se trouve à l'intérieur
		village.afficherVillageois();
	}

}
