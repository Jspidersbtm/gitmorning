package com.imc.mobilemanufacture;

public abstract class AbstractShoppingWebsite {
	abstract void addToCart();

	abstract void pay();

	abstract void compareProducts();

	void login() {
		System.out.println("User logged in with valid credentials");
	}
}
