package fr.formation.archives.inti;

public class testPnt {

	public static void main(String[] args) {
		
		System.out.println("Point a : ");
		Point_2 a;
		a = new Point_2(3, 5);	a.abscisse(); a.ordonnee();
		System.out.println();
		System.out.println("Point a : ");
		a.deplace(2, 0);		a.abscisse(); a.ordonnee();
		System.out.println();
		System.out.println("Point b :");
		Point_2 b = new Point_2 (6, 8);	b.abscisse(); b.ordonnee();
		
		
		
		

	}

}
