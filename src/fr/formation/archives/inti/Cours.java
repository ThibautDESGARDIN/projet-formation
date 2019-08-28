package fr.formation.archives.inti;

public class Cours {

//						SOMMAIRE
//	
//	1_polymorphisme										47
//	2_red�finir une m�thode								58
//	3_surcharger une m�thode							72		
//	4_nuances : attributs et param�tres					84
//	5_constructeur et h�ritage							103
//	6_super() et this									120
//	7_class et m�thode abstraites						139
//	8_m�thode static									155
//  9_Interface											164
//	10_Boucles											179
//		10_1_For Each									181	
//	11_Liste											193
//		11_1_Tri de liste d'objets						200
//		11_2_Iterator									215
//	12_Exceptions										233
//		12_1_Try{}catch{}finally{}						249
// 	13_Scanner nextLine()								268
//  14_return dans method()								283
//  15_Binaire											292
//  16_Ecriture de fichiers								309
//	17_JDBC												319	
//		17_1_ResultatSet								337
//		17_2_R�cup�ration de l'id						348
//		17_3_executeUpdate()							359
// 	18_PritnStackTrace()								369
//	19_Dates											377

//===========================================================================================================================================

//1_polymorphisme

	/*
	 * un objet peut avoir plusieurs formes le polymorphisme est li� � l'h�ritage
	 * une classe fille a sa forme et celle de la classe m�re ex : le chien est un
	 * chien mais aussi un animal
	 */

//2_red�finir une m�thode

	/*
	 * rappelle une m�thode depuis la classe m�re m�me si aucune modification n'est
	 * apport�e, si elle est rappel� il s'agit d'une red�finition 
	 * lorsque objet.m�thode est appel�e, le programme va chercher la m�thode, 
	 * il la trouve dans la classe fille
	 * 
	 * ATTENTION : On ne peut pas red�finir une m�thode qui est private dans la
	 * classe m�re On peut �tendre la visibilit� de la m�thode (ex : from protected
	 * to public) On ne peut pas r�duire la visibilit� de la m�thode (ex : from
	 * public to protected)
	 */

//3_surcharger une m�thode

	/*
	 * dans la classe fille, on surcharge les parametres 
	 * la m�thode dans la classe fille d�pend de plus de param�tres que dans la classe m�re 
	 * ex : pour une m�thode manger() dans la classe m�re, 
	 * elle devient manger(String str) dans la classe fille
	 * 
	 * ATTENTION : cf. Red�finir une m�thode
	 */

//4_nuances : attributs et param�tres

	/*
	 * les attributs sont d�finis dans la class les param�tres sont attribu�s � une
	 * m�thode
	 * 
	 * ex : class Class { int attribut1; int attribut2;
	 * 
	 * m�thode(parametre1, parametre2) this.attribut1 = parametre1; this.attribut2 =
	 * parametre2; }
	 */

//5_constructeur et h�ritage

	/*
	 * La classe fille appelle LA (une seule possible) classe m�re ainsi : Class
	 * ClassFille extends ClassMere
	 * 
	 * la class fille doit partager au moins un constructeur avec la class m�re ca
	 * permet le polymorphisme et la construction de la sorte :
	 * 
	 * ClassMere f = new ClassFille();
	 * 
	 * ATTENTION : On ne peut pas r�cuperer les attributs de la classe m�re et les
	 * assigner dans la classe fille (contradictoire avec 6.3)
	 */

//6_super() et this

	/*
	 * Le mot cl� super repr�sente l'objet parent 
	 * de m�me le mot cl� this repr�sente l'objet de la class courante.
	 * 
	 * super ne s'utilise jamais seul, c'est soit: 
	 * 
	 * 1 -super() afin d'appeler le constructeur par d�faut du parent, 
	 * ce n'est pas oblig� de l'ajouter c'est implicite(ajout� par le compilo).
	 * 
	 * 2 -super(quelque chose) afin d'appeler le constructeur avec param�tre du
	 * parent
	 * 
	 * 3-super.maFonction() ou super.maVariable afin d'appeler explicitement une
	 * m�thode/variable d'instance du parent, uniquement n�cessaire pour sp�cifier
	 * explicitement qu'on veut utiliser celle du parent plut�t que celle de
	 * l'enfant. (c'est � mon avis une mauvaise pratique, mais il est bon de savoir
	 * que �a existe).
	 */

//7_class et m�thode abstraites

