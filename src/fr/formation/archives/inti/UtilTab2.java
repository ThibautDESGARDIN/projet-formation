package fr.formation.archives.inti;

import java.util.Scanner;


public class UtilTab2 {

	public static void main(String[] args) {
		/*  Écrire une classe utilitaire UtilTab disposant des méthodes statiques suivantes :
		 * 1_ genere qui fournit en retour un tableau des n premiers nombres impairs, la valeur de n étant fournie en argument. 
		 * 
		 * 2_somme qui reçoit en argument deux vecteurs d’entiers de même taille et qui fournit en retour 
		 * un tableau représentant la somme de ces deux vecteurs.
		 * 
		 * Écrire un petit programme d’essai. 
		 * Pour faciliter les choses, on pourra également doter la classe UtilTab d’une méthode d’affichage des valeurs d’un tableau de réels
		*/
	
		int N;
		int i =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de nombres impairs voulez vous ?");
		N = sc.nextInt();
		
		double t1[]= new double [N];
		
		
		
		
		//appelle les méthodes construites plus bas
		genere(N, i, t1);
		System.out.println();
		printTableau(N, t1);
		System.out.println();
		System.out.println("Quelle est la taille des vecteurs ?");
		N = sc.nextInt();
		somme(N,t1);
		System.out.println();
		System.out.println("La somme des deux vecteurs donne le tableau suivant :");
		printTableau(N, t1);
		System.out.println();
		sc.close();
		
	}

		
		//méthode d'affichage
	public static void printTableau(final int N, double[] t1) {
		System.out.println("t1 = ");
		for (int i=0; i <N; i++) {System.out.println(t1[i]+" ");}
		System.out.println();
	
	}
		//méthode de somme de deux tabeaux
	public static void somme(final int N, double[] t1) {
		int i =0;
		Scanner sc = new Scanner(System.in);
		double vect[] = new double [N]; 
		double vect2[] = new double [N]; 
		for (i=0; i<N; i++) {
			System.out.println("Entrez une valeur pour le vecteur 1");
			vect[i]=sc.nextDouble();
		}
		for (i=0; i<N; i++) {
			System.out.println("Entrez une valeur pour le vecteur 2");
			vect2[i]=sc.nextDouble();
		}
		for (i=0; i<N; i++) {
		t1[i]=vect[i]+vect2[i];
		}
		
	sc.close();
	}
	
	
		//méthode d'affectatin des N premiers impairs dans tableau
	public static void genere(final int N, int i, double[] t1) {
		t1[0]=1;
		for (i=1; i <N; i++) {
				t1[i]=t1[i-1]+2;
			}
		}
		
	
			
	
}
	

