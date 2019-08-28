package fr.formation.inti.poo;

public class Stagiaire {
		
		//les attributs sont toujours priv�s
		private String nom;
		private String prenom;
		private int age;
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		
		//constructeur par d�faut
		public Stagiaire() {
			System.out.println("constructeur par d�faut");
		}
		

		//autre constructeur
		public Stagiaire(String nom, String prenom) {
			System.out.println("nom : " + nom + ", pr�nom : " + prenom);
			
		}
		
		public void affichage() {
			System.out.println("exemple de m�thode");
		}
			
}
