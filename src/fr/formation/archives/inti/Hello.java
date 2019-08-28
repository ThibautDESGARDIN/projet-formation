package fr.formation.archives.inti;

import java.util.Scanner;

/**
 * 
 * @author IN-LL-037
 *
 */

public class Hello {

	public static void main(String[] args) {
		System.out.println("Bonjour !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez a");
		int a = sc.nextInt();
		
		/** 
		 * On aurait pu écrire
		 * int a;
		 * a = sc.nextInt();
		 * On ne déclare qu'une fois a
		 */
		
		System.out.println("Entrez b");
		int b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + somme(a,b));
		
		/**
		 * Sous cette forme, l'addition ne marche pas
		 * System.out.println(a + " + " + b + " = " + a+b);
		 */
		
		sc.close();

	}
	
	public static int somme(int a, int b) {
		return a+b;
	}	
}
