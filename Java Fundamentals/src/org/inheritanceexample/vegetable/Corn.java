package org.inheritanceexample.vegetable;

public class Corn extends Vegetable {

	Corn() {
		super("Yellow", "Sweet");
	}

	void prepareSoup() {
		System.out.println("Corn soup");
	}

	void clean() {
		System.out.println("Peel the skin and dip in water");
	}
}
