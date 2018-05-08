package org.inheritanceexample.vegetable;

public class Capsicum extends Vegetable {

	Capsicum() {
		super("Green", "spicy");
	}

	void preparePizza() {
		System.out.println("Capsicum pizza");
	}

	void clean() {
		System.out.println("dip in water");
	}
}
