package fr.formation.archives.inti;

public class Point {

//		R�aliser une classe Point permettant de repr�senter un point sur un axe. 
//		Chaque point sera caract�ris� par un nom(de type char) et une abscisse( de type double). On pr�voira : 
//		1_ un constructeur recevant en arguments le nom de l'abscisse d'un point. 
//		2_ une m�thode affiche imprimant( en fen�tre console) le nom du point et son abscisse. 
//		3_ une m�thode translate effectuant une translation d�finie par la valeur de son argument. 
//		
//		�crire un petit programme utilisant cette classe pour cr�er un point, en afficher les caract�ristiques, 
//		le d�placer et en afficher � nouveau les caract�ristiques

	protected char nom;
	protected double abscisse;

	public Point() {
		
	}

	public Point(char nom, double abscisse) {
		this.abscisse = abscisse;
		this.nom = nom;

	}

	public void affiche() {
		System.out.println("Le point " + nom + " � pour abscisse " + abscisse);
	}

	public void translate(double n) {
		abscisse = abscisse + n;
	}

}