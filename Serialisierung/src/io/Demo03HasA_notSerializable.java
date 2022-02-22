package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo03HasA_notSerializable {

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
		String file = "./serializable/Computer01";
		
		Computer c01 = new Computer();
		c01.cpu = new CPU();
		c01.model = "Amstrad III";
		
		System.out.println(c01);
		
		object2File(file, c01);
		
		Object deserialized = file2Object(file);
		System.out.println(deserialized);
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
