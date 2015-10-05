package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program04 {
	public static void main(String[] args) {
		// persons is not a reference to a Person objects
		// but it is a reference to an array of Person objects
		Person[] persons;

		persons = new Person[3];
		persons[0] = new Person(1, "Adarsha N", "Tarikere");
		persons[1] = new Person(2, "Aparna M", "Hassan");
		persons[2] = new Person(3, "Sumanth U", "Mysore");

		for (Person p1 : persons) {
			System.out.println(p1);
		}

		Person[] persons2 = { new Person(), new Person(7788, "John Cena", "New York"),
				new Person(7788, "The Great Khali", "Punjab") };
		// This is not allocation of space for person objects
		// This is a space for 3 references of Person type
		// equivalent of creating - Person p1,p2,p3

		Person[] per = new Person[3];

		// must create a person object before using it for invoking methods

		// this line is equivalent to null.setId(4)
		// and will throw an exception of type NullPointerException

		per[0].setId(4);
		per[1].setName("Adarsha N");
		per[2].setCity("Bangalore");

		System.out.println(per[0]);

	}
}
