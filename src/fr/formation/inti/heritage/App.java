package fr.formation.inti.heritage;


class Point {
	public void initialise(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void deplace(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	private int x, y;
}

class PointA extends Point {

	public PointA() {
	}

	public void affiche() {
		System.out.println("Les coordonnées du point sont : "+ super.getX() + ", " + super.getY());
	}
	//sans getX() et getY() on ne pourrait pas créer la méthode affiche dans PointA
}






public class App {
	public static void main(String[] args) {

//utilise classes de exo 1
	PointA a = new PointA();
	a.initialise(40, 5);
	a.deplace(-1, 3);
	a.affiche();
	
//utilise classes de exo 2
	PointNom point = new PointNom(14, 61,"point");
	point.affCoordNom();
	
//utilise classes de exo 3
	PointNom2 point2 = new PointNom2(20, 22,"point2");
	point2.affiche();
	
 }
}



