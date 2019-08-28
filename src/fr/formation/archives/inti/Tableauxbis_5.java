package fr.formation.archives.inti;

import java.util.Scanner;

public class Tableauxbis_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez un mot");
		String ch1 = new String (sc.next());
		System.out.println("il comporte");
		char []t1= {'a','e','i','o','u','y'};
		int []t2= {0,0,0,0,0,0};
		for (int j=0; j<t1.length;j++) {
			for (int i=0; i<ch1.length(); i++) {
				if (ch1.charAt(i)==t1[j]) {
					t2[j]=t2[j]+1;
					
				}
			}
		System.out.println(t2[j] + " fois la lettre " + t1[j]);
			
			
			}
		sc.close();
		}
		
	}


