package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class CreatingObject {
	public static void main(String[] args) {
		Person p1;// created a reference variable-8 bytes
		p1 = new Person();
		System.out.println("Name is " + p1.name);
		System.out.println("Age is " + p1.age);
	}
}
