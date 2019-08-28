package fr.formation.inti.heritage;

//R�aliser une classe PointNom, d�riv�e de Point permettant de manipuler des points d�finis par 
//leurs coordonn�es (enti�res) et un nom (caract�re). 
//On y pr�voira les m�thodes suivantes :
//	1_ constructeur pour d�finir les coordonn�es et le nom d�un objet de type PointNom,
//	2_ affCoordNom pour afficher les coordonn�es et le nom d�un objet de type PointNom.
//	
//�crire un petit programme utilisant la classe PointNom.

public class Point3 implements IPoint3 {
	@Override
	public String toString() {
		return "Point3 [x=" + x + ", y=" + y + "]";
	}

	public Point3() {
		// TODO Auto-generated constructor stub
	}
	public Point3 (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void affCoord() {
		System.out.println("Coordonnees : "+x+" "+y);
	}
	
	private int x,y;	
}

//R�aliser une classe PointNom, d�riv�e de Point permettant de manipuler des points d�finis par 
//leurs coordonn�es (enti�res) et un nom (caract�re). 
//On y pr�voira les m�thodes suivantes :
//	1_ constructeur pour d�finir les coordonn�es et le nom d�un objet de type PointNom,
//	2_ affCoordNom pour afficher les coordonn�es et le nom d�un objet de type PointNom.
//	
//�crire un petit programme utilisant la classe PointNom.

class PointNom extends Point3 {
	
	private String nom;

	public PointNom(int x, int y, String nom) {
		super(x,y);
		
		this.nom = nom;
	}

	public void affCoordNom() {
		
		System.out.println("\"" + nom + "\" a pour " );
		super.affCoord();
	}
}
