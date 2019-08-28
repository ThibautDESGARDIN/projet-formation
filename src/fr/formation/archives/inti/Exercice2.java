package fr.formation.archives.inti;

public class Exercice2 {

	public static void main(String[] args) {
		//Exercices Java
		//Excercice 2
		
		int a =5;
		int b =2;
		int i;
		int j;
		boolean k;
		
		j=3*(i=a+b);
		System.out.println("j = " + j);
		i *=7;
		System.out.println("i = "+ i);
		j %=3;
		System.out.println("j = "+ j);
		i *=j +=2;
		System.out.println("i = "+ i);
		i= a + ++b;
		System.out.println("i = "+ i);
		i= a++ + b;
		System.out.println("i = "+ i);
		i=a+++b;
		System.out.println("i = "+ i);
		k=a==7 && b!=2;
		System.out.println("k est "+ k);
		k= !(!(a<=5) && !(b>2));
		System.out.println("k est "+ k);
		k= (a==5) || (b==0);
		System.out.println("k est "+ k);
		k= !(0 < a) && !(a < 100) && !(100<b);
		System.out.println("k est "+ k);
		
		
			
	}

}
