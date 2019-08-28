package fr.formation.archives.inti;

import java.util.ArrayList;

// R�aliser une classe nomm�e ListeTiee permettant de manipuler une liste de chaine de caract�res,
// en s'arrangeant pour qu'elle soit tri�e en permanence. 
// Outre le constructeur, on la dotera des m�thodes : 
//	 1_ ajoute qui ajoute un nouvel �l�ment � la bonne place. 
//	 2_ affiche qui affiche les �l�ments de la liste.

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
