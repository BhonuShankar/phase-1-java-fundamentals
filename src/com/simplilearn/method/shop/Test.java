package com.simplilearn.method.shop;

public class Test {

	public static void main(String[] args) {


			// create a ccount object
			Product product = new Product(2, 500, "Lux");

			// create a BankOperation object
			ShopOperation opr = new ShopOperation();

			System.out.println("Welcome to the Shop :: '"+ opr.shopName+ " ' ");

			System.out.println("The Product stock : " + opr.showStock(product));

			System.out.println("The product stock after purchase: "+opr.buyStock(product,100));
			System.out.println("The product stock after purchase: "+opr.buyStock(product,50));


			System.out.println("The product stock after sell: "+opr.sellStock(product,50));
			System.out.println("The product stock after sell: "+opr.sellStock(product,100));

		}
	}

