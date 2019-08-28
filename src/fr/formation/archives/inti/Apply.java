package fr.formation.archives.inti;

public class Apply {

	public static void main(String[] args) {
			AnimauxHeritages a = new AnimauxHeritages(); 
			
			Chat chat = new Chat();
			
			Chien toto = new Chien();
			
			Mouton beeh = new Mouton();
			
			AnimauxHeritages [] animaux = new AnimauxHeritages[4];
			animaux[0]=a;
			animaux[1]=chat;
			animaux[2]=toto;
			animaux[3]=beeh;
			
			//polymorphisme : c prend successivement la forme de : animal chat chien et mouton
			for (AnimauxHeritages c: animaux) {
				c.affiche();
				
			}
	}

}
