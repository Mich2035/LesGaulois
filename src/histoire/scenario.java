package histoire;

import personnages.*;

public class scenario {
	 public static void main(String[] args)
	 {
			Gaulois asterix=new Gaulois("asterix",6,1);
			Gaulois ast=new Gaulois("Obelix",6,1);
			Romain minus=new Romain("minus",8);
			Druide panoramix=new Druide ("panoramix",5,10);

			panoramix.preparerPotion();
			asterix.boirePotion(6);
			panoramix.booster(ast);
			panoramix.booster(asterix);
			asterix.parler("Bonjour");
			minus.parler("UN GAU...UN GAUGAU...");
			asterix.frapper(minus);
			asterix.frapper(minus);
			asterix.frapper(minus);
			
	 }	

}


