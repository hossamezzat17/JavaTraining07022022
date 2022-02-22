package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo04HasA_notSerializable_Manual {

	/**
	 * Die Klasse CPU kann von uns nicht verändert werden.
	 */
	static class CPU {
		public String name;
		public long hz;

		public CPU() {
			System.out.println("CPU Default Konstruktor");
			this.name = "Schneider";
			this.hz = 1234;
		}

		@Override
		public String toString() {
			return "CPU [name=" + name + ", hz=" + hz + "]";
		}
	}

	/**
	 * 
	 * Die Klasse Computer darf von uns verändert werden.
	 *
	 */
	static class Computer implements Serializable {
		public String model;
		public transient CPU cpu;
		
		public Computer() {
		
		}

		@Override
		public String toString() {
			return "Computer [model=" + model + ", cpu=" + cpu + "]";
		}

	}

	public static void main(String[] args) throws Exception {
		String file = "./serializable/Computer02";
		
		Computer c01 = new Computer();
		c01.cpu = new CPU();
		c01.model = "Amstrad III";
		
		System.out.println(c01);
		
		computer2File(file, c01);
		
		Computer c02 = file2Computer(file);
		System.out.println(c02);
	}
	
	private static Computer file2Computer(String file) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Computer comp = (Computer)ois.readObject();
		
		/**
		 * Manuelle auslesen und zuweisen der weiteren Informationen aus der Datei
		 */
		CPU cpu01 = new CPU();
		cpu01.name = ois.readUTF();
		cpu01.hz = ois.readLong();
		System.out.println(ois.readUTF());
		comp.cpu = cpu01;
		
		ois.close();
		
		return comp;
	}
	
	private static void computer2File(String file, Computer comp) throws Exception  {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(comp);
		
		/**
		 * Nun müssen wir Informationen der CPU manuell auslesen und schreiben.
		 * 
		 * !!!WICHTIG!!! Die Reihenfolge müssen wir uns merken, für das auslesen.
		 */
		oos.writeUTF(comp.cpu.name);
		oos.writeLong(comp.cpu.hz);
		oos.writeUTF("Hallo Welt wie lernen Java IO");
		oos.close();
		System.out.println("Computer wurde Serialisiert");
	}

	private static Object file2Object(String file) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

		return ois.readObject();
	}

	private static void object2File(String file, Object obj) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(obj);
		oos.close();
		System.out.println("Objekt wurde Serialisiert");
	}
}
