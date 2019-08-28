package fr.formation.archives.inti;
import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		int jour;
		int heure;
		int temps;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduire le jour de la semaine");
		jour = sc.nextInt();
		System.out.println("Introduire l'heure du jour");
		heure = sc.nextInt();
		
		switch (jour) {
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 : if (0<heure && heure < 24) {
			if ((8<=heure && heure<=12) || (14<=heure && heure<=18)){
				System.out.println("Bon travail");
				temps = 24*(jour-1)+heure;
				System.out.println(temps + " heures ont été écoulées depuis le début de la semaine.");
			
				} else {
				System.out.println("Bon repos");
				temps = 24*(jour-1)+heure;
				System.out.println(temps + " heures ont été écoulées depuis le début de la semaine.");
				} 
			
			}else {
			System.out.println("Cette heure n'existe pas");
			}
			
			break;
		case 6 :
		case 7 : System.out.println("Bon week-end");
		break;
		default : System.out.println("Ce jour n'existe pas");
		break;
		
		}
		sc.close();
		
	}

}
