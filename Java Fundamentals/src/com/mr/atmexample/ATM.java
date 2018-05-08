package com.mr.atmexample;

public class ATM {
	
	Money withDraw(Card c, int pin) {
		Money m = new Money();
		return m;
	}

	public static void main(String[] args) {
		ATM a = new ATM();
		Card c = new Card();
		Money paisa = a.withDraw(c, 1234);
	}
}