	/*
	 * une m�thode abstraite s'�crit de la facon qui suit : 
	 * public abstract void method(); 
	 * Il n'y a pas de {}
	 * 
	 * Une m�thode vide ne contenant rien dans {} n'est pas une m�thode abstraite
	 * 
	 * Une class abstraite ne contient pas forc�ment que des m�thodes abstraites 
	 * Une class abstraite peut contenir des attributs 
	 * A l'inverse, une class qui contient au moins une m�thode abstraite est une class abstraite
	 */

//8_m�thode static

	/*
	 * une m�thode static ne d�pend pas de l'objet mais de la classe elle m�me 
	 * ex : compteur d'objets cr��s
	 */

//9_Interface

	/*
	 * Une interface ne contient que des m�thodes abstraites 
	 * Quand on impl�mente une interface on utilise, dans la class, 
	 * TOUTES les m�thodes d�clar�es dans l'interface 
	 * 
	 * ex : un bouton d'un t�l�phone sert toujours � quelque chose, 
	 * il est toujours implement�
	 * 
	 * On peut impl�menter plusieurs interfaces dans une class
	 * 
	 * L'interet principal est de partager les m�mes noms de methodes via
	 * l'utilisation d'une interface commune
	 */

//10_Boucles

	// 10_1_For Each

		/*
	 	* Le for each fait une boucle pour chaque mon_objet de ma_collection La boucle
	 	* se construit de la mani�re suivante :
	 	* 
	 	* for (MonType mon_objet : ma_collection){ }
	 	*/

//11_Listes

		/*
	 	* Pour obtenir la longueur d'une liste, on utilise : maListe.size()
	 	*/

	// 11_1_Tri de liste d'objets

		/*
	 	* L'argument d'une liste est :
	 	* 
	 	* List<ArgumentListe> tab = new Arraylist<ArgumentListe>()
	 	* 
	 	* Pour trier une liste on peut utiliser : Collections.sort(list) 
	 	* La class ArgumentListe doit �tre implement�e par l'interface Comparable 
	 	* Et donc la m�thode compareTo(Object o) est red�finie dans la class 
	 	* 
	 	* ex : cf Cerclebis.java
	 	*/

	// 11_2_Iterator

		/*
	 	* Iterator est une interface et se d�clare dans la main :
	 	* 
	 	* Iterator<ArgumentListe> it = list.iterator();
	 	* 
	 	* Sa m�thode : it.next() permet d�avancer d'�l�ment en �l�ment, et retourne
	 	* l��l�ment qui a �t� saut�.
	 	* 
	 	* it.hasNext() est false si l�it�rateur arrive en fin de l�ensemble
	 	* while(it.hasNext()) permet donc de traiter les �l�ments 1 � 1 
	 	* 
	 	* ex : cf Main4.java
	 	*/

//12_Exceptions

		/*
	 	* Il faut d�clarer dans la m�thode les exceptions susceptibles de rencontrer
	 	* dans la m�thode par l'utilisation de :
	 	* 
	 	* public method() throws NomException1, NomException2, ... {
	 	* 
	 	* L'exception peut �tre soit �mise explicitement par : throw new
	 	* NomException(); soit par l'appel d'une deuxi�me m�thod() dans le corps de la
	 	* m�thod()
	 	* 
	 	* ex : cf EntNat.java
	 	*/

	// 12_1_try{}catch{}finally{}

		/*
	 	* On utilise le try{}catch(NomException e){}finally{} pour INTERCEPTER les
	 	* exceptions (choses qui n'est pas faite avec un simple throws)
	 	* 
	 	* Dans le try on met le code a tester, donc pouvant potentiellement contenir
	 	* l'exception
	 	* 
	 	* Dans le catch on code la r�action du programme si le try contient l'exception e
	 	* 
	 	* Dans le finally on code ce que l'on veut faire tourner que l'exception ait
	 	* lieu ou non
	 	* 
	 	* ex : cf EEEFF.java
	 	*/

//13_Scanner nextLine()

