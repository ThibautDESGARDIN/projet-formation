package fr.formation.archives.inti;

import fr.formation.inti.heritage.Point3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c = new  Cercle(1,2,3);
		Cercle2 c2 = new Cercle2(4,4,12);

		
		
		System.out.println(c.toString());
		Point3 o = c.getCentre();
		Point3 o2 = c2.getCentre();
		
		System.out.println(o);
		System.out.println(o2);
		
		c.changeRayon(2);
		c.deplaceCentre(-3, 3);
		c2.changeRayon(-8);
		c2.deplaceCentre(0, 2);
		System.out.println(o);
		System.out.println(o2);
	}

}
