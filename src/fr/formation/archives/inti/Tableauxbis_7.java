package fr.formation.archives.inti;

import java.util.Scanner;

public class Tableauxbis_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("combien de mots voulez vous trier ?");
		int nb = sc.nextInt();
		String t[] = new String[nb];
		int t3[] = new int[nb];
		String t4[] = new String[nb];
		int max = 1;
		int mini = 9998;

		// Demande nb mots, les places dans un tableau
		// et repere le maximum de lettre
		for (int i = 0; i < nb; i++) {
			System.out.println("Donnez un mot");
			t[i] = new String(sc.next());
			if (t[i].length() >= max) {
				max = t[i].length();
			}
		}

		int t2[][] = new int[nb][nb];
		for (int i = 0; i < nb; i++) {
			for (int j = 0; j < nb; j++) {
				t2[i][j] = t[i].compareToIgnoreCase(t[j]);
				if (t2[i][j] < 0) {
					t3[i] = t3[i] - 1;
				} else if (t2[i][j] > 0) {
					t3[i] = t3[i] + 1;
				}

			}
		}
		int j=0;
		for (int x = 0; x < nb; x++) {
			mini=9998;
			for (int i = 0; i < nb; i++) {
				if (t3[i] < mini) {
					mini = t3[i];
					j = i;
					System.out.println(j);
				}
			}
			t4[x] = t[j];
			t3[j] = 9999;
			
			printTableaud(t2);
			printTableau(nb, t3);
			printTableauSt(nb, t4);
			sc.close();
		}
	}

	// cette méthode affiche les tableaux de tableaux de type int
	public static void printTableaud(int[][] t3) {

		System.out.print("t2 = ");
		for (int i = 0; i < t3.length; i++) {
			for (int j = 0; j < t3[i].length; j++) {
				System.out.print(t3[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printTableau(final int N, int[] t1) {
		System.out.print("t1 = ");
		for (int i = 0; i < N; i++) {
			System.out.println(t1[i] + " ");
		}
		System.out.println();
	}

	public static void printTableauSt(final int N, String[] t1) {
		System.out.print("t1 = ");
		for (int i = 0; i < N; i++) {
			System.out.println(t1[i] + " ");
		}
		System.out.println();
	}
}
