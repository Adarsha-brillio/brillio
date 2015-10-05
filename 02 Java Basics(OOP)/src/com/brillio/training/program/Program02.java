package com.brillio.training.program;

import com.brillio.training.entity.*;

public class Program02 {
	public static void main(String[] args) {
		Category c1 = new Category(10, "Beverages", "Drinkable tea,coffee,etc");
		Product p1 = new Product(12, "Chai", 18.5);
		p1.setCategory(c1);
		System.out.println(p1);
		System.out.println(p1.getCategory());
	}
}