	/*
	 * La method nextLine de la class Scanner retourne la prochaine ligne. Or si on
	 * a pr�c�demment utilis� un autre scanner, on ajoute -souvent invisiblement- un /n
	 * 
	 * ex : sc.nextInt() et une entr�e de 12 revient � lui envoyer 12/n le scanner
	 * prend le 12 et laisse le /n le sc.nextLine() prend donc le /n comme l'entr�e
	 * attendue la technique pour �viter �a et de placer un sc.nextLine() vide suite
	 * � une entr�e
	 */

//14_return dans method()

	/*
	 * Le mot cl� return sert � quitter une m�thode et � retourner (d'ou le nom) � la m�thode appelante
	 * Rappel : La main est aussi une m�thode
	 */

//15_Binaire

	/*
	 * Les codes binaires sur 4 bites ne codent pas les chiffres de 0 � 15 mais les
	 * chiffres de -8 � 7 ex : 1111 = -1 et non pas 15 on peut comparer 1111 �
	 * 0111(=7) - 1000(=8) pour obtenir 15, on a donc 01111 (=15-0)
	 * 
	 * cf http://villemin.gerard.free.fr/Wwwgvmm/Numerati/BINAIRE/Negatif.htm
	 * 
	 * autre possibilit� : quand on code sur 4 bites, un 5e est rajout� en cach�
	 * pour le signe donc on coderait de -16 � 15. Pour 15 on �crit 1111 et
	 * l'ordinateur lit 01111. (PLUTOT 1ERE OPTION)
	 */

//16_Ecriture de fichiers

	/*
	 * FileOutputStream permet de creer des objets pour entrer des donn�es de type byte dans un fichier 
	 * DataOutputStream permet de creer des objets pour entrer des donn�es de type vari�s dans un fichier 
	 * Si on veut �crire un objet dans un fichier, cet objet doit �tre implement� par Serializable
	 */

//17_JDBC : connections SQL

		/*
	 	* Une connection se fait ainsi :
	 	* 
	 	* Connection conn = ConnectionUtils.getMySQLConnection(); 
	 	* cf : class ConnectionsUtils
	 	* 
	 	* On utilise un DriverManager pour cr�er les connections JAVA-SQL 
	 	* Statement permet de rentrer les requetes dans le workbench mySQL 
	 	* Le ResultSet stocke les donn�es SQL et peuvent �tre trait�es lignes par lignes 
	 	* dans java grace � un while(rs.next()) 
	 	* Le preparedStatement permet de ne pas entrer les requetes en dur. 
	 	* Il enregistre la requete et permet de set les valeurs apr�s 
	 	* 
	 	* cf : core/src/main/java/JDBC
	 	* 
	 	* JDBC peut se connecter � n'importe quelle base de donn�es
	 	*/

	// 17_1_ResultatSet rs

		/*
	 	* rs.next() traite la ligne suivante stock�e dans rs 
	 	* rs.absolute(x) traite la ligne x stock�e dans rs 
	 	* rs.last() traite la derniere ligne stock�e dans rs
	 	* rs.first() traite la premiere ligne stock�e dans rs 
	 	* rs.relative(x) traite la xi�me ligne apr�s celle selectionn�e au pr�alable
	 	*/

	// 17_2_R�cup�ration de l'id

		/*
	 	* On d�clare le preparedStatement ainsi : 
	 	* PreparedStatement pstm = conn.prepareStatement(String "requete  sql", Statement.RETURN_GENERATED_KEYS);
	 	* 
	 	* Puis lors de l'appel du pstm : ResultSet rs = pstm.getGeneratedKeys();
	 	*/

	// 17_3_executeUpdate() et executeQuery()

		/*
	 	* executeUpdate est utilis� pour les statements qui modifient la base de donn�es (INSERT/UPDATE/DELETE)
	 	* 
	 	* executeQuery est utilis� pour les statements qui r�cuperent des donn�es depuis la base de donn�es (SELECT)
	 	*/

