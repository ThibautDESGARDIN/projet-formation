package fr.formation.inti.poo2;

public class Telephone {

	String marque;
	int annee;
	String modele;

	// constructeur par défaut
	public Telephone() {
		System.out.println("constructeur par défaut");

	}

	public Telephone(String marque, int annee, String modele) {
		this.marque = marque;
		this.annee = annee;
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}
}
