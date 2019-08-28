package fr.formation.archives.inti;

public class AnimauxHeritages {

	protected String nom;
	protected int poids;
	
	public AnimauxHeritages() {}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}


	public void affiche() {
		System.out.println("Je suis un animal");
	}
}




class Chat extends AnimauxHeritages {
	
	public void affiche() {
//		super();
		System.out.println("Je suis un chat");
	}
}



class Chien extends AnimauxHeritages {
	
	public void affiche() {
//		super();
		System.out.println("Je suis un chien");
	}
}

class Mouton extends AnimauxHeritages {
	
	public void affiche() {
//		super();
		System.out.println("Je suis un mouton");
	}
}