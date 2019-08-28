package fr.formation.archives.inti;

import java.util.Scanner;

public class Tableauxbis_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez un nombre entier");
		String ch1 = new String (sc.nextLine());
		for (int i=0; i<ch1.length(); i++) {
			System.out.println(ch1.charAt(i));
		}
		
		sc.close();

	}

}
