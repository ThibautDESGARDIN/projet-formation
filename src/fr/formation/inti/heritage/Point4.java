package fr.formation.inti.heritage;

//R�aliser une classe PointNom, d�riv�e de Point permettant de manipuler des points d�finis par 
//leurs coordonn�es (enti�res) et un nom (caract�re). 
//On y pr�voira les m�thodes suivantes :
//	1_ constructeur pour d�finir les coordonn�es et le nom d�un objet de type PointNom,
//	2_ affCoordNom pour afficher les coordonn�es et le nom d�un objet de type PointNom.
//	
//�crire un petit programme utilisant la classe PointNom.

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
