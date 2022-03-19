package com.simplilearn.method.shop;

public class Product {

	public long productId;
	public double stock;
	public String productName;

	// non parameterized constructor
	public Product() {}

	//  parameterized constructor : initialize all data variable of class
	public Product(long productId, double stock, String productName) {
		this.productId = productId;
		this.stock = stock;
		this.productName = productName;
	}
}

