package fr.formation.archives.inti;

import java.util.Scanner;

public class Tableaux_2 {

	public static void main(String[] args) {
		
		int n;
		int i=1;
		int j=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez une valeur n");
		n=sc.nextInt();
		int [] t = new int[n];
		System.out.println("Combien de valeurs : " + n);
		
		while (i<=(n*2)) {
			if ((i%2)==0) {
				i++;	
			} else {
				t[j]=i*i;
				System.out.println(i +  " a pour carré " + t[j]);
				j++;
				i++;		
			}
		sc.close();
		
		}
		
			

	}

}
