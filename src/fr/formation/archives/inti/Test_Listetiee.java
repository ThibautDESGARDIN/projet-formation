package fr.formation.archives.inti;

public class Test_Listetiee {

	public static void main(String[] args) {
		ListeTiee liste = new ListeTiee("eglise");
		
		liste.ajoute("avion");
		liste.ajoute("camion");
		liste.ajoute("roi");
		liste.ajoute("bateau");
		liste.ajoute("arbre");
		liste.affiche();
		System.out.println();
		liste.ajoute("mufasa");
		liste.affiche();
		
		

	}

}
