package fr.formation.archives.inti;

class ClasseObjets_2 {
	public ClasseObjets_2(int coeff) {
		nbr *= coeff;
		nbr += decal;

	}

	public void affiche() {
		System.out.println("nombre = " + nbr + " decal = " + decal);
	}

	private int nbr = 20;
	private int decal;

	
}

