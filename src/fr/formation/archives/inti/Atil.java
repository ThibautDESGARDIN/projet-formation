package fr.formation.archives.inti;

//
public class Atil {
	
	public static int ackermann(int n, int m) {
		
		if (n == 0) {
			return (m + 1);
		} else if (m == 0) {
			return ackermann(n - 1, 1);
		} 
			return ackermann(n - 1, ackermann(n, m - 1));
		
	}
}
class ClasseObjets_8 {

	public static void main(String[] args) {
		System.out.println(Atil.ackermann(3, 2));
	}

}
//	public int util(int m, int n) {
//		int t[][] = new int[m][n];
//		m= 4;
//		n=1;
//		
//		if (m < 0 || n < 0) {
//			System.out.println("erreur");
//		} else {
//			for (int i = 0; i < m; i++) {
//				for (int j = 0; j < n; j++) {
//
//					if (i == 0 & j >= 0) {
//						t[i][j] = j + 1;
//					} else
//						while (i != 0) {
//							if (i > 0 & j == 0) {
//								t[i][j] = t[i - 1][1];
////								i = i-1;
////								j=1;
//							} else if (i > 0 & j > 0) {
//								//le probleme vient du t[i][j-1] ici
//								t[i][j] = t[i - 1][t[i][j - 1]];
////								i = i-1;
////								j=t[i][j-1];
//								
//							}
//
//						}
//					
//				}
//			}
//		}
//		System.out.println("t =" + t[m-1][n-1]);
//		return (t[m][n]);
//	}
//}
