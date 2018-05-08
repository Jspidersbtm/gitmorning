package com.bank.moneyexample;

public class Money {
	int value;
	String type;

	@Override
	public String toString() {
		return this.type + "->" + this.value;
	}

	public Money(int value, String type) {
		super();
		this.value = value;
		this.type = type;
	}

	public static void main(String[] args) {
		Money m1 = new Money(25, "Rupee");
		Money m2 = new Money(1, "Dollar");

		System.out.println(m1 + "\n" + m2);
	}

}
