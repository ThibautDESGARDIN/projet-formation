package fr.formation.archives.inti;

public class Cours {

//						SOMMAIRE
//	
//	1_polymorphisme										47
//	2_redéfinir une méthode								58
//	3_surcharger une méthode							72		
//	4_nuances : attributs et paramètres					84
//	5_constructeur et héritage							103
//	6_super() et this									120
//	7_class et méthode abstraites						139
//	8_méthode static									155
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
//		17_2_Récupération de l'id						348
//		17_3_executeUpdate()							359
// 	18_PritnStackTrace()								369
//	19_Dates											377

//===========================================================================================================================================

//1_polymorphisme

	/*
	 * un objet peut avoir plusieurs formes le polymorphisme est lié à l'héritage
	 * une classe fille a sa forme et celle de la classe mère ex : le chien est un
	 * chien mais aussi un animal
	 */

//2_redéfinir une méthode

	/*
	 * rappelle une méthode depuis la classe mère même si aucune modification n'est
	 * apportée, si elle est rappelé il s'agit d'une redéfinition 
	 * lorsque objet.méthode est appelée, le programme va chercher la méthode, 
	 * il la trouve dans la classe fille
	 * 
	 * ATTENTION : On ne peut pas redéfinir une méthode qui est private dans la
	 * classe mère On peut étendre la visibilité de la méthode (ex : from protected
	 * to public) On ne peut pas réduire la visibilité de la méthode (ex : from
	 * public to protected)
	 */

//3_surcharger une méthode

	/*
	 * dans la classe fille, on surcharge les parametres 
	 * la méthode dans la classe fille dépend de plus de paramètres que dans la classe mère 
	 * ex : pour une méthode manger() dans la classe mère, 
	 * elle devient manger(String str) dans la classe fille
	 * 
	 * ATTENTION : cf. Redéfinir une méthode
	 */

//4_nuances : attributs et paramètres

	/*
	 * les attributs sont définis dans la class les paramètres sont attribués à une
	 * méthode
	 * 
	 * ex : class Class { int attribut1; int attribut2;
	 * 
	 * méthode(parametre1, parametre2) this.attribut1 = parametre1; this.attribut2 =
	 * parametre2; }
	 */

//5_constructeur et héritage

	/*
	 * La classe fille appelle LA (une seule possible) classe mère ainsi : Class
	 * ClassFille extends ClassMere
	 * 
	 * la class fille doit partager au moins un constructeur avec la class mère ca
	 * permet le polymorphisme et la construction de la sorte :
	 * 
	 * ClassMere f = new ClassFille();
	 * 
	 * ATTENTION : On ne peut pas récuperer les attributs de la classe mère et les
	 * assigner dans la classe fille (contradictoire avec 6.3)
	 */

//6_super() et this

	/*
	 * Le mot clé super représente l'objet parent 
	 * de même le mot clé this représente l'objet de la class courante.
	 * 
	 * super ne s'utilise jamais seul, c'est soit: 
	 * 
	 * 1 -super() afin d'appeler le constructeur par défaut du parent, 
	 * ce n'est pas obligé de l'ajouter c'est implicite(ajouté par le compilo).
	 * 
	 * 2 -super(quelque chose) afin d'appeler le constructeur avec paramètre du
	 * parent
	 * 
	 * 3-super.maFonction() ou super.maVariable afin d'appeler explicitement une
	 * méthode/variable d'instance du parent, uniquement nécessaire pour spécifier
	 * explicitement qu'on veut utiliser celle du parent plutôt que celle de
	 * l'enfant. (c'est à mon avis une mauvaise pratique, mais il est bon de savoir
	 * que ça existe).
	 */

//7_class et méthode abstraites

	/*
	 * une méthode abstraite s'écrit de la facon qui suit : 
	 * public abstract void method(); 
	 * Il n'y a pas de {}
	 * 
	 * Une méthode vide ne contenant rien dans {} n'est pas une méthode abstraite
	 * 
	 * Une class abstraite ne contient pas forcément que des méthodes abstraites 
	 * Une class abstraite peut contenir des attributs 
	 * A l'inverse, une class qui contient au moins une méthode abstraite est une class abstraite
	 */

//8_méthode static

	/*
	 * une méthode static ne dépend pas de l'objet mais de la classe elle même 
	 * ex : compteur d'objets créés
	 */

//9_Interface

