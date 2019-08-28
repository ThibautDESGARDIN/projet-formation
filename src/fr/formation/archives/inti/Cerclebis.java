package fr.formation.archives.inti;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

// Ecrire les instructions permettant de trier, sans modifier la classe Cercle,
// un tableau( de type ArrayList) d'objets de Cercle : 
//	 1_ suivant les valeurs croissantes de leur rayon. 
//	 2_ suivant les valeurs croissantes de leur abscisse.

public class Cerclebis implements Comparable {

	private int x, y;
	double rayon;

	public Cerclebis(int x, int y, double rayon) {
		this.x = x;
		this.y = y;
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [x=" + x + ", y=" + y + ", rayon=" + rayon + "]";
	}

	public void affiche() {
		System.out.println("Coordonn�es : " + x + ", " + y + "; rayon : " + rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public int getX() {
		return x;
	}

	@Override
	public int compareTo(Object o) {
//		if (o.getClass().equals(Cerclebis.class)) {
			// Nous allons trier sur les rayons
			Cerclebis cd = (Cerclebis) o;
			return Double.compare(this.rayon, cd.getRayon());
		}
//		return -1;
//	}



}

