package com.brillio.training.entity;

public class Product {
	// fields(member variables in a class)
	private int id;
	private String name;
	private String description;
	private double price;
	private int unitsInStock;

	// default constructor is added as a best practice
	public Product() {
		// TODO Auto-generated constructor stub
	}

	// overloaded constructor or parameterized constructor
	// helps creating objects with initial custom values

	public Product(int id, String name, String description, double price, int unitsInStock) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.unitsInStock = unitsInStock;
	}

	// getter property(accessor)
	public int getId() {
		return id;
	}

	// setter property(mutator)
	public void setId(int id) {
		if (id <= 0) {
			throw new RuntimeException("Invalid ID");
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", unitsInStock=" + unitsInStock + "]";
	}

}
