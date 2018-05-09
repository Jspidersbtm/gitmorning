package com.imc.mobilemanufacture;

public class TestWebsites {
	public static void main(String[] args) {
		FlipKart f = new FlipKart();
		f.login();
		f.addToCart();
		f.compareProducts();
		f.pay();
		f.search();

		Amazon a = new Amazon();
		a.login();
		a.addToCart();
		a.compareProducts();
		a.pay();
		a.bookMovieTickets();

		AbstractShoppingWebsite asw = new Amazon();
		asw.login();
		asw.addToCart();
		asw.compareProducts();
		asw.pay();
		if (asw instanceof FlipKart) {
			FlipKart fl = (FlipKart) asw;
			fl.search();
		} else if (asw instanceof Amazon) {
			Amazon am = (Amazon) asw;
			am.bookMovieTickets();
		}

	}
}
