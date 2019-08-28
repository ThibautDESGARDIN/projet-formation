package fr.formation.archives.inti;

import fr.formation.inti.heritage.IPoint3;
import fr.formation.inti.heritage.Point3;

// On souhaite r�aliser une classe Cercle disposant des m�thodes suivantes :
//	 1_ constructeur recevant en argument les coordonn�es du centre
//	 du cercle et son rayon,
// 	 2_ deplaceCentre pour modifier les coordonn�es du centre du cercle,
//	 3_ changeRayon pour modifier le rayon du cercle,
//	 4_getCentre qui fournit en r�sultat un objet de type 
//	 Point correspondant au centre du cercle,
//	 5_affiche qui affiche les coordonn�es du centre du cercle 
//	 et son rayon.
//	
// 1. D�finir la classe Cercle comme classe d�riv�e de Point
// 2. D�finir la classe Cercle comme poss�dant un membre de type Point.
//
// Dans les deux cas, on �crira un petit programme mettant en jeu les diff�rentes fonctionnalit�s de la classe Cercle.

public class Cercle extends Point3 {
	public int x, y, r;
	
	
	public Cercle(int x, int y, int r) {
		super(x,y);
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	@Override
	public String toString() {
		return "Cercle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}

	public void deplaceCentre(int dx, int dy) {
		x=x+dx;
		y=y+dy;
	}
	
	public void changeRayon(int dr) {
		r=r+dr;
	}
	
	public Point3 getCentre() {
		return new Point3(x, y);
	}
	
	public void affiche() {
		System.out.println("Coordonnees du centre : "+x+", "+y);
		System.out.println("Longueur du rayon : "+r);
		System.out.println();
	}
	
	
}
