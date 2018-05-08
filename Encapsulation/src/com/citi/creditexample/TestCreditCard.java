package com.citi.creditexample;

public class TestCreditCard {
	public static void main(String[] args) {
		CreditCard c = new CreditCard();
		c.setCardNo(123456487974L);
		c.setNameOnCard("Raj");
		c.setCvv(456);

		System.out.println(c); // 456

		CreditCard c1 = new CreditCard();
		c1.setCvv(789);

		System.out.println(c1); // 789
	}
}
