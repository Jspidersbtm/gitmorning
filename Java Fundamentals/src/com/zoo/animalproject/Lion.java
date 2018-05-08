package com.zoo.animalproject;

public class Lion extends Animal {
	void attack() {
		System.out.println("Lion attack");
	}

	Lion(String color, String type) {
		super(color, type);
	}
}
