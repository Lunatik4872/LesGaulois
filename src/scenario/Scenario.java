package scenario;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Village;
import personnages.Chef;
import personnages.Druide;
import personnages.Equipement;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",8);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix", 5 ,10);
		
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10");
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		
	}

}
