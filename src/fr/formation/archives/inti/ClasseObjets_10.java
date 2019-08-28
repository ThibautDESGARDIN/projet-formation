package fr.formation.archives.inti;

import java.util.Scanner;

//	Réaliser une classe qui permet d'attribuer un numéro unique à chaque nouvel objet créé
//	(1 au premier, 2 au suivant..) 
//	On ne cherchera pas à réutiliser les numéros d'objets éventuellement détruits. 
//	On dotera la classe uniquement d'un constructeur, d'une méthode getIdent 
//	getIdent fournissant le numéro attribué à l'objet 
//	une méthode getIdentMax fournissant le numéro du premier objet créé. 
//	
//	Écrire un petit programme d'essai

class Inde {

	
	public static int numero;
	public int numiden;
	static{  
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
		while (num <=0){
			System.out.println("Donnez le numero du premier objet");
			num = sc.nextInt();
			}
	numero = num;
	sc.close(); 
	}

	public Inde() {

		this.numero = numero + 1;
		numiden = numero;
	}

	public int getIden() {
		return numiden;
	}

	public static int getIdenMax() {
		return numero;
	}
	
}

public class ClasseObjets_10 {

	public static void main(String[] args) {
		System.out.println("Donnez le numero du premier objet");
		Inde a = new Inde();
		System.out.println(a.getIden());
		Inde b = new Inde();
		b=a;
		Inde c = new Inde();
		Inde b1 = new Inde();
		Inde c1 = new Inde();
		System.out.println(b.getIden());
		System.out.println(c.getIden());
		System.out.println(Inde.getIdenMax());
		

	}
}
