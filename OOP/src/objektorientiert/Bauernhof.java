package objektorientiert;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Bauernhof {

	public static void main(String[] args) {
		Schwein s01 = new Schwein("Piggeldy", 9, 235);
		Schwein s02 = new Schwein("Fredderick", 4, 135);

		/**
		 * Programmieren mit Objekten
		 */
		System.out.println("\n\n--------------------Programmieren mit Objekten");
		System.out.println(s01);
		System.out.println(s01.getName() + " futtert");
		s01.setGewicht(s01.getGewicht() + 25);
		System.out.println(s01);

		/**
		 * Objektorientiertes Programmieren
		 */
		System.out.println("\n\n--------------------Objektorientiertes Programmieren");
		Kartoffel k01 = new Kartoffel("Linda", 42);
		Moehre m01 = new Moehre("BetaKarotinHelfer", 15);
		System.out.println(s02);
		System.out.println(k01);
		System.out.println(m01);
		s02.futtern(k01, 4);
		s02.futtern(m01, 2);
		s02.futtern(new Zuckerruebe(), 4);
		System.out.println(s02);
		System.out.println(k01);
		System.out.println(m01);

		/**
		 * Vererbung
		 */
		System.out.println("\n\n--------------------Vererbung");
		Ferkel f01 = new Ferkel("Pinki", 1, 23, "Nussbraun");
		System.out.println(f01);
		f01.futtern(new Kartoffel(), 4);
		f01.futtern(new Moehre(), 4);
		System.out.println(f01);
		f01.rumTollen();
		System.out.println(f01);
		Schwein f02 = new Ferkel("Hansi", 2, 42, "Gefleckt");
		System.out.println(f02);
		((Ferkel) f02).rumTollen();
		System.out.println(f02);

		/**
		 * Polymorphie
		 */
		System.out.println("\n\n--------------------Polymorphie");
		Schwein s03 = new Schwein();
		Kartoffel k05 = new Kartoffel();// Datentyp Kartoffel - Objekttyp Kartoffel
		AGemuese g01 = new Kartoffel();// Datentyp AGemuese - Objekttyp Kartoffel
		APflanze p01 = new Kartoffel();// Datentyp APFlanze - Objekttyp Kartoffel
		IFressbar if01 = new Kartoffel();// Datentyp IFressbar - Objekttyp Kartoffel
		Object o01 = new Kartoffel();// Datentyp Object - Objekttyp Kartoffel

		/**
		 * Wie wählen wir den Datentyp?
		 * 
		 * So allgemein wie möglich, jedoch so speziell wie nötig
		 */
		IFressbar o02 = new Kartoffel();

		System.out.println(o02.toString());
		s03.futtern(o02, 3);

		/**
		 * Arbeiten mit einer Liste als ArrayList
		 */
		List<String> liste = new ArrayList<>();
		
		/**
		 * Vorteile von Linkedlist verwenden
		 */
		liste = new LinkedList<String>(liste);
		
		
		/**
		 * Nun wieder auf Array aber Threadsafe
		 */
		liste = new Vector<String>(liste);
		
		/**
		 * Zurück zur ArrayList
		 */
		liste = new ArrayList<String>(liste);

	}

}
