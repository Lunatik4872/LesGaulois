package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert force >= 0;
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0;
		int ts = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} 
		else {
			parler("J'abandonne...");
		}
		assert ts < force;
		
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
