package fr.formation.archives.inti;


// On souhaite disposer d�une hi�rarchie de classes 
// permettant de manipuler des figures g�om�triques. 
// On veut qu�il soit toujours possible d��tendre la hi�rarchie
// en d�rivant de nouvelles classes mais on souhaite pouvoir imposer
// que ces derni�res disposent toujours des m�thodes suivantes :
//	 1_ void affiche () 
//	 2_ void homothetie (double coeff)
//	 3_ void rotation (double angle)
//	
// �crire la classe abstraite Figure qui pourra servir de 
// classe de base � toutes ces classes.

public abstract class Figure {
	
	protected abstract void affiche() ;
	protected abstract void homothetie(double coeff) ;
	protected abstract void rotation(double angle) ;
	
	
}
