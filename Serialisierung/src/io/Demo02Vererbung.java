package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal() {
		System.out.println("Animal Default Konstruktor");
	}

	public Animal(String name) {
		this.setName(name);
	}

	@Override
	public String toString() {
		return "Animal [getName()=" + getName() + "]";
	}

}

class Dog extends Animal implements Serializable {

	private static final long serialVersionUID = 4586939220516204693L;

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog() {
		super("Rex");
		System.out.println("Konstruktor von DOG");
	}

	@Override
	public String toString() {
		return "Dog [ getName()= " + getName() + " : getAge()=" + getAge() + "]";
	}

}

public class Demo02Vererbung {

	public static void main(String[] args) throws Exception {
		String file = "./serializable/d01";

		Dog d01 = new Dog();
		d01.setAge(12);
		d01.setName("Hasso");

		System.out.println("vor dem serialisieren :" + d01);

		/**
		 * serialisieren
		 */
		object2File(file, d01);

		/**
		 * Deserialisieren
		 */
		Dog d02 = (Dog) file2Object(file);
		System.out.println("nach dem serialisieren :" +d02);
	}

	private static Object file2Object(String file) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

		return ois.readObject();// Dies geht schief
	}

	private static void object2File(String file, Dog d01) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(d01);
		oos.close();
		System.out.println("Objekt wurde Serialisiert");
	}

}
