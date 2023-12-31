package lemusee;

import java.util.Arrays;

import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
	private static int MAX_VAL_TABTROPHEE = 200;
	
	private Trophee[] tabTrophee = new Trophee[MAX_VAL_TABTROPHEE];
	private int nbTrophee = 0;

	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		Trophee trophee = new Trophee(gaulois, equipement);
		if(nbTrophee < 200) {
			tabTrophee[nbTrophee] = trophee;
			nbTrophee++;
		}
		else {
			System.out.println("Plus de place dans le musee");
		}
	}
	
	public String extraireInstructionsCaml() {
		String commande = "let musee = [\n";
		
		for (int i = 0; i < nbTrophee; i++) {
			commande += "\"" + tabTrophee[i].donnerNom() + "\", " + "\"" + tabTrophee[i].getEquipement() + "\";\n" ;
		}
		
		return commande+"]";
	}

	@Override
	public String toString() {
		return "Musee [tabTrophee=" + Arrays.toString(tabTrophee) + ", nbTrophee=" + nbTrophee + "]";
	}
		
}
