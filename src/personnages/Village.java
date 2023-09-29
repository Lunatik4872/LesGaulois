package personnages;

public class Village {
	
	
	private String nom;
	private Chef chef;
	private int nb_villageois = 0;
	private Gaulois[] villageois; 
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMax];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois newVillageois) {
		villageois[nb_villageois] = newVillageois;
		nb_villageois ++;
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		return villageois[numeroVillageois];
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// On créer un tableau à 30 positions mais dans un tableau de taille n
		// les indices vont de 0 à n-1
		

	}

}
