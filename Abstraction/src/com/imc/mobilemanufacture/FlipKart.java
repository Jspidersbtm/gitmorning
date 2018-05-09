package com.imc.mobilemanufacture;

public class FlipKart extends AbstractShoppingWebsite {

	@Override
	void addToCart() {
		System.out.println("Added products to flipkart's cart");
	}

	@Override
	void pay() {
		System.out.println("Made payment to flipkart");
	}

	@Override
	void compareProducts() {
		System.out.println("Comparing products on flipkart");
	}

	void search() {
		System.out.println("Flipkart allows to search products");
	}
}
