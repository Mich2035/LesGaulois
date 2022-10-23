package personnages;

public class Musee {
 private Equipement[] trophee;
 private int nbTrophee=0;
public Musee(Equipement[] trophee) {
	super();
	this.trophee=new Equipement[200];
	
}
public void donnerTrophees(Gaulois gaulois,Equipement equipement) {
	if(nbTrophee<trophee.length) {
		trophee[nbTrophee]=equipement;
		nbTrophee+=1;
		for(int i=0;i<nbTrophee;i++) {
			trophee[i]=equipement;
		System.out.println("- "+trophee[i]);}
	}
	
}

}
