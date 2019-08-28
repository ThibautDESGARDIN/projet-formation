package fr.formation.archives.inti;

import java.util.Scanner;

public class Tableauxbis_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nombre de colonnes");
		final int N = sc.nextInt();
		System.out.println("Nombre de lignes");
		final int M = sc.nextInt();
		double t[][]= new double [N][M];
		double t1[][]= {{1,2,3},{1,2,2}};
		double t2[][]= {{1,2,4},{1,2}};
	
		
		//Affectation pour tableau 1 de dimension N*M
		//pour chaque ligne
		for (int j=0; j<M;j++) {
			//pour chaque colonne
			for (int i=0; i <N; i++) {t[i][j]=i+j+1;}
		}	
		
		
		//affichage
		affiche(N, M, t);
		System.out.println();
		
		System.out.println("t1 est il régulier ?");
		System.out.println(isRegulier(t1));
		System.out.println();
		
		System.out.println("La somme des lignes de t1 est :");
		//affichage des resultats de la méthode sommeLigne 
		//par le biais de la méthode printTableau
		printTableau(sommeLignes(t1));
		
		System.out.println("la somme des tableaux t1 et t2 est :");
		affiche(t1.length, t1[0].length, somme(t1,t2));
		
		sc.close();
		
	
	}	

	
//cette méthode affiche un tableau de tableau double
//un tableau de tableau est un tableau à 2 dimensions
//ex : t1[][]={{1,2,3},{4,5,6}}
	public static void affiche(final int N, final int M, double[][] t) {
		System.out.println("t = ");
		if (t==null) {
			System.out.println("Le tableau est nul");
		} else {
		for (int j=0; j<M;j++) {
			for (int i=0; i <N; i++) {System.out.print(t[i][j]+" ");}
			System.out.println();
			}
		}
		}
	
	
//cette méthode vérifie qu'un tableau double est régulier
//cad que chaque ligne contient le même nombre de valeur
	public static boolean isRegulier(double[][]t1) {
		int t3[]= new int [t1.length];
		int i = 0 ;
		for (double t2[] : t1) {
			t3[i] = t2.length;
			
			i++;
		}
		for (int j=0; j<t3.length; j++) {
			if (t3[0]!=t3[j]) {
				return false;
			}

		}
		return true;
				
	}
	
//cette méthode additionne les valeurs des lignes d'un tableau double
	public static double[] sommeLignes(double [][] t1) {
		double t3[]=new double [t1.length];
		int j=0;
		for (double t2[] : t1) {
			for (int i=0; i<t2.length;i++) {
				t3[j]=t3[j]+t2[i];	
			}
		j++;	
		}
		return t3;
	}	
		
//cette méthode affiche les tableaux de type double
	public static void printTableau(double [] t3) {
		System.out.print("t3 = ");
		for (int i=0; i <t3.length; i++) {System.out.println(t3[i]+" ");}
		System.out.println();
	}
	
	
//cette méthode s'assure que :
//t1 et t2 sont réguliers
//t1 et t2 sont de même dimensions
//
//ensuite la méthode fournit 
//la somme de t1 et t2 si les conditions sont respectées
//une valeur nulle sinon	
	public static double[][] somme(double [][]t1, double [][]t2){
		double [][] t3= new double [t1.length] [t1[0].length];
		if (isRegulier(t1) & isRegulier(t2)) {
			if ((t1.length==t2.length)&(t1[0].length==t2[0].length)) {
				for (int i=0; i<t1.length; i++) {
					for (int j=0; j<t1[i].length;j++) {
						t3[i][j]=t1[i][j]+t2[i][j];
					}
				}
				return t3;
			}
			else {
				return t3=null;
			}
		}	
		else {
			return t3=null;
		}
		
	}
}


