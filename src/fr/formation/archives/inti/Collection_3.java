package fr.formation.archives.inti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Ecrire les instructions permettant de trier, sans modifier la classe Cercle,
// un tableau( de type ArrayList) d'objets de Cercle : 
//	 1_ suivant les valeurs croissantes de leur rayon. 
//	 2_ suivant les valeurs croissantes de leur abscisse.

class Comparayon implements Comparator<Cerclebis> {

	@Override
	public int compare(Cerclebis o1, Cerclebis o2) {

		return Double.compare (o1.getRayon(), o2.getRayon());
	}

}

class Comparabscisse implements Comparator<Cerclebis> {

	@Override
	public int compare(Cerclebis o1, Cerclebis o2) {

		return o1.getX() - o2.getX();
	}

}

public class Collection_3 {

	public static void main(String[] args) {
		ArrayList<Cerclebis> list = new ArrayList<Cerclebis>();
		//fonctionne aussi avec :
		//List<Cerclebis> list = new ArrayList<Cerclebis>();
		
		list.add(new Cerclebis(6, 5, 2.2));
		list.add(new Cerclebis(2, 2, 1.4));
		list.add(new Cerclebis(4, -4, 2.1));
		list.add(new Cerclebis(3, 0, 3));
		list.add(new Cerclebis(5, -1, 1.8));
		list.add(new Cerclebis(1, -1, 2.7));
		list.add(new Cerclebis(5, 4, 6));

		Collections.sort(list, new Comparayon());

		System.out.println("liste ordonnée des Cercles:\n");
		for (Cerclebis o : list) {
			System.out.println(o);
//			o.affiche();
		}

		Collections.sort(list, new Comparabscisse());
		System.out.println("liste ordonnée des Cercles:\n");
		for (Cerclebis o : list) {
			System.out.println(o);
//			o.affiche();
		}
	}
}
