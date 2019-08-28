package fr.formation.inti.heritage;

//Réaliser une classe PointNom, dérivée de Point permettant de manipuler des points définis par 
//leurs coordonnées (entières) et un nom (caractère). 
//On y prévoira les méthodes suivantes :
//	1_ constructeur pour définir les coordonnées et le nom d’un objet de type PointNom,
//	2_ affCoordNom pour afficher les coordonnées et le nom d’un objet de type PointNom.
//	
//Écrire un petit programme utilisant la classe PointNom.

class Point4 {
	public Point4 (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void affiche() {
		System.out.println("Coordonnees : "+x+" "+y);
	}
	
	private int x,y;	
}



class PointNom2 extends Point4 {
	
	private String nom;

	public PointNom2(int x, int y, String nom) {
		super(x,y);
		
		this.nom = nom;
	}

	public void affiche() {
		
		System.out.println("\"" + nom + "\" a pour " );
		super.affiche();
	}
}
