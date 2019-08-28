package fr.formation.archives.inti;

public class Tableauxbis_2 {

	public static void main(String[] args) {
		String ch1 = new String ("hrllo");
			System.out.println(ch1);	
		String ch2 = new String (ch1);
		ch1 = "lol";
		System.out.println(ch1 + ch2);
		ch2=ch1;
		ch1 = "int";
		System.out.println(ch1 + ch2);
	}

}
