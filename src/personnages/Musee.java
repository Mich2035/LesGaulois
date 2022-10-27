package personnages;

public class Musee {
 private Trophee[] trophee;
 private int nbTrophee=0;
 
public Musee(Trophee[] trophee) {
	super();
	this.trophee=new Trophee[200];
	

	
}

public void donnerTrophees(Gaulois gaulois,Equipement equipement) {
	Trophee trophee2=new Trophee(gaulois,equipement);
	
	
	if(nbTrophee<trophee.length) {
		trophee[nbTrophee]=trophee2;
		nbTrophee+=1;
		
			trophee[nbTrophee]=trophee2;
		//System.out.println("- "+trophee[i]);}
	
	
}
}
public void extraireInstructionCaml() {
	Gaulois asterix=new Gaulois("asterix",8,1);

	System.out.println("let mus = [");

	for(int i=0;i<nbTrophee;i++) {
		
		System.out.println(asterix.getNom()+",  "+trophee[i].getEquipement());}
	System.out.println("]");
		
	}
public static void main(String[] args) {
	Trophee[] trophee=new Trophee [200];
	Musee mus=new Musee(trophee);

	Gaulois asterix=new Gaulois("asterix",8,1);
	mus.donnerTrophees(asterix,Equipement.CASQUE);
	mus.donnerTrophees(asterix,Equipement.CASQUE);
	mus.donnerTrophees(asterix,Equipement.BOUCLIER);
	asterix=new Gaulois("asterix",8,1);

	asterix.faireUneDonation(mus);
	mus.extraireInstructionCaml();
}
}
