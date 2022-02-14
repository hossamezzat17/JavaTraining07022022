package objektorientiert;

public class Bauernhof {

	public static void main(String[] args) {
		Schwein s01 = new Schwein("Piggeldy",9,235);
		Schwein s02 = new Schwein("Fredderick",4,135);
		
		/**
		 * Programmieren mit Objekten
		 */
		System.out.println(s01);
		System.out.println(s01.getName() + " futtert");
		s01.setGewicht(s01.getGewicht()+25);
		System.out.println(s01);
		
		/**
		 * Objektorientiertes Programmieren
		 */
		Kartoffel k01 = new Kartoffel("Linda", 42);
		Moehre m01 = new Moehre("BetaKarotinHelfer", 15);
		System.out.println(s02);
		System.out.println(k01);
		System.out.println(m01);
		s02.futtern(k01);
		s02.futtern(m01);
		System.out.println(s02);
		System.out.println(k01);
		System.out.println(m01);
		
		/**
		 * Vererbung
		 */
		Ferkel f01 = new Ferkel("Pinki", 1, 23, "Nussbraun");
		System.out.println(f01);
		f01.futtern(new Kartoffel());
		f01.futtern(new Moehre());
		System.out.println(f01);
		f01.rumTollen();
		System.out.println(f01);
		Schwein f02 = new Ferkel("Hansi",2,42,"Gefleckt");
		System.out.println(f02);
		((Ferkel)f02).rumTollen();
		System.out.println(f02);
	}
	
}
