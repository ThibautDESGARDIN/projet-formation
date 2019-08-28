package fr.formation.archives.inti;

import java.util.ArrayList;
import java.util.Iterator;

// On dispose d'un objet tab déclaré ainsi : ArrayList<Integer> tab;
//
// Ecrire les instructions réalisant les actions suivantes sur les valeurs de tab :
//	 1_affichage dans l'ordre naturel.
//	 2_affichage dans l'ordre inverse. 
//	 3_affichage des éléments dans rang pair(0, 2, 4...) 
//	 4_mise à zéro des éléments de valeur négative.

public class Collection_2 {

	public static void main(String[] args) {
		ArrayList<Integer> tab = new ArrayList<Integer>();
		ArrayList<Integer> tab2 = new ArrayList<Integer>();
		ArrayList<Integer> tab3 = new ArrayList<Integer>();
		tab.add(6);
		tab.add(5);
		tab.add(2);
		tab.add(-2);
		tab.add(0);
		tab.add(16);
		System.out.println(tab);
		Iterator<Integer> it = tab.iterator();
		for (int i = tab.size() - 1; i >= 0; i--) {
			tab2.add(tab.get(i));

		}
		System.out.println(tab2);

		for (int i = 0; i < tab.size() - 1; i += 2) {
			tab3.add(tab.get(i));

		}
		System.out.println(tab3);

		for (int i = 0; i < tab.size() - 1; i++) {
			if (tab.get(i) < 0)
				tab.set(i, 0);

		}
		System.out.println(tab);
	}

}
