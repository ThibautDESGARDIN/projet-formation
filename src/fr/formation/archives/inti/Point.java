package fr.formation.archives.inti;

public class Point {

//		Réaliser une classe Point permettant de représenter un point sur un axe. 
//		Chaque point sera caractérisé par un nom(de type char) et une abscisse( de type double). On prévoira : 
//		1_ un constructeur recevant en arguments le nom de l'abscisse d'un point. 
//		2_ une méthode affiche imprimant( en fenêtre console) le nom du point et son abscisse. 
//		3_ une méthode translate effectuant une translation définie par la valeur de son argument. 
//		
//		Écrire un petit programme utilisant cette classe pour créer un point, en afficher les caractéristiques, 
//		le déplacer et en afficher à nouveau les caractéristiques

	protected char nom;
	protected double abscisse;

	public Point() {
		
	}

	public Point(char nom, double abscisse) {
		this.abscisse = abscisse;
		this.nom = nom;

	}

	public void affiche() {
		System.out.println("Le point " + nom + " à pour abscisse " + abscisse);
	}

	public void translate(double n) {
		abscisse = abscisse + n;
	}

}