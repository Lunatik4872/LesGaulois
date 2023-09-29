package personnages;

import java.util.Iterator;

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
		return villageois[numeroVillageois-1];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans " + nom + " du chef " + chef.getNom() + " vivent les legendaires gaulois :");
		for (int i = 0; i < nb_villageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
		
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles", 30);
		
//		Gaulois gaulois = village.trouverHabitant(30);
//		 On créer un tableau à 30 positions avce des null donc pas du bon type
		
		Chef abraracourcix = new Chef("Abraracourcix",6,1,village);
		village.setChef(abraracourcix);
		
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();

//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//      On retrouve bien le gaulois ajouté au village car désormais ce n'est plus null mais de type Gaulois


	}

}
