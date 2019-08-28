package fr.formation.archives.inti;

import java.util.Scanner;


public class Exercice5 {

	public static void main(String[] args) {
		
		 //Premier programme
		 
		  char car = 'A';
		 
		  int i = 1;
		 
		   for (i = 1; i <= 10; i++) {	
		 		car = 'A';
		 		System.out.print(car + " ");
		 		while (car != 'Z') {
		 			car++;
		 			System.out.print(car + " ");
		 			if (car == 'Z') {
		 				System.out.println();
		 		}
		 		}
		 			
		   }
		 
		//deuxième programme
		
		char car2 = 'A';
		int i2;
		int j;
		System.out.println(car2);
		for (i2 = 1; i2 < 10; i2++) {
			j=0;
			while (j<i2) {
				System.out.print(" ");
				j++;
			}
			car2++;
			System.out.println(car2);
			
			
			
				
		}
		
		
		// Troisième programme
		
		int intermediaire;
		int nombre;
		int factoriel;
		String reponse;
		
		Scanner sc = new Scanner (System.in);
		reponse = "a";
		
		while (reponse.charAt(0)!='q' & reponse.charAt(0)!='Q') {
			System.out.println("introduire la valeur à calculer");
		    nombre = sc.nextInt();
		    if (nombre >= 0) {
		    	factoriel = 1;
		    	for (intermediaire=1; intermediaire <=nombre;intermediaire++) {
		    		factoriel = factoriel * intermediaire;
		    		}System.out.println("Le factoriel de " + nombre + " est " + factoriel);
		    	} else {
		    		System.out.println("Le nombre introduit est inccorect");
			}
		    System.out.println("Voulez vous continuer (Q pour quitter)");
		    
		    reponse = sc.next();
		    
		    
		    
		    
		}
		    
		sc.close();
		
	}
}
