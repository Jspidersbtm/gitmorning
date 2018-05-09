package com.imc.mobilemanufacture;

public class Amazon extends AbstractShoppingWebsite {

	@Override
	void addToCart() {
		System.out.println("Added products to amazon cart");
	}

	@Override
	void pay() {
		System.out.println("Amazon accepts payment");
	}

	@Override
	void compareProducts() {
		System.out.println("Compared the products on amazon");
	}

	void bookMovieTickets() {
		System.out.println("Booked the tickets on amazon");
	}

}
