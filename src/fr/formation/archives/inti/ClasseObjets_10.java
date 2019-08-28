package fr.formation.archives.inti;

import java.util.Scanner;

//	R�aliser une classe qui permet d'attribuer un num�ro unique � chaque nouvel objet cr��
//	(1 au premier, 2 au suivant..) 
//	On ne cherchera pas � r�utiliser les num�ros d'objets �ventuellement d�truits. 
//	On dotera la classe uniquement d'un constructeur, d'une m�thode getIdent 
//	getIdent fournissant le num�ro attribu� � l'objet 
//	une m�thode getIdentMax fournissant le num�ro du premier objet cr��. 
//	
//	�crire un petit programme d'essai

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
