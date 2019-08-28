package fr.formation.inti.poo;

public class App {

	public static void main(String[] args) {
		Stagiaire stg = new Stagiaire("Desgardin", "Thibaut");
		stg.affichage();
		stg.getNom();
		stg.setNom("test");
	}

}