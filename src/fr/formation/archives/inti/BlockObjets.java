package fr.formation.archives.inti;

public class BlockObjets {
	
		// une fois qu'un objet est instanci�, c'est cet objet qui est utilis� � chaque fois
		// impossible d'instancier un 2nd objet tant que le premier existe

	public static void main(String[] args) {
		
			
	}

}

class Objet {
	private Objet () {this.numero = numero + 1;}
	public static int numero;
}
