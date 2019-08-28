package fr.formation.archives.inti;


// On souhaite disposer d’une hiérarchie de classes 
// permettant de manipuler des figures géométriques. 
// On veut qu’il soit toujours possible d’étendre la hiérarchie
// en dérivant de nouvelles classes mais on souhaite pouvoir imposer
// que ces dernières disposent toujours des méthodes suivantes :
//	 1_ void affiche () 
//	 2_ void homothetie (double coeff)
//	 3_ void rotation (double angle)
//	
// Écrire la classe abstraite Figure qui pourra servir de 
// classe de base à toutes ces classes.

public abstract class Figure {
	
	protected abstract void affiche() ;
	protected abstract void homothetie(double coeff) ;
	protected abstract void rotation(double angle) ;
	
	
}
