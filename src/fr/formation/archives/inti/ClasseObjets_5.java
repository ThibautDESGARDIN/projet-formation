package fr.formation.archives.inti;

class Point_2 {

	public Point_2(int abs, int ord) {x = abs; y=ord;}
	public void deplace(int dx, int dy) {x +=dx; y += dy;}
	public void abscisse() {
		System.out.println("je suis un point d'abscisse : " + x);
	}
	public void ordonnee() {
		System.out.println("je suis un point d'ordonnée : " + y);
	}
	private double x;
	private double y;

}
