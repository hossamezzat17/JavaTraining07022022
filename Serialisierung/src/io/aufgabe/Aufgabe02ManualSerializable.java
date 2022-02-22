package io.aufgabe;

import java.io.Serializable;

/**
 * Erweitern Sie die Klasse Getriebe:
 * 
 * Erstellen Sie alle nötigen Methoden, ohne die Klasse Zahnrad anzupassen, um
 * die Klasse Getriebe zu serialisieren.
 * 
 *
 * Bitte einmal Manuell Serialisieren und dann von der Klasse wieder
 * Deserialisieren lassen
 *
 */
public class Aufgabe02ManualSerializable {

	/**
	 * Die Klasse Zahnrad darf nicht mit implements java.io.Serializable versehen
	 * werden und soll auch sonst unverändert bleiben.
	 */
	static class Zahnrad {
		int zaehne;

		@Override
		public String toString() {
			return "Zahnrad [zaehne=" + zaehne + "]";
		}
	}

	/**
	 * Diese Klasse dürfen Sie anpassen, so wie es benötigt wird.
	 * 
	 * Jedoch nicht die Attribute entfernen.....:)
	 */
	static class Getriebe implements Serializable {
		public Zahnrad klein;
		public Zahnrad mittel;
		public Zahnrad gross;

	}

	public static void main(String[] args) {

	}
	
}
