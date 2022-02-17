package org.jdbc.control;

import java.time.LocalDate;

import org.jdbc.model.Person;

public class Application {

	public static void main(String[] args) {
		Person p01 = new Person("Mueller", "Max", 1984);

		System.out.println(p01);

		Person p02 = Person.builder().firstname("Moritz").lastname("Maerchen").build();

		System.out.println(p02);
	}

}