	/*
	 * Une interface ne contient que des méthodes abstraites 
	 * Quand on implémente une interface on utilise, dans la class, 
	 * TOUTES les méthodes déclarées dans l'interface 
	 * 
	 * ex : un bouton d'un téléphone sert toujours à quelque chose, 
	 * il est toujours implementé
	 * 
	 * On peut implémenter plusieurs interfaces dans une class
	 * 
	 * L'interet principal est de partager les mêmes noms de methodes via
	 * l'utilisation d'une interface commune
	 */

//10_Boucles

	// 10_1_For Each

		/*
	 	* Le for each fait une boucle pour chaque mon_objet de ma_collection La boucle
	 	* se construit de la manière suivante :
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
	 	* La class ArgumentListe doit être implementée par l'interface Comparable 
	 	* Et donc la méthode compareTo(Object o) est redéfinie dans la class 
	 	* 
	 	* ex : cf Cerclebis.java
	 	*/

	// 11_2_Iterator

		/*
	 	* Iterator est une interface et se déclare dans la main :
	 	* 
	 	* Iterator<ArgumentListe> it = list.iterator();
	 	* 
	 	* Sa méthode : it.next() permet d’avancer d'élément en élément, et retourne
	 	* l’élément qui a été sauté.
	 	* 
	 	* it.hasNext() est false si l’itérateur arrive en fin de l’ensemble
	 	* while(it.hasNext()) permet donc de traiter les éléments 1 à 1 
	 	* 
	 	* ex : cf Main4.java
	 	*/

//12_Exceptions

		/*
	 	* Il faut déclarer dans la méthode les exceptions susceptibles de rencontrer
	 	* dans la méthode par l'utilisation de :
	 	* 
	 	* public method() throws NomException1, NomException2, ... {
	 	* 
	 	* L'exception peut être soit émise explicitement par : throw new
	 	* NomException(); soit par l'appel d'une deuxième méthod() dans le corps de la
	 	* méthod()
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
	 	* Dans le catch on code la réaction du programme si le try contient l'exception e
	 	* 
	 	* Dans le finally on code ce que l'on veut faire tourner que l'exception ait
	 	* lieu ou non
	 	* 
	 	* ex : cf EEEFF.java
	 	*/

//13_Scanner nextLine()

	/*
	 * La method nextLine de la class Scanner retourne la prochaine ligne. Or si on
	 * a précédemment utilisé un autre scanner, on ajoute -souvent invisiblement- un /n
	 * 
	 * ex : sc.nextInt() et une entrée de 12 revient à lui envoyer 12/n le scanner
	 * prend le 12 et laisse le /n le sc.nextLine() prend donc le /n comme l'entrée
	 * attendue la technique pour éviter ça et de placer un sc.nextLine() vide suite
	 * à une entrée
	 */

//14_return dans method()

	/*
	 * Le mot clé return sert à quitter une méthode et à retourner (d'ou le nom) à la méthode appelante
	 * Rappel : La main est aussi une méthode
	 */

//15_Binaire

	/*
	 * Les codes binaires sur 4 bites ne codent pas les chiffres de 0 à 15 mais les
	 * chiffres de -8 à 7 ex : 1111 = -1 et non pas 15 on peut comparer 1111 à
	 * 0111(=7) - 1000(=8) pour obtenir 15, on a donc 01111 (=15-0)
	 * 
	 * cf http://villemin.gerard.free.fr/Wwwgvmm/Numerati/BINAIRE/Negatif.htm
	 * 
	 * autre possibilité : quand on code sur 4 bites, un 5e est rajouté en caché
	 * pour le signe donc on coderait de -16 à 15. Pour 15 on écrit 1111 et
	 * l'ordinateur lit 01111. (PLUTOT 1ERE OPTION)
	 */

//16_Ecriture de fichiers

	/*
	 * FileOutputStream permet de creer des objets pour entrer des données de type byte dans un fichier 
	 * DataOutputStream permet de creer des objets pour entrer des données de type variés dans un fichier 
	 * Si on veut écrire un objet dans un fichier, cet objet doit être implementé par Serializable
	 */

//17_JDBC : connections SQL

		/*
	 	* Une connection se fait ainsi :
	 	* 
	 	* Connection conn = ConnectionUtils.getMySQLConnection(); 
	 	* cf : class ConnectionsUtils
	 	* 
	 	* On utilise un DriverManager pour créer les connections JAVA-SQL 
	 	* Statement permet de rentrer les requetes dans le workbench mySQL 
	 	* Le ResultSet stocke les données SQL et peuvent être traitées lignes par lignes 
	 	* dans java grace à un while(rs.next()) 
	 	* Le preparedStatement permet de ne pas entrer les requetes en dur. 
	 	* Il enregistre la requete et permet de set les valeurs après 
	 	* 
	 	* cf : core/src/main/java/JDBC
	 	* 
	 	* JDBC peut se connecter à n'importe quelle base de données
	 	*/

