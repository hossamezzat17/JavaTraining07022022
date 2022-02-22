package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import io.data.Teilnehmer;

/**
 * @Java-Beans-Conventions Damit aus einem POJO eine Javabean oder Bean wird,
 *                         müssen folgende Mindestanforderungen erfüllt sein:
 * 
 *                         Alle Attribute ohne Ausnahme privat
 * 
 *                         Für Modifizierbare Eigenschaften öffentliche
 *                         Getter/Setter
 * 
 *                         Ein Standard Konstruktor
 * 
 *                         Das Interface Serializable muss implementiert werden.
 * 
 * @SERIALISIEREN
 * 
 * @Hinweise Damit ein Objekt serialisiert werden kann:
 * 
 *           - Die Klasse muss 'Serializable' implementieren
 * 
 *           - Alle Attribute müssen entweder primitiv sein oder auch
 *           Serializable bzw. Transient
 * 
 *           - Attribute aus der Nicht-Serializable Basisklasse werden beim
 *           Serialisieren übersprungen
 * 
 *           - Transiente Attribute werden beim Serialisieren übersprungen
 * 
 * @writeObject (Object obj) serialisiert nur das Objekt. Statische Elemente der
 *              Klasse werden nicht mitserialisiert
 * 
 * @DESERIALISIEREN
 * 
 * @readObject() Beim Deserialisieren wird kein Konstruktor der
 *               Serializable-Klasse aufgerufen, ABER der default-Konstruktor
 *               der Nicht-Serializable Basisklasse(Elternklasse).
 * 
 *               Also: !!!Die nichtserialisierbare Basisklasse muss einen
 *               default-Konstruktor haben!!!
 */
public class Demo01Rules {

	public static void main(String[] args) throws Exception {
		String file = "./serializable/t01.ser";
//		Teilnehmer t01 = new Teilnehmer();
//		t01.setName("Christian");
//		t01.setAlter(99);
//		serialisieren(file, t01);
		deserialisieren(file);
	}

	private static void deserialisieren(String file) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));) {

			Teilnehmer t01 = (Teilnehmer) ois.readObject();
			System.out.println("nach dem Deserialisieren");
			System.out.println(t01);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void serialisieren(String file, Teilnehmer teilnehmer) {

		System.out.println(teilnehmer);
		System.out.println("Vor dem Serialisieren");

		try (OutputStream os = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(os);) {
			oos.writeObject(teilnehmer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
