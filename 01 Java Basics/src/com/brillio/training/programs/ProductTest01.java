package com.brillio.training.programs;

import com.brillio.training.entity.Product;

public class ProductTest01 {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(123);
		p1.setName("Adarsha N");
		p1.setDescription("Show Stopper");
		p1.setPrice(50.0);
		p1.setUnitsInStock(1);

		Product p2 = new Product(78, "Aparna", "Mysore", 75.0, 3);
		System.out.println(p1);
		System.out.println(p2);
	}
}