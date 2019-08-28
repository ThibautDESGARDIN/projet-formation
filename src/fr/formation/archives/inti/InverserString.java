package fr.formation.archives.inti;

import java.util.Scanner;

public class InverserString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un mot");
		String mot = sc.next();
		char[] t = new char[mot.length()];
		//on met la premiere lettre du mot dans la derniere case du tableau
		//ainsi de suite jusqu'a la derniere lettre dans la premiere case du tableau
		for (int i = 0; i < mot.length(); i++) {
			t[mot.length() - (i + 1)] = mot.charAt(i);

		}
		System.out.println("Le mot mirroir est");
		for (int i = 0; i < mot.length(); i++) {
			System.out.print(t[i]);

		}
		sc.close();

	}
}