	// 17_4_M�thode updateRow()

		/*
	 	* Elle permet d'actualiser les modifications r�alis�es avec des appels � updateXXX()
	 	* 
	 	* cf : core/jbdc/test
	 	*/

// 18_PrintStackTrace()

	/*
	 * affiche l'exception et l'�tat de la pile d'ex�cution au moment de son appel
	 */

// 19_Dates

	/*
	 * Pour ins�rer une date via un preparedStatement dans un fichiers SQL on
	 * utilise :
	 * 
	 * pstm.setDate(int a, new Date(nom_table.getStart_date().getTime())); 
	 * 
	 * cf : core/main/fr.formation.inti.dao/EmployeeDaoImpl
	 */

//20_Transaction

	   /*
	 	* Une transaction est un ensemble d'actions qui est effectu� en entier ou pas
	 	* du tout
	 	* 
	 	* En utilisant conn.setAutoCommit(false) on annule l'automatisme du transfert
	 	* de l'information vers SQL. L'ensemble des requetes est alors effectu� lorsque
	 	* l'on fait appel � la commande : connection.commit()
	 	* 
	 	* Si l'on insere un try-catch pour notre transaction, on peut ajouter dans le
	 	* catch un rollback qui annulera toutes les modifications effectu�es si une
	 	* exception est catch�e avant le commit()
	 	* 
	 	* ex : une commande au macdonald n'est commit que lorsque le paiement a �t� r�alis�
	 	*/

//21_JPA (Java Persistence API)

		/*
		 * Un objet de type EntityManagerFactory mod�lise notre unit� de persistance.
	 	 * C'est � partir de lui que l'on peut construire des objets de type
	 	 * EntityManager, qui nous permettent d'interagir avec la base.
	 	 * 
	 	 * Le EntityManager est reli� � EntityTransaction (et getTransaction)
	 	 * 
	 	 * cf : JPA/main/fr.formation.inti/App 
	 	 * cf : JPA/main/fr.formation.inti/App2
	 	 */

	// 21_1_Method et �tats des objets de JPA

		/*
		 * method persist()/remove()/merge()/refresh()/find() 
		 * persist stocke les donn�es qqpart
		 * remove supprime 
		 * merge modifie -> etat detached 
		 * objet.refresh rend � l'objet les valeurs dans la base de donn�es.
		 * refresh ne fonctionne que sur objets persistants 
		 * find cr�� un objet directement en �tat managed sans passer par l'�tat new
		 *
		 * etats new/managed/removed/detached 
		 * etat new cr�� mais non reli� � la base de donn�es
		 * etat managed (=persistant): objet dans base de donn�e 
		 * etat removed, le commit fait sauter la ligne 
		 * �tat detached : l'objet n'est plus persistant
	 	 *
	 	 * cf : JPA/main/fr.formation.inti/App2
	 	 */

	// 21_2_MappedBy

		/*
		 * YAHYA OSECOURS
		 */

	// 21_3_fetch

		/*
		 * Fetch s'utilise avec les @OneToMany, @ManyToOne et ManyToMany, 
		 * il peut prendre deux valeurs : 
		 * FetchType.LAZY : indique que la relation doit �tre charg�e � la demande ;
		 * FetchType.EAGER : indique que la relation doit �tre charg�e en m�me temps que l'entit� qui la porte.
		 * 
		 */
	
//dao : objet d'acc�s aux donn�es
//onetomany
//manytomany
//manytoone
	
//cascade : determine cycle de vie (entre un objet et ceux qui lui sont associ�s)
	//cf : voiture/passager

	
	/*
	 * Une servlet est une classe Java qui permet de cr�er dynamiquement des donn�es au sein d'un serveur HTTP.
	 * L'utilisation d'une servlet se fait par le biais d'un conteneur de servelet (framework) cot� serveur
	 * Apache Tomcat est un conteneur de servlets parmi d'autres
	 */
	
	
//tomcat
	//servlet
	//module web : war
//apache
//conteneur EJB
//API
//spring
//framework
	
//urlmapping
//jar
//jsp

//web.xml pour filtres
	
}
