package fr.formation.archives.inti;

import fr.formation.inti.heritage.IPoint3;
import fr.formation.inti.heritage.Point3;

// On souhaite réaliser une classe Cercle disposant des méthodes suivantes :
//	 1_ constructeur recevant en argument les coordonnées du centre
//	 du cercle et son rayon,
// 	 2_ deplaceCentre pour modifier les coordonnées du centre du cercle,
//	 3_ changeRayon pour modifier le rayon du cercle,
//	 4_getCentre qui fournit en résultat un objet de type 
//	 Point correspondant au centre du cercle,
//	 5_affiche qui affiche les coordonnées du centre du cercle 
//	 et son rayon.
//	
// 1. Définir la classe Cercle comme classe dérivée de Point
// 2. Définir la classe Cercle comme possédant un membre de type Point.
//
// Dans les deux cas, on écrira un petit programme mettant en jeu les différentes fonctionnalités de la classe Cercle.

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
