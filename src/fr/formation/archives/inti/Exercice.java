package fr.formation.archives.inti;

public class Exercice {

	public static void main(String[] args) {
		//Exercices Java
		//Excercice 1
		
		//i transformé en double
		double i;
		int j =3;
		int k =5;
		double d;
		double e =1.5;
		double f = 2.3;
		char car = 'A';
		
		i = k/j;
		System.out.println(i);
		i= k%j;
		System.out.println(i);
		i=k/j + k%j;
		System.out.println(i);
		
		d=f/e;
		System.out.println(d);
		d=j/e + k/f;
		System.out.println(d);
		d=f/e + k/j;
		System.out.println(d);
		
		i=(j/e) + (k/f);
		System.out.println(i);
		i=f/e +k/j;
		System.out.println(i);
		
		// autre systeme d'incrémentation pour car
		car++;
		System.out.println(car);
		
		//on comprend qu'une valeur est associée à car (66 pour A)
		i=car +2;
		System.out.println(i);
		
		//peut etre traduit par 67 + (1-66)
		car= 'B'+ ('a'-'A');
		System.out.println(car);
		
	}

}
