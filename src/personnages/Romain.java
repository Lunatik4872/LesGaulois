package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	private String texte;

	
	public Romain(String nom, int force) {
		assert force >= 0;
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
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

//	public void recevoirCoup(int forceCoup) {
//		assert force >= 0;
//		int ts = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aie");
//		} 
//		else {
//			parler("J'abandonne...");
//		}
//		assert ts < force;
//		
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		assert force > 0;
		Equipement[] equipementEjecte = null;
		// précondition
		int oldForce = force;
		
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} 
		else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}

		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}
	
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			
			for (int i = 0; i < nbEquipement;i++) {
				if (equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) {
					resistanceEquipement += 8;
				} 
				else if (equipements[i] != null) {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		int nbEquipementEjecte = 0;
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		
		return equipementEjecte;
	}
	
	public void sEquiper(Equipement piece) {
		switch (nbEquipement) {
		
			case 0 :
				equipements[0] = piece;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s'equipe avec un " + piece);
				break;
		
			case 1 :
				if (piece != equipements[0]) { 
					equipements[0] = piece;
					nbEquipement++;
					System.out.println("Le soldat " + nom + " s'equipe avec un " + piece);
				}
				else {
					System.out.println("Le soldat " + nom + " possede deja un " + piece);
				}
				break;
			
			default:
				System.out.println("Le soldat " + nom + " est deja bien protege !");
		}
	}
	
	public static void main(String[] args) {
		Romain bernard = new Romain("Bernard",12);
		bernard.sEquiper(Equipement.CASQUE);
		bernard.sEquiper(Equipement.CASQUE);
		bernard.sEquiper(Equipement.BOUCLIER);
		bernard.sEquiper(Equipement.CASQUE);
	}

}
