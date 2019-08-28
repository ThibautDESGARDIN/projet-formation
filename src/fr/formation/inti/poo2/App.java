package fr.formation.inti.poo2;

public class App {

	public static void main(String[] args) {

		Telephone tlf = new Telephone();
		Poisson truite = new Poisson("truite", "argenté", true, 30);
		Poisson castagnolle = new Poisson("catagnolle", "noir", true, 10);
		Poisson requin = new Poisson();

		String nom1 = truite.getNom();
		System.out.println(nom1);

		tlf.setAnnee(2011);
		tlf.setMarque("Huawei");
		System.out.println(tlf.getAnnee());

		requin.setNom("requin");
		requin.setCouleur("gris");
		boolean reqrayures = false;
		requin.setRayures(reqrayures);
		requin.setTaille(150);

		System.out.println(requin.toString());

	}

}
