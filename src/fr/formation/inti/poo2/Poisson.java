package fr.formation.inti.poo2;

public class Poisson {
	private String nom;
	private String couleur;
	private boolean rayures;
	private int taille;
	
	public Poisson() {
	}
	
	//autre constructeur
	public Poisson(String nom, String couleur, boolean rayures, int taille) {
			System.out.println("nom : " + nom + ", couleur : " + couleur + ", rayures : " + rayures + ", taille : " + taille);
			this.nom=nom;
			this.couleur=couleur;
			this.rayures=rayures;
			this.taille=taille;
			
	}
		
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	
	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public boolean isRayures() {
		return rayures;
	}


	public void setRayures(boolean rayures) {
		this.rayures = rayures;
	}


	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "Poisson [nom=" + nom + ", couleur=" + couleur + ", rayures=" + rayures + ", taille=" + taille + "]";
	}

	
}
