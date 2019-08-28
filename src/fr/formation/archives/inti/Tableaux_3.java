package fr.formation.archives.inti;

import java.util.Scanner;

public class Tableaux_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float T[]= {1,2,3,4,5};
		int i;
		float somme, moyenne, max, min;
		
		System.out.println("Donnez 5 valeurs flotantes");
		for (i=0; i<5; i++){
			 T[i] = sc.nextFloat();
		}
		
		i=0;
		somme=0;
		max=0;
		min=99999999;
		
		for (i=0; i<5; i++){
			somme=somme+T[i];
			if (T[i]>max) {
				max=T[i];	
			}
			if (T[i]<min) {
				min=T[i];	
			}
		}
		moyenne = somme/5;
		System.out.println("La moyenne est " + moyenne);
		System.out.println("Le max est " + max);
		System.out.println("La min est " + min);
		sc.close();

	}

}
