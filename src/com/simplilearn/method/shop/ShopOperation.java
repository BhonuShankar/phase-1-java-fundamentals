package com.simplilearn.method.shop;

public class ShopOperation {

		public String shopName ="Apex Store";

		// show balance
		public double showStock(Product product) {
			if(product !=null) {
				return product.stock;
			}
			return 0;
		}

		// deposit amount
		public double buyStock(Product product, double noOfItems) {
			if(noOfItems>0) {
				product.stock += noOfItems;  // account.balance =  account.balance + amount;
				return product.stock;
			} else {
				System.out.println("Invalid noOfItems bought");
				return 0;
			}
		}


		// withdraw amount
		public double sellStock(Product product, double noOfItems) {
			if(noOfItems>0) {
				product.stock -= noOfItems;  // account.balance =  account.balance + amount;
				return product.stock;
			} else {
				System.out.println("Invalid noOfItems sold");
				return 0;
			}
		}
	}

