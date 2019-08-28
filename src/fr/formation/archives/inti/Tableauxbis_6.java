package fr.formation.archives.inti;

import java.util.Scanner;

public class Tableauxbis_6 {

//une méthode aurait simplifié le code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez un verbe du 1er groupe");
		String ch1 = new String (sc.next());
		while ((ch1.charAt(ch1.length()-2) != 'e')||((ch1.charAt(ch1.length()-1) != 'r'))) {
			System.out.println("Ca n'est pas un verbe du premier groupe. Recommencez");
			ch1 = new String (sc.next());
		}
		System.out.print("Je ");
		for (int i=0; i<ch1.length()-2;i++) {
			System.out.print(ch1.charAt(i));			
		}
		System.out.println("e");
			
		System.out.print("Tu ");
		for (int i=0; i<ch1.length()-2;i++) {
			System.out.print(ch1.charAt(i));			
		}
		System.out.println("es");
		
		System.out.print("Il ");
		for (int i=0; i<ch1.length()-2;i++) {
			System.out.print(ch1.charAt(i));			
		}
		System.out.println("e");
		
		System.out.print("Nous ");
		for (int i=0; i<ch1.length()-2;i++) {
			System.out.print(ch1.charAt(i));			
		}
		System.out.println("ons");
		
		System.out.print("Vous ");
		for (int i=0; i<ch1.length()-2;i++) {
			System.out.print(ch1.charAt(i));			
		}
		System.out.println("ez");
		
		System.out.print("Ils ");
		for (int i=0; i<ch1.length()-2;i++) {
			System.out.print(ch1.charAt(i));			
		}
		System.out.println("ent");
		
		sc.close();
		}
}


