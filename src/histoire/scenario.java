package histoire;

import personnages.*;

public class scenario {
	 public static void main(String[] args)
	 {
			Gaulois asterix=new Gaulois("asterix",8,1);
			Romain minus=new Romain("minus",8);
			
			asterix.parler("Bonjour à tous");
			minus.parler("UN GAU...UN GAUGAU...");
			asterix.frapper(minus);
			asterix.frapper(minus);
			asterix.frapper(minus);
	 }	

}