	// 17_1_ResultatSet rs

		/*
	 	* rs.next() traite la ligne suivante stockée dans rs 
	 	* rs.absolute(x) traite la ligne x stockée dans rs 
	 	* rs.last() traite la derniere ligne stockée dans rs
	 	* rs.first() traite la premiere ligne stockée dans rs 
	 	* rs.relative(x) traite la xième ligne après celle selectionnée au préalable
	 	*/

	// 17_2_Récupération de l'id

		/*
	 	* On déclare le preparedStatement ainsi : 
	 	* PreparedStatement pstm = conn.prepareStatement(String "requete  sql", Statement.RETURN_GENERATED_KEYS);
	 	* 
	 	* Puis lors de l'appel du pstm : ResultSet rs = pstm.getGeneratedKeys();
	 	*/

	// 17_3_executeUpdate() et executeQuery()

		/*
	 	* executeUpdate est utilisé pour les statements qui modifient la base de données (INSERT/UPDATE/DELETE)
	 	* 
	 	* executeQuery est utilisé pour les statements qui récuperent des données depuis la base de données (SELECT)
	 	*/

	// 17_4_Méthode updateRow()

		/*
	 	* Elle permet d'actualiser les modifications réalisées avec des appels à updateXXX()
	 	* 
	 	* cf : core/jbdc/test
	 	*/

// 18_PrintStackTrace()

	/*
	 * affiche l'exception et l'état de la pile d'exécution au moment de son appel
	 */

// 19_Dates

	/*
	 * Pour insérer une date via un preparedStatement dans un fichiers SQL on
	 * utilise :
	 * 
	 * pstm.setDate(int a, new Date(nom_table.getStart_date().getTime())); 
	 * 
	 * cf : core/main/fr.formation.inti.dao/EmployeeDaoImpl
	 */

//20_Transaction

	   /*
	 	* Une transaction est un ensemble d'actions qui est effectué en entier ou pas
	 	* du tout
	 	* 
	 	* En utilisant conn.setAutoCommit(false) on annule l'automatisme du transfert
	 	* de l'information vers SQL. L'ensemble des requetes est alors effectué lorsque
	 	* l'on fait appel à la commande : connection.commit()
	 	* 
	 	* Si l'on insere un try-catch pour notre transaction, on peut ajouter dans le
	 	* catch un rollback qui annulera toutes les modifications effectuées si une
	 	* exception est catchée avant le commit()
	 	* 
	 	* ex : une commande au macdonald n'est commit que lorsque le paiement a été réalisé
	 	*/

//21_JPA (Java Persistence API)

		/*
		 * Un objet de type EntityManagerFactory modélise notre unité de persistance.
	 	 * C'est à partir de lui que l'on peut construire des objets de type
	 	 * EntityManager, qui nous permettent d'interagir avec la base.
	 	 * 
	 	 * Le EntityManager est relié à EntityTransaction (et getTransaction)
	 	 * 
	 	 * cf : JPA/main/fr.formation.inti/App 
	 	 * cf : JPA/main/fr.formation.inti/App2
	 	 */

	// 21_1_Method et états des objets de JPA

		/*
		 * method persist()/remove()/merge()/refresh()/find() 
		 * persist stocke les données qqpart
		 * remove supprime 
		 * merge modifie -> etat detached 
		 * objet.refresh rend à l'objet les valeurs dans la base de données.
		 * refresh ne fonctionne que sur objets persistants 
		 * find créé un objet directement en état managed sans passer par l'état new
		 *
		 * etats new/managed/removed/detached 
		 * etat new créé mais non relié à la base de données
		 * etat managed (=persistant): objet dans base de donnée 
		 * etat removed, le commit fait sauter la ligne 
		 * état detached : l'objet n'est plus persistant
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
		 * FetchType.LAZY : indique que la relation doit être chargée à la demande ;
		 * FetchType.EAGER : indique que la relation doit être chargée en même temps que l'entité qui la porte.
		 * 
		 */
	
//dao : objet d'accès aux données
//onetomany
//manytomany
//manytoone
	
//cascade : determine cycle de vie (entre un objet et ceux qui lui sont associés)
	//cf : voiture/passager

	
	/*
	 * Une servlet est une classe Java qui permet de créer dynamiquement des données au sein d'un serveur HTTP.
	 * L'utilisation d'une servlet se fait par le biais d'un conteneur de servelet (framework) coté serveur
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
