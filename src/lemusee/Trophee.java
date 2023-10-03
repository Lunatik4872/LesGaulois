package lemusee;

import personnages.Gaulois;
import personnages.Equipement;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Trophee(Gaulois gaulois, Equipement equipement) {
		super();
		this.gaulois = gaulois;
		this.equipement = equipement;
	}

	public Gaulois getGaulois() {
		return gaulois;
	}

	public Equipement getEquipement() {
		return equipement;
	}
	
	public String donnerNom() {
		return gaulois.getNom();
	}

	@Override
	public String toString() {
		return "Trophee [gaulois=" + gaulois + ", equipement=" + equipement + "]";
	}
	
}
