package fr.formation.archives.inti;

public class Tableaux_6 {

	public static void main(String[] args) {
		final int N = 4;
		int t1[]= new int [N];
		int t2[]= new int [N];
		
		//Affectation pour tableau 1
		for (int i=0; i <N; i++) {t1[i]=i+1;}
		//Affectation pour tableau 2
		for (int i=0; i <N; i++) {t2[i]=2*i+1;}
		
		//affichage
		printTableau(N, t1);
		printTableau(N, t2);
		
		t1=t2;
		t1[0]=10; 
		t2[1]=20; 
		t1[2]=30; 
		t2[3]=40; 
		
		printTableau(N, t1);
		printTableau(N, t2);
			
	}

		

	public static void printTableau(final int N, int[] t1) {
		System.out.print("t1 = ");
		for (int i=0; i <N; i++) {System.out.println(t1[i]+" ");}
		System.out.println();
	}

}	
