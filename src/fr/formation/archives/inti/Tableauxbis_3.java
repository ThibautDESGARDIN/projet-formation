package fr.formation.archives.inti;

import java.util.Scanner;

public class Tableauxbis_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch1 = new String (sc.nextLine());
		for (int i=0; i<ch1.length(); i+=2) {
			System.out.print(ch1.charAt(i));
		}
		System.out.println();
		System.out.print(ch1.charAt(0));
		System.out.println(ch1.charAt(ch1.length()-1));
		sc.close();

	}

}
