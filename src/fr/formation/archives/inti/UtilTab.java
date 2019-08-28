package fr.formation.archives.inti;

import java.util.Scanner;

public class UtilTab {

	public static void main(String[] args) {
		/* Écrire une classe utilitaire UtilTab disposant des méthodes statiques suivantes :
		 * 1_ somme qui fournit la somme des valeurs d’un tableau de réels (double) de taille quelconque 
		 * 2_incre qui incrémente d’une valeur donnée toutes les valeurs d’un tableau de réels(double). 
		 * Écrire un petit programme d’essai. 
		 * Pour faciliter les choses, on pourra également doter la classe UtilTab d’une méthode d’affichage des valeurs d’un tableau de réels
		*/
	
		final int N;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez la taille du tableau");
		N = sc.nextInt();
		
		double t1[]= new double [N];
		
		//Affectation pour tableau 
		for (int i=0; i <N; i++) {
			System.out.println("Entrez la prochaine valeur");
			t1[i]=sc.nextDouble();
			}
		
		//fais appel aux méthodes construites plus bas
		printTableau(N, t1);
		System.out.println();
		somme(N, t1);
		System.out.println();
		incr(N,t1);
		System.out.println();
		printTableau(N, t1);
		
		sc.close();
		
	}

		
		//méthode d'affichage
	public static void printTableau(final int N, double[] t1) {
		System.out.print("t1 = ");
		for (int i=0; i <N; i++) {System.out.println(t1[i]+" ");}
		System.out.println();
	
	}
		//méthode de somme des valeurs du tableau
	public static void somme(final int N, double[] t1) {
		double sum = 0;
		for (int i=0; i <N; i++) {sum = sum + t1[i];}
		System.out.println("La somme des valeurs du tableaux vaut :" + sum);
	
	}
	 //méthode d'incrémentation des valeurs du tableau
	public static void incr(final int N, double[] t1) {
		Scanner sc = new Scanner (System.in);
		System.out.println("De combien voulez vous incrementer les valeurs du tableau ?");
		double inc = sc.nextDouble();
		for (int i=0; i <N; i++) {t1[i] = t1[i] + inc;}
		sc.close();
		
	
	}
	
}
