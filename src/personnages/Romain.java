package personnages;

public class Romain {
	private String nom;
	private int force;
	
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
	
//	public static void main(String[] args) {
//		Romain bernard = new Romain("Bernard",12);
//		bernard.parler("Yes");
//		bernard.recevoirCoup(5);
//		bernard.recevoirCoup(18);
//	}

}
