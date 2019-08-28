package fr.formation.archives.inti;

public class ClasseObjets_1 {

//	Réaliser une classe Point permettant de représenter un point sur un axe. 
//	Chaque point sera caractérisé par un nom(de type char) et une abscisse( de type double). On prévoira : 
//	1_ un constructeur recevant en arguments le nom de l'abscisse d'un point. 
//	2_ une méthode affiche imprimant( en fenêtre console) le nom du point et son abscisse. 
//	3_ une méthode translate effectuant une translation définie par la valeur de son argument. 
//	
//	Écrire un petit programme utilisant cette classe pour créer un point, en afficher les caractéristiques, 
//	le déplacer et en afficher à nouveau les caractéristiques

	public static void main(String[] args) {
		Point a = new Point('a',1.7);
		a.affiche();
		a.translate(2.7);
		a.affiche();
		
		

	}

}
