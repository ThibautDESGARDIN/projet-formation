package fr.formation.archives.inti;

import java.util.ArrayList;

// Réaliser une classe nommée ListeTiee permettant de manipuler une liste de chaine de caractères,
// en s'arrangeant pour qu'elle soit triée en permanence. 
// Outre le constructeur, on la dotera des méthodes : 
//	 1_ ajoute qui ajoute un nouvel élément à la bonne place. 
//	 2_ affiche qui affiche les éléments de la liste.

public class ListeTiee {
	ArrayList<String> liste = new ArrayList<String>();

	public ListeTiee(String mot) {
		liste.add(mot);
	}

	public void ajoute(String mot) {
		int i = 0;
		for (String a : liste) {

			if (mot.compareToIgnoreCase(a) < 0) {
				liste.add(i, mot);
				break;
			} else {
				i++;
				if (i == liste.size()) {
					liste.add(mot);
					break;
				}
			}
		}
	}

	public void affiche() {
		for (String a : liste) {
			System.out.println(a);
		}

	}

}
